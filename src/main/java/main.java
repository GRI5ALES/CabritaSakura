
import Entities.SubsitemaComercial.Categoria;
import Entities.SubsitemaComercial.Producto;
import Entities.SubsitemaComercial.Carrito;
import Entities.SubsitemaComercial.Compra;
import Entities.SubsitemaComercial.LineaCompra;
import Entities.SubsitemaComercial.LineaCarrito;

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

        /*Scanner sc = new Scanner(System.in);
        List<Categoria> categorias = new ArrayList<>(); //List for categories
        List<Producto> productos = new ArrayList<>(); //List for products
        List<Carrito> carritos = new ArrayList<>(); // List for Shopping carts
        List<Compra> compras = new ArrayList<>(); // Lista for Purchases

        int categoria_id = 1;
        int producto_id = 1;
        int carrito_id = 1;
        int compra_id = 1;
        int lineaCompra_id = 1;


        //---Products Men---
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
                System.out.print("Precio Unitario: ");
                int precio_unitario = sc.nextInt();
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



                Producto producto = new Producto(producto_id++, nombre, descripcion, stock, fecha, cat_elegida ,
                        precio_unitario);
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

        // --- Purchases Menu ---
        while (true) {
            System.out.println("\n--- MENU COMPRAS ---");
            System.out.println("1. Crear carrito");
            System.out.println("2. Agregar linea de compra a carrito");
            System.out.println("3. Listar compras");
            System.out.println("4. Finalizar compra pendiente");
            System.out.println("5. Salir");
            System.out.print("Elige opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                Carrito carrito = new Carrito(carrito_id++, LocalDate.now());
                carritos.add(carrito);
                System.out.println("Carrito creado: ID " + carrito.getId() + ", Fecha " + carrito.getFecha_creacion());

            } else if (opcion == 2) {
                if (carritos.isEmpty() || productos.isEmpty()) {
                    System.out.println("Necesitas al menos un carrito y un producto para agregar linea de compra.");
                    continue;
                }

                System.out.println("Selecciona carrito (ID):");
                for (Carrito c : carritos) {
                    System.out.println("ID: " + c.getId() + ", Fecha: " + c.getFecha_creacion());
                }
                int c_id = sc.nextInt();
                sc.nextLine();
                Carrito carrito_elegido = null;
                for (Carrito c : carritos) {
                    if (c.getId() == c_id) {
                        carrito_elegido = c;
                        break;
                    }
                }
                if (carrito_elegido == null) {
                    System.out.println("Carrito no encontrado.");
                    continue;
                }


                System.out.println("Selecciona producto (ID):");
                for (Producto p : productos) {
                    System.out.println(p);
                }
                int p_id = sc.nextInt();
                sc.nextLine();
                Producto prod_elegido = null;
                for (Producto p : productos) {
                    if (p.getId() == p_id) {
                        prod_elegido = p;
                        break;
                    }
                }
                if (prod_elegido == null) {
                    System.out.println("Producto no encontrado.");
                    continue;
                }


                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                if (cantidad > prod_elegido.getUnidades_stock()) {
                    System.out.println("No hay suficiente stock. Stock disponible: " + prod_elegido.getUnidades_stock());
                    continue;
                }


                double subtotal = cantidad * prod_elegido.getPrecio_unitario();
                LineaCompra linea = new LineaCompra(cantidad, prod_elegido.getPrecio_unitario(), subtotal,
                        prod_elegido);


                Compra compra = new Compra("Pendiente", subtotal,LocalDate.now(),compra_id++);
                compra.anadirLineaCompra(linea);
                compras.add(compra);

                System.out.println("Compra creada: ID " + compra.getId() + ", Total: " + compra.getTotal() + ", Estado: " + compra.getEstado());

            } else if (opcion == 3) {
            System.out.println("=== Compras ===");
            for (Compra c : compras) {
                System.out.println("ID: " + c.getId() + ", Fecha: " + c.getFecha() + ", Total: " + c.getTotal() + ", Estado: " + c.getEstado());
                for (LineaCompra l : c.getLineas()) {
                    System.out.println("   Linea: Cantidad=" + l.getCantidad() + ", Precio unitario=" + l.getPrecio_unitario() + ", Subtotal=" + l.getSubtotal());
                }
            }
            } else if (opcion == 4) {
                System.out.println("Selecciona compra pendiente (ID):");
                for (Compra c : compras) {
                    if (c.getEstado().equalsIgnoreCase("Pendiente")) {
                        System.out.println("ID: " + c.getId() + ", Total: " + c.getTotal());
                    }
                }

                int compra_id_sel = sc.nextInt();
                sc.nextLine();

                Compra compra_finalizar = null;
                for (Compra c : compras) {
                    if (c.getId() == compra_id_sel && c.getEstado().equalsIgnoreCase("Pendiente")) {
                        compra_finalizar = c;
                        break;
                    }
                }

                if (compra_finalizar == null) {
                    System.out.println("Compra pendiente no encontrada.");
                    continue;
                }


                boolean stockInsuficiente = false;
                for (LineaCompra l : compra_finalizar.getLineas()) {
                    Producto prodLinea = null;
                    for (Producto p : productos) {
                        if (p.getId() == l.getProducto().getId() && l.getCantidad() <= p.getUnidades_stock()) {
                            prodLinea = p;
                            break;
                        }
                    }

                    if (prodLinea == null || l.getCantidad() > prodLinea.getUnidades_stock()) {
                        stockInsuficiente = true;
                        break;
                    }
                }

                if (stockInsuficiente) {
                    System.out.println("No hay suficiente stock para esta compra. Carrito eliminado.");
                    compras.remove(compra_finalizar);
                    System.out.println("Compra eliminada por falta de stock");
                    continue;
                }


                System.out.print("Aceptar compra? (S/N): ");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                    compra_finalizar.setEstado("Aceptada");
                    for (LineaCompra l : compra_finalizar.getLineas()) {
                        for (Producto p : productos) {
                            if (p.getId() == l.getProducto().getId() ) {
                                p.setUnidades_stock(p.getUnidades_stock() - l.getCantidad());
                                break;
                            }
                        }
                    }
                    System.out.println("Compra aceptada y stock actualizado.");
                } else {
                    compra_finalizar.setEstado("Denegada");
                    System.out.println("Compra denegada.");
                }
            }else if (opcion == 5) {

                System.out.println("\n=== RESUMEN DEL DIA ===");
                double total_general = 0;
                int compras_realizadas = 0;
                for (Compra c : compras) {
                    if (c.getEstado().equalsIgnoreCase("Aceptada")) {
                        total_general += c.getTotal();
                        compras_realizadas++;
                        System.out.println("Compra ID: " + c.getId() + ", Total: " + c.getTotal());
                    }
                }
                System.out.println("Total de compras aceptadas: " + compras_realizadas);
                System.out.println("Total general: " + total_general);
                System.out.println("Saliendo del menu de compras...");
                break;
            } else {
                System.out.println("Opcion invalida.");
            }
        }

        sc.close();
        */
    }
}
