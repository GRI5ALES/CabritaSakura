package Repositories;


import Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Categoria_repositories extends JpaRepository<Categoria, Integer> {
    Optional<Categoria> findBynombre(String nombre);
}
