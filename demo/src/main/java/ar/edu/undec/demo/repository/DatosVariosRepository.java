package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Datosvarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatosVariosRepository extends JpaRepository<Datosvarios, Integer> {

    @Query("SELECT  distinct(d.anio) From Datosvarios d")
    List<Integer> getAnios();

    @Query("SELECT  SUM(d.pasivoCorriente) From Datosvarios d WHERE d.anio = :anio")
    double pasivoCorrientePorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.pasivoNoCorriente) From Datosvarios d WHERE d.anio = :anio")
    double pasivoNoCorrientePorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.activoCorriente) From Datosvarios d WHERE d.anio = :anio")
    double activoCorrientePorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.activoNoCorriente) From Datosvarios d WHERE d.anio = :anio")
    double activoNoCorrientePorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.disponibilidades) From Datosvarios d WHERE d.anio = :anio")
    double disponibilidadesPorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.inversionesACortoPlazo) From Datosvarios d WHERE d.anio = :anio")
    double inversionesCortoPlazoPorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.capitalPropio) From Datosvarios d WHERE d.anio = :anio")
    double capitalPropioPorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.gastosDeComercializacion) From Datosvarios d WHERE d.anio = :anio")
    double gastosDeComercializacionPorAnio(@Param("anio") int anio);

    @Query("SELECT  SUM(d.ventasTotales) From Datosvarios d WHERE d.anio = :anio")
    double ventasTotalesPorAnio(@Param("anio") int anio);

}
