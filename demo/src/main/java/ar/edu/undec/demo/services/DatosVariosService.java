package ar.edu.undec.demo.services;

import ar.edu.undec.demo.repository.DatosVariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatosVariosService {

    @Autowired
    DatosVariosRepository datosVariosRepository;

    public double pasivoCorriente(Integer anio){
        return this.datosVariosRepository.pasivoCorrientePorAnio(anio);
    }

    public double pasivoNoCorriente(Integer anio){
        return this.datosVariosRepository.pasivoCorrientePorAnio(anio);
    }

    public double activoCorriente(Integer anio){
        return this.datosVariosRepository.activoCorrientePorAnio(anio);
    }

    public double activoNoCorriente(Integer anio){
        return this.datosVariosRepository.activoNoCorrientePorAnio(anio);
    }

    public double activoTotalPorAnio(Integer anio){
        return activoCorriente(anio) + activoNoCorriente(anio);
    }
    public double pasivoTotalPorAnio(Integer anio){

        return pasivoCorriente(anio) + pasivoNoCorriente(anio);
    }

    public double disponibilidadesPorAnio(Integer anio){

        return this.datosVariosRepository.disponibilidadesPorAnio(anio);
    }

    public double inversionesPorAnio(Integer anio){

        return this.datosVariosRepository.inversionesCortoPlazoPorAnio(anio);
    }

    public double capitalPropioPorAnio(Integer anio){

        return this.datosVariosRepository.capitalPropioPorAnio(anio);
    }

    public double gastosComercializacionPorAnio(Integer anio){
        return this.datosVariosRepository.gastosDeComercializacionPorAnio(anio);
    }

    public double ventasTotalesPorAnio(Integer anio){
        return this.datosVariosRepository.ventasTotalesPorAnio(anio);
    }

    public List<Integer> anios(){
        return this.datosVariosRepository.getAnios();
    }

    public List<Double> liquidezAcida(){
        List<Integer> anios = this.datosVariosRepository.getAnios();

        List<Double> liquidesAcida = new ArrayList<Double>();

        for(Integer anio: anios) {
          double inversiones = inversionesPorAnio(anio);
          double pasivoCorrientePorAnio = pasivoCorriente(anio);
          double disponibilidades = disponibilidadesPorAnio(anio);
          liquidesAcida.add(((disponibilidades-inversiones)/pasivoCorrientePorAnio));
        }
        return liquidesAcida;
    }

    public List<Double> liquidezCorriente(){
        List<Integer> anios = this.datosVariosRepository.getAnios();

        List<Double> liquidesCorriente = new ArrayList<Double>();

        for(Integer anio: anios) {
            double activoCorrientePorAnio = activoCorriente(anio);
            double pasivoCorrientePorAnio = pasivoCorriente(anio);
            liquidesCorriente.add(activoCorrientePorAnio/pasivoCorrientePorAnio);
        }
        return liquidesCorriente;
    }


    public List<Double> solvencia(){
        List<Integer> anios = this.datosVariosRepository.getAnios();

        List<Double> solvencia = new ArrayList<Double>();


        for(Integer anio: anios) {
            double capitalPropio = capitalPropioPorAnio(anio);
            double activoTotal = activoTotalPorAnio(anio);
            solvencia.add(capitalPropio/activoTotal);
        }
        return solvencia;
    }

    public List<Double> endeudamiento(){
        List<Integer> anios = this.datosVariosRepository.getAnios();

        List<Double> endeudamiento = new ArrayList<Double>();

        for(Integer anio: anios) {
            double capitalPropio = capitalPropioPorAnio(anio);
            double pasivoTotal = pasivoTotalPorAnio(anio);
            endeudamiento.add(pasivoTotal/capitalPropio);
        }
        return endeudamiento;
    }

    public List<Double> esfuerzoComercializacion(){
        List<Integer> anios = this.datosVariosRepository.getAnios();

        List<Double> esfuerzoComercial = new ArrayList<Double>();

        for(Integer anio: anios) {
            double gastosComerciales = gastosComercializacionPorAnio(anio);
            double ventas = ventasTotalesPorAnio(anio);
            esfuerzoComercial.add(gastosComerciales/ventas);
        }
        return esfuerzoComercial;
    }







}
