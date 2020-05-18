import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorTienda implements ActionListener {

    public final static String NUEVOCLIENTE = "NUEVOCLIENTE";
    public final static String BORRAR = "BORRAR";
    public final static String ACTUALIZAR = "ACTUALIZAR";
    public final static String NUEVACOMPRA = "NUEVACOMPRA";

    private Tienda tienda;
    private Vista vista;

    public ControladorTienda(Tienda tienda, Vista vista) throws SQLException {
        this.tienda = tienda;
        this.vista = vista;

        ArrayList<Cliente> clientes = tienda.getClientes();
        vista.cargarListaClientes(clientes);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            String comando = actionEvent.getActionCommand();
            if (comando.equals(NUEVOCLIENTE)) {
                DialogoClienteDatos datos = new DialogoClienteDatos();

                DialogoCliente dialogo = new DialogoCliente(datos);
                dialogo.pack();
                dialogo.setTitle("nuevo cliente");
                dialogo.setLocationRelativeTo(vista.getPanelMain());
                dialogo.setVisible(true); // Hasta que no se oculta el diálogo, la ejecución se queda parada aquí.

                if (datos.isPulsadoOk() == true) {
                    String nombreIntroducido = datos.getNombre();
                    String dniIntroducido = datos.getDni();
                    Cliente cliente = new Cliente(nombreIntroducido, dniIntroducido);

                    tienda.introducirCLiente(cliente);
                    vista.cargarListaClientes(tienda.getClientes());

                }
            } else if (comando.equals(ACTUALIZAR)) {
                DialogoClienteDatos datos = new DialogoClienteDatos();
                Cliente clienteSeleccionado=vista.getClienteSeleccionado();
                DialogoCliente dialogo = new DialogoCliente(datos);
                dialogo.cargarDatos(clienteSeleccionado);
                dialogo.pack();
                dialogo.setTitle("actualizar cliente");
                dialogo.setLocationRelativeTo(vista.getPanelMain());
                dialogo.setVisible(true); // Hasta que no se oculta el diálogo, la ejecución se queda parada aquí.

                if (datos.isPulsadoOk() == true) {
                    String nombreIntroducido = datos.getNombre();
                    String dniIntroducido = datos.getDni();
                    clienteSeleccionado.setNombre(nombreIntroducido);
                    clienteSeleccionado.setDni(dniIntroducido);

                    tienda.actualizarCliente(clienteSeleccionado);
                    vista.cargarListaClientes(tienda.getClientes());

                }
            }else if (comando.equals(BORRAR)){
                DialogoBorrarDatos datos=new DialogoBorrarDatos();
                DialogoBorrar dialogo=new DialogoBorrar(datos);
                dialogo.pack();
                dialogo.setTitle("borrar cliente");
                dialogo.setLocationRelativeTo(vista.getPanelMain());
                dialogo.setVisible(true); // Hasta que no se oculta el diálogo, la ejecución se queda parada aquí.

                if(datos.isPulsadoOK()==true){
                    tienda.borrarCliente(vista.getClienteSeleccionado());
                    vista.cargarListaClientes(tienda.getClientes());
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}