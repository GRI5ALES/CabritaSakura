package Repositories;

import Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface Metodo_pago_repositories extends JpaRepository<Metodo_pago, Integer> {
    Optional<Metodo_pago> findBycliente ( Cliente cliente);
}
