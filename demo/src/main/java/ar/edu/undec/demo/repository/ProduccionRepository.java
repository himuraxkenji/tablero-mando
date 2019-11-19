package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Produccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduccionRepository extends JpaRepository<Produccion, Integer> {

    @Query("SELECT distinct p.producto from Produccion p")
    List<String> productos();

    @Query("SELECT p.productoEnProceso from Produccion p ")
    List<Double> productosEnProceso();

    @Query("SELECT p.productoTerminados from Produccion p")
    List<Double> productosTerminados();

    @Query("SELECT p.defectuosos from Produccion p")
    List<Double> productosDefectuosos();


}
