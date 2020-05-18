import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDao {
    private DBConn db;

    public ClienteDao() throws SQLException {
        this.db = new DBConn("192.168.1.199", "3306", "tienda", "usu", "123");
    }

    public Boolean insertarCliente(Cliente cliente) throws SQLException {
        String consulta = "INSERT INTO cliente (nombre,dni) VALUES('" + cliente.getNombre() + "','" + cliente.getDni() + "')";
        //System.out.println(consulta);
        db.queryUpdate(consulta);
        String consulta2 = "SELECT * FROM cliente WHERE nombre = '" + cliente.getNombre() + "' AND dni = '" + cliente.getDni()+"'";
        ResultSet resultado = db.query(consulta2);
        if (resultado.next() == true) {
            int id = resultado.getInt("id");
            cliente.setId(id);
            return true;
        } else {
            return false;
        }
    }

    public void actualizarCliente(Cliente cliente) throws SQLException {
        String consulta="UPDATE cliente SET nombre ='"+cliente.getNombre()+"', dni= '"+cliente.getDni()+"' WHERE id= "+cliente.getId();
        System.out.println(consulta);
        db.queryUpdate(consulta);
    }


    public boolean borrarCliente(Cliente cliente) throws SQLException {
        String delete = "DELETE FROM cliente WHERE id =" + cliente.getId();
        int borrado = db.queryUpdate(delete);
        if (borrado == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Cliente> consultarClientes() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String consulta = "SELECT * FROM cliente";
        ResultSet resultado = db.query(consulta);
        while (resultado.next() == true) {

            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String dni = resultado.getString("dni");
            Cliente cliente = new Cliente(nombre,dni,id);
            clientes.add(cliente);
        }
        return clientes;
    }


}
