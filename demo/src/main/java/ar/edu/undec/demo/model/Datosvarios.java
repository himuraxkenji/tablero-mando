package ar.edu.undec.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Datosvarios {
    private Integer iddatosvarios;
    private Double gastosDeComercializacion;
    private Double ventasTotales;
    private Double activoCorriente;
    private Double activoNoCorriente;
    private Double pasivoCorriente;
    private Double pasivoNoCorriente;
    private Double disponibilidades;
    private Double inversionesACortoPlazo;
    private Double capitalPropio;
    private Integer anio;

    @Id
    @Column(name = "iddatosvarios", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIddatosvarios() {
        return iddatosvarios;
    }

    public void setIddatosvarios(Integer iddatosvarios) {
        this.iddatosvarios = iddatosvarios;
    }

    @Basic
    @Column(name = "gastos_de_comercializacion", nullable = true, precision = 0)
    public Double getGastosDeComercializacion() {
        return gastosDeComercializacion;
    }

    public void setGastosDeComercializacion(Double gastosDeComercializacion) {
        this.gastosDeComercializacion = gastosDeComercializacion;
    }

    @Basic
    @Column(name = "ventas_totales", nullable = true, precision = 0)
    public Double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(Double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Basic
    @Column(name = "activo_corriente", nullable = true, precision = 0)
    public Double getActivoCorriente() {
        return activoCorriente;
    }

    public void setActivoCorriente(Double activoCorriente) {
        this.activoCorriente = activoCorriente;
    }

    @Basic
    @Column(name = "activo_no_corriente", nullable = true, precision = 0)
    public Double getActivoNoCorriente() {
        return activoNoCorriente;
    }

    public void setActivoNoCorriente(Double activoNoCorriente) {
        this.activoNoCorriente = activoNoCorriente;
    }

    @Basic
    @Column(name = "pasivo_corriente", nullable = true, precision = 0)
    public Double getPasivoCorriente() {
        return pasivoCorriente;
    }

    public void setPasivoCorriente(Double pasivoCorriente) {
        this.pasivoCorriente = pasivoCorriente;
    }

    @Basic
    @Column(name = "pasivo_no_corriente", nullable = true, precision = 0)
    public Double getPasivoNoCorriente() {
        return pasivoNoCorriente;
    }

    public void setPasivoNoCorriente(Double pasivoNoCorriente) {
        this.pasivoNoCorriente = pasivoNoCorriente;
    }

    @Basic
    @Column(name = "disponibilidades", nullable = true, precision = 0)
    public Double getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(Double disponibilidades) {
        this.disponibilidades = disponibilidades;
    }

    @Basic
    @Column(name = "inversiones_a_corto_plazo", nullable = true, precision = 0)
    public Double getInversionesACortoPlazo() {
        return inversionesACortoPlazo;
    }

    public void setInversionesACortoPlazo(Double inversionesACortoPlazo) {
        this.inversionesACortoPlazo = inversionesACortoPlazo;
    }

    @Basic
    @Column(name = "capital_propio", nullable = true, precision = 0)
    public Double getCapitalPropio() {
        return capitalPropio;
    }

    public void setCapitalPropio(Double capitalPropio) {
        this.capitalPropio = capitalPropio;
    }

    @Basic
    @Column(name = "anio", nullable = true)
    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Datosvarios that = (Datosvarios) o;

        if (iddatosvarios != null ? !iddatosvarios.equals(that.iddatosvarios) : that.iddatosvarios != null)
            return false;
        if (gastosDeComercializacion != null ? !gastosDeComercializacion.equals(that.gastosDeComercializacion) : that.gastosDeComercializacion != null)
            return false;
        if (ventasTotales != null ? !ventasTotales.equals(that.ventasTotales) : that.ventasTotales != null)
            return false;
        if (activoCorriente != null ? !activoCorriente.equals(that.activoCorriente) : that.activoCorriente != null)
            return false;
        if (activoNoCorriente != null ? !activoNoCorriente.equals(that.activoNoCorriente) : that.activoNoCorriente != null)
            return false;
        if (pasivoCorriente != null ? !pasivoCorriente.equals(that.pasivoCorriente) : that.pasivoCorriente != null)
            return false;
        if (pasivoNoCorriente != null ? !pasivoNoCorriente.equals(that.pasivoNoCorriente) : that.pasivoNoCorriente != null)
            return false;
        if (disponibilidades != null ? !disponibilidades.equals(that.disponibilidades) : that.disponibilidades != null)
            return false;
        if (inversionesACortoPlazo != null ? !inversionesACortoPlazo.equals(that.inversionesACortoPlazo) : that.inversionesACortoPlazo != null)
            return false;
        if (capitalPropio != null ? !capitalPropio.equals(that.capitalPropio) : that.capitalPropio != null)
            return false;
        if (anio != null ? !anio.equals(that.anio) : that.anio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddatosvarios != null ? iddatosvarios.hashCode() : 0;
        result = 31 * result + (gastosDeComercializacion != null ? gastosDeComercializacion.hashCode() : 0);
        result = 31 * result + (ventasTotales != null ? ventasTotales.hashCode() : 0);
        result = 31 * result + (activoCorriente != null ? activoCorriente.hashCode() : 0);
        result = 31 * result + (activoNoCorriente != null ? activoNoCorriente.hashCode() : 0);
        result = 31 * result + (pasivoCorriente != null ? pasivoCorriente.hashCode() : 0);
        result = 31 * result + (pasivoNoCorriente != null ? pasivoNoCorriente.hashCode() : 0);
        result = 31 * result + (disponibilidades != null ? disponibilidades.hashCode() : 0);
        result = 31 * result + (inversionesACortoPlazo != null ? inversionesACortoPlazo.hashCode() : 0);
        result = 31 * result + (capitalPropio != null ? capitalPropio.hashCode() : 0);
        result = 31 * result + (anio != null ? anio.hashCode() : 0);
        return result;
    }
}
