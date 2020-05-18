import java.sql.SQLException;
import java.util.ArrayList;

public class Tienda {
    private CompraDao compraDao;
    private ClienteDao clienteDao;


    public Tienda(CompraDao compraDao, ClienteDao clienteDao) {
        this.compraDao = compraDao;
        this.clienteDao = clienteDao;
    }

    public CompraDao getCompraDao() {
        return compraDao;
    }

    public void setCompraDao(CompraDao compraDao) {
        this.compraDao = compraDao;
    }

    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "compraDao=" + compraDao +
                ", clienteDao=" + clienteDao +
                '}';
    }


    public void mostrarClientesYCompras() throws SQLException {
        ArrayList<Cliente> clientes = clienteDao.consultarClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            ArrayList<Compra> compras = compraDao.consultarComprasDeUnCliente(cliente);
            System.out.println(compras);

        }
    }

    public ArrayList<Cliente>getClientes() throws SQLException {
        ArrayList<Cliente>clientes=clienteDao.consultarClientes();
        return clientes;
    }

    public ArrayList<Compra>getCompra(Cliente cliente) throws SQLException {
        ArrayList<Compra>compras=compraDao.consultarComprasDeUnCliente(cliente);
        return compras;
    }

    public void introducirCLiente(Cliente cliente) throws SQLException {
        clienteDao.insertarCliente(cliente);
    }
    public void introducirCompra(Compra compra) throws SQLException {
        compraDao.insertarCompra(compra);
    }
    public void actualizarCliente(Cliente cliente) throws SQLException {
        clienteDao.actualizarCliente(cliente);
    }
    public void borrarCliente(Cliente cliente) throws SQLException {
        clienteDao.borrarCliente(cliente);
    }

}
