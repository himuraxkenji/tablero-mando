package ar.edu.undec.demo.services;

import ar.edu.undec.demo.repository.ProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduccionService {

    @Autowired
    ProduccionRepository produccionRepository;

    public List<String> productos(){
        return this.produccionRepository.productos();
    }

    public List<Double> productosTerminados(){
        return this.produccionRepository.productosTerminados();
    }

    public List<Double> productosEnProceso(){
        return this.produccionRepository.productosEnProceso();
    }

    public List<Double> productosDefectuosos(){
        return this.produccionRepository.productosDefectuosos();
    }

    public List<Double> avancePorProducto(){
        List<Double> avance = new ArrayList<Double>();
        List<Double> terminados = productosTerminados();
        List<Double> enProceso= productosEnProceso();

        for (int i = 0; i < terminados.size(); i++) {
            Double total = terminados.get(i) + enProceso.get(i);
            Double porcentaje = terminados.get(i) * 100 / total;
            avance.add(porcentaje);
        }
        return avance;
    }



}
