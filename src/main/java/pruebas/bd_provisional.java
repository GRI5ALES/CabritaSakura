package pruebas;

import Entities.SubsitemaComercial.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bd_provisional {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Categoria> categorias = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    private static List<Carrito> carritos = new ArrayList<>();
    private static List<Compra> compras = new ArrayList<>();

    public static void pruebas(){
        clientes.add(
                new Cliente(
                        1, "Juan Pérez", "juan.perez@example.com", "12345", "USER",
                        "2025-01-15", "ACTIVA",
                        "Calle 123 #45-67, Bogotá", 300123456,
                        Arrays.asList(new MetodoPago(1, "TARJETA", "Juan Pérez", "**** 5678"))
                ));
        clientes.add(
                new Cliente(
                        1, "1", "juan.perez@example.com", "1", "USER",
                        "2025-01-15", "ACTIVA",
                        "Calle 123 #45-67, Bogotá", 300123456,
                        Arrays.asList(new MetodoPago(1, "TARJETA", "Juan Pérez", "**** 5678"))
                ));
        clientes.add(
                new Cliente(
                        2, "2", "maria.gomez@example.com", "2", "ADMIN",
                        "2025-02-01", "ACTIVA",
                        "Carrera 10 #20-30, Medellín", 310987654,
                        Arrays.asList(
                                new MetodoPago(2, "PAYPAL", "María Gómez", "maria.paypal@example.com")
                        )
                )
        );

        clientes.add(
                new Cliente(
                        3, "Carlos López", "carlos.lopez@example.com", "securepass", "USER",
                        "2025-02-20", "SUSPENDIDA",
                        "Av. Siempre Viva 742, Cali", 315555555,
                        Arrays.asList(
                                new MetodoPago(3, "TARJETA", "Carlos López", "**** 1111"),
                                new MetodoPago(4, "TRANSFERENCIA", "Carlos López", "Cuenta: 123-456789")
                        )
                )
        );

        Categoria tecnologia = new Categoria(1, "Tecnologia", "Dispositivos electrónicos y accesorios");
        Categoria hogar = new Categoria(2, "Hogar", "Artículos para el hogar y cocina");

        categorias.add(tecnologia);
        categorias.add(hogar);

        productos.add(new Producto(
                1, "Smartphone Galaxy S25",
                "Teléfono de última generación con cámara de 200 MP y pantalla AMOLED",
                50,
                 LocalDate.parse("2025-10-20"),
                 tecnologia,
                1000
        ));
        productos.add(new Producto(
                2, "Laptop Lenovo ThinkBook 16",
                "Portátil de alto rendimiento con procesador i7 y 16GB de RAM",
                30, LocalDate.of(2024, 11, 5),
                tecnologia, 5200000
        ));
        productos.add(new Producto(
                3, "Batidora Oster ProBlend",
                "Batidora de 10 velocidades con vaso de vidrio reforzado",
                80, LocalDate.of(2023, 8, 20),
                hogar, 320000
        ));
        productos.add(new Producto(
                4, "Set de Sábanas 100% Algodón",
                "Juego de sábanas suaves y frescas para cama doble",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                5, "Set de Sábanas ",
                "Juego ",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                6, "Set de Sábanas 100% Algodón",
                "Juego de sábanas suaves y frescas para cama doble",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                7, "Set de Sábanas ",
                "Juego ",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                1, "Smartphone Galaxy S25",
                "Teléfono de última generación con cámara de 200 MP y pantalla AMOLED",
                50,
                LocalDate.parse("2025-10-20"),
                tecnologia,
                1000
        ));
        productos.add(new Producto(
                2, "Laptop Lenovo ThinkBook 16",
                "Portátil de alto rendimiento con procesador i7 y 16GB de RAM",
                30, LocalDate.of(2024, 11, 5),
                tecnologia, 5200000
        ));
        productos.add(new Producto(
                3, "Batidora Oster ProBlend",
                "Batidora de 10 velocidades con vaso de vidrio reforzado",
                80, LocalDate.of(2023, 8, 20),
                hogar, 320000
        ));
        productos.add(new Producto(
                4, "Set de Sábanas 100% Algodón",
                "Juego de sábanas suaves y frescas para cama doble",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                5, "Set de Sábanas ",
                "Juego ",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                6, "Set de Sábanas 100% Algodón",
                "Juego de sábanas suaves y frescas para cama doble",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
        productos.add(new Producto(
                7, "Set de Sábanas ",
                "Juego ",
                120, LocalDate.of(2024, 5, 12),
                hogar, 180000
        ));
    }



    public static String verificarCredencialesLogin(String username, String password) {
        return clientes.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(username) && c.getPassword().equals(password))
                .map(Cliente::getRole)
                .findFirst()
                .orElse(null);
    }

    public static void crearClienteRegister(String username, String password, String email){
        Cliente cliente = new Cliente(username, email, password, "USER");
        clientes.add(cliente);
        System.out.println(cliente.getInfo());
    }
    public static void crearCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public static Categoria buscarCategoria(String nombre_categoria){
        return categorias.stream()
                .filter(categoria -> categoria.getNombre().equalsIgnoreCase(nombre_categoria))
                .findFirst()
                .orElse(null);
    }

    public static void crearProducto(Producto producto){
        productos.add(producto);
    }

    public static List<Producto> obtenerProductos(){
        return productos;
    }

}
