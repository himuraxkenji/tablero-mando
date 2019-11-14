package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Produccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduccionRepository extends JpaRepository<Produccion, Integer> {
}
