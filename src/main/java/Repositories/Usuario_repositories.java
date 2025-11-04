package Repositories;


import Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Usuario_repositories extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findBynombre(String nombre);
    Optional<Usuario> findByRole(String Role);

}
