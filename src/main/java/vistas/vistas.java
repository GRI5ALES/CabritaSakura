package vistas;

import Model.Categoria;
import Model.Producto;
//import net.miginfocom.layout.ContainerWrapper;
import pruebas.bd_provisional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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
    private JButton usuario_principalButton;
    private JButton usuario_cestaButton;
    private JPanel UsuarioCompradorVistas;
    private JPanel ImgPanel;
    private JLabel imgLabel;
    private JPanel Admin;
    private JPanel Cesta;
    private JCheckBox checkBox1;
    private JButton pagarButton;
    private JButton Admin_agregarProductoButton;
    private JButton Admin_agregarCategoriaButton;
    private JButton Admin_principalButton1;
    private JTextField AgregarCategoria_nombreTextField;
    private JTextField AgregarCategoria_descripcionTextField;
    private JButton AgregarCategoria_agregarButton;
    private JPanel Agregar_categoria;
    private JButton AgregarProducto_agregarCategoriaButton;
    private JButton AgregarProducto_agregarProductoButton;
    private JButton AgregarProducto_principalButton;
    private JButton agregarProducto_agregarButton;
    private JTextField agregarProducto_nombretextField;
    private JTextField agregarProducto_descripciontextField;
    private JTextField agregarProducto_categoriatextField;
    private JTextField agregarProducto_precioUnitariotextField;
    private JTextField agregarProducto_UnidadesStocktextField;
    private JTextField agregarProducto_fechaLanzamienyotextField;
    private JPanel Agregar_producto;
    private JButton AgregarCategoria_agregarCategoriaButton;
    private JButton AgregarCategoria_agregarProductoButton;
    private JButton AgregarCategoria_principalButton;
    private JPanel ContenedorProductos;
    private JScrollPane usuario_scrollPane;

    public int categoria_id_inicial = 0;
    public int producto_id_inicial = 0;

    public vistas() {
            ContenedorProductos.setLayout(new BoxLayout(ContenedorProductos, BoxLayout.Y_AXIS));
            ContenedorProductos.setBackground(Color.WHITE);

            usuario_scrollPane.getVerticalScrollBar().setUnitIncrement(16); // scroll suave

            // Si tienes un panel UsuarioCompradorVistas, añade ahí el scroll
            UsuarioCompradorVistas.setLayout(new BorderLayout());
            UsuarioCompradorVistas.add(usuario_scrollPane, BorderLayout.CENTER);


        LoginCambiarRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Register");
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
                String role = bd_provisional.verificarCredencialesLogin(LoginUsuarioTextField.getText(), LoginContrasenaPasswordField.getText());
                System.out.println(role);
                if ("USER".equals(role)) {
                    mostrarPanel("Usuario");
                    mostrarProductos();
                }
                else if ("ADMIN".equals(role)) {
                    mostrarPanel("Admin");
                }
                else {
                    System.out.println("eror, rol incorrecto");
                }
            }
        });

        RegisterEnviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bd_provisional.crearClienteRegister(
                        RegisterUsuarioTextField.getText(),
                        RegisterContrasenaPasswordField.getText(),
                        RegisterEmailTextField.getText()
                );
                mostrarPanel("Usuario");
            }
        });

        AgregarCategoria_agregarCategoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarCategoriaCard");
            }
        });
        AgregarCategoria_agregarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarProductoCard");
            }
        });
        AgregarCategoria_principalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Admin");
            }
        });
        Admin_agregarCategoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarCategoriaCard");
            }
        });
        Admin_agregarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarProductoCard");
            }
        });
        Admin_principalButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Admin");
            }
        });
        AgregarProducto_agregarCategoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarCategoriaCard");
            }
        });
        AgregarProducto_agregarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarProductoCard");
            }
        });
        AgregarProducto_principalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Admin");
            }
        });
        usuario_cestaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("CestaCard");
            }
        });
        AgregarCategoria_agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Categoria categoria = new Categoria(categoria_id_inicial++, AgregarCategoria_nombreTextField.getText(),
                        AgregarCategoria_descripcionTextField.getText());
                bd_provisional.crearCategoria(categoria);
            }
        });
        AgregarProducto_agregarCategoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarCategoriaCard");
            }
        });
        AgregarProducto_agregarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("AgregarProductoCard");
            }
        });
        AgregarProducto_principalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("Admin");
            }
        });
        agregarProducto_agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = new Producto(producto_id_inicial++,
                        agregarProducto_nombretextField.getText(),
                        agregarProducto_descripciontextField.getText(),
                        Integer.parseInt(agregarProducto_UnidadesStocktextField.getText()),
                        LocalDate.parse(agregarProducto_fechaLanzamienyotextField.getText()),
                        bd_provisional.buscarCategoria(agregarProducto_categoriatextField.getText()),
                        Integer.parseInt(agregarProducto_precioUnitariotextField.getText())
                        );
                bd_provisional.crearProducto(producto);
            }
        });
    }

    private void mostrarPanel(String ventana){
        CardLayout cl = (CardLayout)(Vistas.getLayout());
        cl.show(Vistas, ventana);
    }

    public JPanel getVistas() {
        return Vistas;
    }

    private void mostrarProductos() {
        ContenedorProductos.removeAll();

        for (Producto p : bd_provisional.obtenerProductos()) {
            productoPanel panel = new productoPanel(p);

            // IMPORTANTE: forzamos alineación izquierda y añadimos separación
            panel.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

            ContenedorProductos.add(panel);
            ContenedorProductos.add(Box.createRigidArea(new Dimension(0, 8))); // espacio entre tarjetas
        }

        ContenedorProductos.revalidate();
        ContenedorProductos.repaint();
    }

}
