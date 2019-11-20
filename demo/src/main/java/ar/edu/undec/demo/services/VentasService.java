package ar.edu.undec.demo.services;

import ar.edu.undec.demo.repository.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentasService {

    @Autowired
    VentasRepository ventasRepository;

    public List<String> meses(){
        return ventasRepository.getMeses();
    }

    public List<Double> ventasByMes(){
        return ventasRepository.ventasPorMes();
    }

    public List<String> clientesPorMes(String mes){
        return ventasRepository.clientesPorMes(mes);
    }


    public List<Double> contadoTotal(){
        List<Double> contadoPorMes = new ArrayList<Double>();
        for( String mes: this.meses()){
            contadoPorMes.add(this.ventasRepository.contadoPorMes(mes));
        }

        return contadoPorMes;
    }

    public List<Double> creditoTotal(){
        List<Double> creditoPorMes = new ArrayList<Double>();
        for( String mes: this.meses()){
            creditoPorMes.add(this.ventasRepository.creditoPorMes(mes));
        }
        return creditoPorMes;
    }

    public List<Double> ventasPorUbicacion(){
        return this.ventasRepository.ventasPorUbicacion();
    }

    public List<String> ubicaciones(){
        return this.ventasRepository.ubicaciones();
    }

    public List<String> ubicacionesVentasNoZero(){
        return this.ventasRepository.ventasUbicacionesNoZero();
    }

    public List<String> medios(){
        return this.ventasRepository.medios();
    }

    public List<Double> ventasPorMedio(){
        return this.ventasRepository.ventasPorMedio();
    }
}

