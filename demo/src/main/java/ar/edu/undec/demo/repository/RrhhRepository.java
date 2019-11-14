package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Rrhh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RrhhRepository extends JpaRepository<Rrhh, Integer> {

    long count();

    long countByGenero(String genero);

}
