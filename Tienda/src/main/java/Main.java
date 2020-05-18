import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ClienteDao clienteDao = new ClienteDao();
        CompraDao compraDao=new CompraDao();
        Tienda tienda=new Tienda(compraDao,clienteDao);
        //crear clientes
        Cliente cliente1=new Cliente("Pedro García Contreras","12345678A");
        Cliente cliente2=new Cliente("Ana Pérez Rodríguez","23456789B");
        //introducir cliente 1
        tienda.introducirCLiente(cliente1);
       //crear compras cliente 1
        Compra chaleco=new Compra("Chaleco",30,cliente1.getId());
        Compra tableta=new Compra("Tableta",250,cliente1.getId());
        Compra quesoCurado=new Compra("Queso curado",15,cliente1.getId());

        //introducir compras cliente 1
        tienda.introducirCompra(chaleco);
        tienda.introducirCompra(tableta);
        tienda.introducirCompra(quesoCurado);
       //introducir cliente 2
        tienda.introducirCLiente(cliente2);
        //crear compras cliente 2
        Compra zapatos=new Compra("Zapatos",30,cliente2.getId());
        Compra movil=new Compra("Móvil",200,cliente2.getId());
        Compra cafe=new Compra("Café en grano",15,cliente2.getId());
        //introducir compras cliente 2
        tienda.introducirCompra(zapatos);
        tienda.introducirCompra(movil);
        tienda.introducirCompra(cafe);
        //mostrar todos los clientes y compras
        tienda.mostrarClientesYCompras();
        //modificar cliente
        cliente1.setDni("12345678C");
        tienda.actualizarCliente(cliente1);
        //borrar cliente
        tienda.borrarCliente(cliente2);
        //introducir una compra a un cliente
        Compra ensalada=new Compra("Ensalada",4,cliente1.getId());
        tienda.introducirCompra(ensalada);






    }

}
