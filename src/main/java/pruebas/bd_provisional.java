package pruebas;

import Entities.SubsitemaComercial.Cliente;
import Entities.SubsitemaComercial.MetodoPago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bd_provisional {
    private static List<Cliente> clientes = new ArrayList<>();
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
                        2, "María Gómez", "maria.gomez@example.com", "mypass123", "ADMIN",
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
}
