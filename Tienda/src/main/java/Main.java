import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ClienteDao clienteDao = new ClienteDao();
        CompraDao compraDao=new CompraDao();
        Cliente cliente=new Cliente("Pedro García Contreras","12345678A");
        Cliente cliente2=new Cliente("Ana Pérez Rodríguez","23456789B");
        Cliente cliente3=new Cliente("fsdfsdf","1222342378B");
        clienteDao.insertarCliente(cliente);
        clienteDao.insertarCliente(cliente2);
        clienteDao.insertarCliente(cliente2);

        Cliente clienteAcualizado = new Cliente("Pedro García Contreras", "12345678C", 1);

        clienteDao.actualizarCliente(clienteAcualizado);
       //// clienteDao.borrarCliente(clienteAcualizado);

        Compra compra1=new Compra("patatas",20,2);
        compraDao.insertarCompra(compra1);



        System.out.println(clienteDao.consultarClientes());



    }



    /*Cliente “Pedro García Contreras”, 12345678A
◦ Chaleco – 30€
◦ Tableta – 250€
◦ Queso curado - 15€
• Cliente “Ana Pérez Rodríguez”, 23456789B
◦ Zapatos – 30€
◦ Móvil – 200€
◦ Café en grano - 15€*/
}
