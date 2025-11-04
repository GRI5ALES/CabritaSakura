package Repositories;

import Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Desarrollador_producto_repositories extends JpaRepository<Desarrollador_producto, Integer> {
}
