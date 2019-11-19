package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Ventas;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

    @Query("SELECT DISTINCT v.mes FROM Ventas v")
    List<String> getMeses();

    @Query("SELECT SUM(v.importe) FROM Ventas v group by v.mes")
    List<Double> ventasPorMes();

    @Query("SELECT v.cliente From Ventas v WHERE :mes")
    List<String> clientesPorMes(String mes);

    @Query("SELECT COUNT(v.cliente) From Ventas v group by v.mes")
    List<Double> clientesCantidadMes();


}
