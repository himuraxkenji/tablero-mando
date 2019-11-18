package ar.edu.undec.demo.repository;

import ar.edu.undec.demo.model.Rrhh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RrhhRepository extends JpaRepository<Rrhh, Integer> {

    long count();

    long countByGenero(String genero);

    @Query("SELECT MIN(r.salario) FROM Rrhh r")
    float minSalary();

    @Query("SELECT MAX(r.salario) FROM Rrhh r")
    float maxSalary();

    @Query("SELECT SUM(r.salario) FROM Rrhh r")
    float totalSalary();

    @Query("SELECT AVG(r.salario) FROM Rrhh r")
    float salarioPromedio();

    @Query("SELECT SUM(r.faltas)FROM Rrhh r")
    float totalFaltas();

    @Query("SELECT SUM(r.faltas) FROM Rrhh r WHERE r.genero LIKE 'Femenino'")
    float faltasMujeres();

    @Query("SELECT SUM(r.faltas) FROM Rrhh r WHERE r.genero LIKE 'Masculino'")
    float faltasHombres();

    @Query("SELECT SUM(r.cursosCapacitacion) FROM Rrhh r")
    float totalCursosCapacitacion();

    @Query("SELECT SUM(r.cursosCapacitacion) FROM Rrhh r where r.genero like 'Femenino'")
    float totalCursosCapacitacionMujeres();

    @Query("SELECT SUM(r.cursosCapacitacion) FROM Rrhh r where r.genero like 'Masculino'")
    float totalCursosCapacitacionHombres();

    @Query("SELECT SUM(r.horasExtras) FROM Rrhh r WHERE r.genero LIKE 'Femenino'")
    float totalHorasExtraMujeres();

    @Query("SELECT SUM(r.horasExtras) FROM Rrhh r WHERE r.genero LIKE 'Masculino'")
    float totalHorasExtraHombres();

    @Query("SELECT SUM(r.despidos) FROM Rrhh r WHERE r.genero LIKE 'Femenino'")
    float totalDespidosMujeres();

    @Query("SELECT SUM(r.despidos) FROM Rrhh r WHERE r.genero LIKE 'Masculino'")
    float totalDespidosHombres();
}
