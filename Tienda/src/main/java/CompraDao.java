import java.sql.ResultSet;
import java.sql.SQLException;

public class CompraDao {
    private DBConn db;

    public CompraDao() throws SQLException {
        this.db = new DBConn("192.168.1.199", "3306", "tienda", "usu", "123");
    }


    public Boolean insertarCompra(Compra compra) throws SQLException {
        String consulta = "INSERT INTO compra (producto,precio,id_cliente) VALUES('" + compra.getProducto() + "'," + compra.getPrecio()+"," + compra.getId_cliente()+")";
        System.out.println(consulta);
        db.queryUpdate(consulta);
        String consulta2 = "SELECT * FROM compra WHERE producto = '" + compra.getProducto() + "' AND precio = " + compra.getPrecio()+ " AND id_cliente ="+compra.getId_cliente();
        System.out.println(consulta2);
        ResultSet resultado = db.query(consulta2);
        if (resultado.next() == true) {
            int id = resultado.getInt("id");
            compra.setId(id);
            return true;
        } else {
            return false;
        }
    }


    public void consultarCompras(Cliente cliente){

    }
}
