package ar.edu.undec.demo.controller;

import ar.edu.undec.demo.services.RrhhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/rrhh")
public class RrhhController {

    @Autowired
    RrhhService rrhhService;

    @GetMapping("/total")
    public long totalEmpleado(){
        return this.rrhhService.numeroDeEmpleado();
    }

    @GetMapping("/total-mujeres")
    public long totalMujeres(){
        return this.rrhhService.numeroDeMujeres();
    }

    @GetMapping("/total-hombres")
    public long totalHombres(){
        return this.rrhhService.numeroDeHombres();
    }

    @GetMapping("/total-salary")
    public float totalSalary(){ return this.rrhhService.salarioTotal(); }

    @GetMapping("/min-salary")
    public float minSalary(){
        return this.rrhhService.salarioMinimo();
    }

    @GetMapping("/max-salary")
    public float maxSalary(){
        return this.rrhhService.salarioMaximo();
    }

    @GetMapping("/promedio-salary")
    public float promedioSalario(){ return this.rrhhService.salariosPromedio(); }

    @GetMapping("/total-asistencia")
    public float totalAsistencia(){ return this.rrhhService.totalAsistencias();}

    @GetMapping("/total-inasistencia")
    public float totalInasistencia(){return this.rrhhService.totalInasistencias();}

    @GetMapping("/inasistencia-mujeres")
    public float inasistenciaMujeres(){return this.rrhhService.totalInasistenciasMujeres();}

    @GetMapping("/inasistencia-hombres")
    public float inasistenciaHombres(){return this.rrhhService.totalInasistenciasHombres();}

    @GetMapping("/capacitacion-mujeres")
    public float capacitacionMujeres(){return this.rrhhService.totalCursosCapacitacionMujeres();}

    @GetMapping("/capacitacion-hombres")
    public float capacitacionHombres(){return this.rrhhService.totalCursosCapacitacionHombres();}

    @GetMapping("/extras-mujeres")
    public float horasExtrasMujeres(){return this.rrhhService.totalHorasExtraMujeres();}

    @GetMapping("/extras-hombres")
    public float horasExtrasHombres(){return this.rrhhService.totalHorasExtraHombres();}

    @GetMapping("/despidos-mujeres")
    public float despidosMujeres(){return this.rrhhService.totalDespidosMujeres();}

    @GetMapping("/despidos-hombres")
    public float despidosHombres(){return this.rrhhService.totalDespidosHombres();}
}

