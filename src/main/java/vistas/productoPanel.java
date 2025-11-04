package vistas;

import Entities.SubsitemaComercial.Producto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class productoPanel extends JPanel {
    private JLabel ProductoPanel_nombre;
    private JLabel ProductoPanel_descripcion;
    private JButton productoPanel_agregarButton;

    private static final int PANEL_HEIGHT = 120; // ajusta la altura que quieras

    public productoPanel(Producto producto) {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        setBackground(Color.WHITE);

        // --- center: info ---
        JPanel info = new JPanel();
        info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
        info.setOpaque(false);

        ProductoPanel_nombre = new JLabel(producto.getNombre());
        ProductoPanel_nombre.setFont(ProductoPanel_nombre.getFont().deriveFont(Font.BOLD, 14f));
        ProductoPanel_descripcion = new JLabel("<html><body style='width:300px'>" + producto.getDescripcion() + "</body></html>");
        ProductoPanel_descripcion.setFont(ProductoPanel_descripcion.getFont().deriveFont(12f));

        info.add(ProductoPanel_nombre);
        info.add(Box.createRigidArea(new Dimension(0,6)));
        info.add(ProductoPanel_descripcion);

        add(info, BorderLayout.CENTER);

        // --- south/right: acciones ---
        productoPanel_agregarButton = new JButton("Agregar a cesta");
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        actions.setOpaque(false);
        actions.add(productoPanel_agregarButton);
        add(actions, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(0, 120));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 120));
        setAlignmentX(Component.LEFT_ALIGNMENT);

        productoPanel_agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
