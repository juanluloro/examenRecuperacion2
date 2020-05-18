import java.util.Objects;

public class Cliente {
    private String nombre;
    private String dni;
    private int id;


    public Cliente(String nombre, String dni) {
        this.id=-1;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Cliente(String nombre, String dni, int id) {
        this.nombre = nombre;
        this.dni = dni;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, id);
    }
}
