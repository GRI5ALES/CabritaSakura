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
    private JButton principalButton;
    private JButton cestaButton;
    private JButton userLogoButton;
    private JPanel UsuarioCompradorVistas;
    private JPanel principal;
    private JButton agregarButton;
    private JPanel ImgPanel;
    private JPanel detalles;
    private JLabel imgLabel;

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

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Usuario");
            }
        });
        imgLabel.setPreferredSize(new Dimension(200, 200));
        ImageIcon icono = new ImageIcon("src/main/img/landscape-placeholder.jpg");
        Image img = icono.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        imgLabel.setIcon(new ImageIcon(img));
    }

    private void mostrarPanel(String ventana){
        CardLayout cl = (CardLayout)(Vistas.getLayout());
        cl.show(Vistas, ventana);
    }

    public JPanel getVistas() { return Vistas; }




}
