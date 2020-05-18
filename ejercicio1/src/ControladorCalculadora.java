import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora implements ActionListener {
   public static final String SUMAR = "SUMAR";
    public static final String RESTAR = "RESTAR";
    public static final String MULTIPLICAR = "MULTIPLICAR";
    public static final String DIVIDIR = "DIVIDIR";


    private Vista vista;
    private Calculadora calculadora;

    public ControladorCalculadora(Vista vista, Calculadora calculadora) {
        this.vista = vista;
        this.calculadora = calculadora;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }






}
