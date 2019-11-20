package ar.edu.undec.demo.controller;

import ar.edu.undec.demo.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/clientes-mes/{mes}")
    public List<String> clientesPorMes(@PathVariable("mes") String mes){
        return ventasService.clientesPorMes(mes);
    }

    @GetMapping("/contado-mes")
    public List<Double> contadoPorMes(){
        return ventasService.contadoTotal();
    }

    @GetMapping("/credito-mes")
    public List<Double> creditoPorMes(){
        return ventasService.creditoTotal();
    }

    @GetMapping("/ubicaciones")
    public List<String> ubicaciones(){
        return ventasService.ubicaciones();
    }

    @GetMapping("/ventas-ubicaciones")
    public List<Double> ventasUbicaciones(){
        return ventasService.ventasPorUbicacion();
    }

    @GetMapping("/ventas-ubicaciones-no-zero")
    public List<String> ventasUbicacionesNoZero(){
        return ventasService.ubicacionesVentasNoZero();
    }

    @GetMapping("/ventas-medio")
    public List<Double> ventasPoMedio(){
        return ventasService.ventasPorMedio();
    }


    @GetMapping("/medios")
    public List<String> medios(){
        return ventasService.medios();
    }

}
