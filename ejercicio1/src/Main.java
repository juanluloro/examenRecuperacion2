import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora=new Calculadora(0);
        Vista vista=new Vista();
        ControladorCalculadora controlador = new ControladorCalculadora(vista,calculadora);

        JFrame frame = new JFrame("operaciones");
        vista.setControlador(controlador);//este es el que comunica la vista con el controlador!!!!!sin esto no funciona!!!!!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(vista.getPanelMain());
        frame.setSize(600, 450);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}
