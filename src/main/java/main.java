import Entities.SubsitemaComercial.Categoria;
import Entities.SubsitemaComercial.Producto;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        List<Categoria> categorias = new ArrayList<>(); //List for categories
        List<Producto> productos = new ArrayList<>(); //List for products
        int categoria_id = 1;
        int producto_id = 1;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear categoria");
            System.out.println("2. Crear producto");
            System.out.println("3. Listar categorias");
            System.out.println("4. Listar productos");
            System.out.println("5. Salir");
            System.out.print("Elige opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Clean the buzzer

            if (opcion == 1) {
                System.out.print("Nombre categoria: ");
                String nombre = sc.nextLine();
                System.out.print("Descripcion categoria: ");
                String descripcion = sc.nextLine();
                Categoria categoria = new Categoria(categoria_id++, nombre, descripcion);
                categorias.add(categoria);
                System.out.println("Categoria creada: " + categoria);

            } else if (opcion == 2) {
                if (categorias.isEmpty()) {
                    System.out.println("No hay categorias, primero cree una.");
                    continue;
                }
                System.out.print("Nombre producto: ");
                String nombre = sc.nextLine();
                System.out.print("Descripcion producto: ");
                String descripcion = sc.nextLine();
                System.out.print("Unidades en stock: ");
                int stock = sc.nextInt();
                sc.nextLine();

                System.out.print("Fecha lanzamiento (yyyy-mm-dd) o enter para actual: ");
                String fecha_input = sc.nextLine();
                LocalDate fecha = null;
                if (fecha_input.isEmpty()) {
                    fecha = LocalDate.now();
                } else {
                    fecha = LocalDate.parse(fecha_input);
                }

                System.out.println("Elige categoria (o 0 para cancelar):");
                for (Categoria c : categorias) {
                    System.out.println(c);
                }
                System.out.print("Categoria id: ");
                int cat_id = sc.nextInt();
                sc.nextLine();

                if (cat_id == 0) {
                    System.out.println("Cancelado.");
                    continue;
                }

                Categoria cat_elegida = null;
                for (Categoria c : categorias) {
                    if (c.getId() == cat_id) {
                        cat_elegida = c;
                        break;
                    }
                }

                if (cat_elegida == null) {
                    System.out.println("Categoria no encontrada.");
                    continue;
                }

                Producto producto = new Producto(producto_id++, nombre, descripcion, stock, fecha, cat_elegida);
                productos.add(producto);
                System.out.println("Producto creado: " + producto);

            } else if (opcion == 3) {
                for (Categoria c : categorias) {
                    System.out.println(c);
                }

            } else if (opcion == 4) {
                for (Producto p : productos) {
                    System.out.println(p);
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion invalida.");
            }
        }

        sc.close();







    }
}
