import javax.swing.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            vistas form = new vistas();

            JFrame frame = new JFrame("Cabrita Sakura");
            frame.setContentPane(new vistas().getVistas());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);

        });
    }
}
