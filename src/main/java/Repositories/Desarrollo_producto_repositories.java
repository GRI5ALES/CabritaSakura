package Repositories;

import Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Desarrollo_producto_repositories extends JpaRepository<Desarrollo_prod, DesarrolloProdID> {
}
