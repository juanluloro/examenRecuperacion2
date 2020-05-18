import javax.swing.*;
import java.awt.event.*;

public class DialogoCliente extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textFieldNombre;
    private JTextField textFieldDni;
    private DialogoClienteDatos datos;

    public DialogoCliente(DialogoClienteDatos datos) {
        this.datos=datos;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        datos.setPulsadoOk(true);
        String nombre=textFieldNombre.getText();
        String dni=textFieldDni.getText();
        datos.setNombre(nombre);
        datos.setDni(dni);
        // add your code here
        dispose();
    }

    private void onCancel() {
        datos.setPulsadoOk(false);
        // add your code here if necessary
        dispose();
    }
}
