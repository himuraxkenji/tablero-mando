package ar.edu.undec.demo.controller;

import ar.edu.undec.demo.services.DatosVariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/datos-varios")
public class DatosVariosController {

    @Autowired
    DatosVariosService datosVariosService;
    

    @GetMapping("/anios")
    public List<Integer> anios(){
        return this.datosVariosService.anios();
    }

    @GetMapping("/liquides-acida")
    public List<Double> liquidezAcida(){
        return this.datosVariosService.liquidezAcida();
    }

    @GetMapping("/liquides-corriente")
    public List<Double> liquidezCorriente(){
        return this.datosVariosService.liquidezCorriente();
    }

    @GetMapping("/solvencia")
    public List<Double> solvencia(){
        return this.datosVariosService.solvencia();
    }

    @GetMapping("/endeudamiento")
    public List<Double> endeudamiento(){
        return this.datosVariosService.endeudamiento();
    }

    @GetMapping("/esfuerzo")
    public List<Double> esfuerzoComercializacion(){
        return this.datosVariosService.esfuerzoComercializacion();
    }

}
