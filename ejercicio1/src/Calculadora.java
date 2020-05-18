import java.util.Objects;

public class Calculadora {
    private int total;

    public Calculadora(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                ", total=" + total +
                '}';
    }

    public int sumar(int numeroA,int numeroB) {
        total = numeroA + numeroB;
        return total;
    }

    public int restar(int numeroA,int numeroB) {
        total = numeroA - numeroB;
        return total;
    }

    public int multiplicar(int numeroA,int numeroB) {
        total = numeroA * numeroB;
        return total;
    }

    public int dividir(int numeroA,int numeroB) {
        total = numeroA / numeroB;
        return total;
    }







}
