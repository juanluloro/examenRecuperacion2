import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Vista {
    private JList listClientes;
    private JButton buttonNuevoCLiente;
    private JButton buttonBorrarCliente;
    private JButton buttonNuevaCompra;
    private JButton buttonActualizarCliente;
    private JTextField textFieldTotal;
    private JTextArea textAreaCompras;
    private JPanel panelMain;

    private DefaultListModel<Cliente>listModel;

    public Vista() {
        listModel=new DefaultListModel<>();
        listClientes.setModel(listModel);
    }

    public JPanel getPanelMain() {
        return panelMain;
    }
    public void setControlador(ActionListener actionListener) {
        buttonNuevoCLiente.addActionListener(actionListener);
        buttonNuevoCLiente.setActionCommand(ControladorTienda.NUEVOCLIENTE);

        buttonBorrarCliente.addActionListener(actionListener);
        buttonBorrarCliente.setActionCommand(ControladorTienda.BORRAR);

        buttonNuevaCompra.addActionListener(actionListener);
        buttonNuevaCompra.setActionCommand(ControladorTienda.NUEVACOMPRA);

        buttonActualizarCliente.addActionListener(actionListener);
        buttonActualizarCliente.setActionCommand(ControladorTienda.ACTUALIZAR);

    }

    public void cargarListaClientes(ArrayList<Cliente>clientes){
        listModel.clear();
        listModel.addAll(clientes);

    }

    public Cliente getClienteSeleccionado(){
        Cliente cliente=(Cliente)listClientes.getSelectedValue();
    return cliente;
    }

}
