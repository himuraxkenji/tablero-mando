package ar.edu.undec.demo.services;

import ar.edu.undec.demo.repository.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Double> cantClientePorMes(){
        return ventasRepository.clientesCantidadMes();
    }

    public List<Double> porcentajeContado(){ return ventas}
}
