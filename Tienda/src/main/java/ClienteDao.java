import java.sql.ResultSet;
import java.sql.SQLException;

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


}
