package Repositories;

import Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Admin_contenido_repositories extends JpaRepository<Admin_contenido,Integer> {
}
