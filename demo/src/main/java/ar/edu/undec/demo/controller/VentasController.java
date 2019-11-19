package ar.edu.undec.demo.controller;

import ar.edu.undec.demo.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/ventas")
public class VentasController {

    @Autowired
    VentasService ventasService;

    @GetMapping("/meses")
    public List<String> meses(){
        return ventasService.meses();
    }


    @GetMapping("/venta-mes")
    public List<Double> ventas(){
        return ventasService.ventasByMes();
    }

}
