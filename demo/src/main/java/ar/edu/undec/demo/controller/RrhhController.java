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
}
