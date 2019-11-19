package ar.edu.undec.demo.controller;

import ar.edu.undec.demo.services.ProduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/produccion")
public class ProduccionController {

    @Autowired
    ProduccionService produccionService;

    @GetMapping("/productos")
    public List<String> productos(){
        return produccionService.productos();
    }

    @GetMapping("/terminados")
    public List<Double> terminados(){
        return produccionService.productosTerminados();
    }

    @GetMapping("/en-proceso")
    public List<Double> enProceso(){
        return produccionService.productosEnProceso();
    }

    @GetMapping("/defectuosos")
    public List<Double> defectuosos(){
        return produccionService.productosDefectuosos();
    }
}
