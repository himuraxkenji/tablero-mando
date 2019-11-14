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
}
