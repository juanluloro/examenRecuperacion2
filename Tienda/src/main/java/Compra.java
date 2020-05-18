import java.util.Objects;

public class Compra {
    private int id;
    private String producto;
    private int precio;
    private int id_cliente;


    public Compra(String producto, int precio, int id_cliente) {
        this.id=-1;
        this.producto = producto;
        this.precio = precio;
        this.id_cliente = id_cliente;
    }

    public Compra(int id, String producto, int precio, int id_cliente) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.id_cliente = id_cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                ", id_cliente=" + id_cliente +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return id == compra.id &&
                precio == compra.precio &&
                id_cliente == compra.id_cliente &&
                Objects.equals(producto, compra.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, producto, precio, id_cliente);
    }
}
