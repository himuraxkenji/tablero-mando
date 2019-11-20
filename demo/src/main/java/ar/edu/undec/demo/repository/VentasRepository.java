package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Ventas;
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

   @Query("SELECT v.cliente From Ventas v WHERE :mes = v.mes")
    List<String> clientesPorMes(String mes);

    @Query("SELECT SUM(v.contado) From Ventas v WHERE :mes = v.mes")
    Double contadoPorMes(String mes);

    @Query("SELECT SUM(v.credito) From Ventas v WHERE :mes = v.mes")
    Double creditoPorMes(String mes);

    @Query("SELECT SUM(v.importe) From Ventas v group by v.destino")
    List<Double> ventasPorUbicacion();

    @Query("SELECT distinct v.destino  From Ventas v")
    List<String> ubicaciones();

    @Query("SELECT distinct v.destino  From Ventas v where v.importe <> 0")
    List<String> ventasUbicacionesNoZero();

    @Query("SELECT SUM(v.importe) From Ventas v group by v.medio")
    List<Double> ventasPorMedio();

    @Query("SELECT distinct v.medio  From Ventas v")
    List<String> medios();
}
