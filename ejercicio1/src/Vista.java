import javax.swing.*;
import java.awt.event.ActionListener;

public class Vista {
    private JTextField textFieldA;
    private JTextArea textAreaResultado;
    private JTextField textFieldB;
    private JButton buttonDividir;
    private JButton buttonMultiplicar;
    private JButton buttonRestar;
    private JButton buttonSumar;
    private JLabel labelA;
    private JLabel labelB;
    private JPanel panelMain;

    public JPanel getPanelMain() {
        return panelMain;
    }


    public void setControlador(ActionListener actionListener) {

        buttonSumar.addActionListener(actionListener);
        buttonSumar.setActionCommand(ControladorCalculadora.SUMAR);


        buttonRestar.addActionListener(actionListener);
        buttonRestar.setActionCommand(ControladorCalculadora.RESTAR);

        buttonMultiplicar.addActionListener(actionListener);
        buttonMultiplicar.setActionCommand(ControladorCalculadora.RESTAR);

        buttonDividir.addActionListener(actionListener);
        buttonDividir.setActionCommand(ControladorCalculadora.RESTAR);

    }

    public Integer numeroIntroducidoA(){
        Integer numeroA=Integer.parseInt(textFieldA.getText());
        return numeroA;
    }









}
