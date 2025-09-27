import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistas {
    private JPanel Vistas;
    private JPanel Login;
    private JPanel Register;
    private JTextField LoginUsuarioTextField;
    private JButton enviarButton;
    private JPasswordField LoginContrasenaPasswordField;
    private JPanel LoginFormulario;
    private JPanel RegisterFormulario;
    private JTextField RegisterUsuarioTextField;
    private JButton RegisterEnviarButton;
    private JPasswordField RegisterContrasenaPasswordField;
    private JTextField RegisterEmailTextField;
    private JButton LoginCambiarRegister;
    private JButton RegisterCambiarLogin;
    private JPanel Usuario;

    public vistas() {
        LoginCambiarRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Register");
                System.out.println("boton presionado");
            }
        });

        RegisterCambiarLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Login");
            }
        });
    }

    private void mostrarPanel(String ventana){
        CardLayout cl = (CardLayout)(Vistas.getLayout());
        cl.show(Vistas, ventana);
    }

    public JPanel getVistas() { return Vistas; }


}
