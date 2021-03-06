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
        String comando = actionEvent.getActionCommand();
        if (comando.equals(SUMAR)) {
            int numeroA = vista.numeroIntroducidoA();
            int numeroB = vista.numeroIntroducidoB();
            int resultado=calculadora.sumar(numeroA,numeroB);
            vista.refrescarOperacion(numeroA+" + "+numeroB +" = "+ resultado);
        }else if(comando.equals(RESTAR)){
            int numeroA = vista.numeroIntroducidoA();
            int numeroB = vista.numeroIntroducidoB();
            int resultado=calculadora.restar(numeroA,numeroB);
            vista.refrescarOperacion(numeroA+" - "+numeroB +" = "+ resultado);
        }else if(comando.equals(MULTIPLICAR)){
            int numeroA = vista.numeroIntroducidoA();
            int numeroB = vista.numeroIntroducidoB();
            int resultado=calculadora.multiplicar(numeroA,numeroB);
            vista.refrescarOperacion(numeroA+" * "+numeroB +" = "+ resultado);
        }else if(comando.equals(DIVIDIR)){
            int numeroA = vista.numeroIntroducidoA();
            int numeroB = vista.numeroIntroducidoB();
            int resultado=calculadora.dividir(numeroA,numeroB);
            vista.refrescarOperacion(numeroA+" / "+numeroB +" = "+ resultado);
        }

    }






}
