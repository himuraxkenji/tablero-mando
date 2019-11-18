package ar.edu.undec.demo.services;

import ar.edu.undec.demo.repository.RrhhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RrhhService {

    @Autowired
    RrhhRepository rrhhRepository;

    public long numeroDeEmpleado(){
        return this.rrhhRepository.count();
    }

    public long numeroDeMujeres(){
        return this.rrhhRepository.countByGenero("Femenino");
    }

    public long numeroDeHombres(){
        return this.rrhhRepository.countByGenero("Masculino");
    }

    public float salarioMinimo(){
        return this.rrhhRepository.minSalary();
    }

    public float salarioMaximo(){ return this.rrhhRepository.maxSalary(); }

    public float salarioTotal(){
        return this.rrhhRepository.totalSalary();
    }

    public float salariosPromedio(){ return this.rrhhRepository.salarioPromedio();}

    public float totalAsistencias(){ return (90 - this.rrhhRepository.totalFaltas()); }

    public float totalInasistencias(){ return  this.rrhhRepository.totalFaltas(); }

    public float totalInasistenciasMujeres(){ return  this.rrhhRepository.totalFaltas() - this.rrhhRepository.faltasMujeres(); }

    public float totalInasistenciasHombres(){ return  this.rrhhRepository.totalFaltas() - this.rrhhRepository.faltasHombres(); }

    public float totalCursosCapacitacionMujeres(){ return this.rrhhRepository.totalCursosCapacitacionMujeres();}

    public float totalCursosCapacitacionHombres(){ return this.rrhhRepository.totalCursosCapacitacionHombres();}

    public float totalHorasExtraMujeres(){ return this.rrhhRepository.totalHorasExtraMujeres();}

    public float totalHorasExtraHombres(){ return this.rrhhRepository.totalHorasExtraHombres();}

    public float totalDespidosMujeres(){ return this.rrhhRepository.totalDespidosMujeres();}

    public float totalDespidosHombres(){ return this.rrhhRepository.totalDespidosHombres();}

}
