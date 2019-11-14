package ar.edu.undec.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Rrhh {
    private Integer idEmpleado;
    private String apellido;
    private String nombre;
    private String departamento;
    private String puesto;
    private Double salario;
    private Integer faltas;
    private Integer cursosCapacitacion;
    private Integer horasExtras;
    private Integer despidos;
    private String fechaDespido;
    private String genero;

    @Id
    @Column(name = "idempleado", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Basic
    @Column(name = "apellido", nullable = true, length = 40)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "nombre", nullable = true, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "departamento", nullable = true, length = 30)
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Basic
    @Column(name = "puesto", nullable = true, length = 30)
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Basic
    @Column(name = "salario", nullable = true, precision = 0)
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "faltas", nullable = true)
    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    @Basic
    @Column(name = "cursos_capacitacion", nullable = true)
    public Integer getCursosCapacitacion() {
        return cursosCapacitacion;
    }

    public void setCursosCapacitacion(Integer cursosCapacitacion) {
        this.cursosCapacitacion = cursosCapacitacion;
    }

    @Basic
    @Column(name = "horas_extras", nullable = true)
    public Integer getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Basic
    @Column(name = "despidos", nullable = true)
    public Integer getDespidos() {
        return despidos;
    }

    public void setDespidos(Integer despidos) {
        this.despidos = despidos;
    }

    @Basic
    @Column(name = "fecha_despido", nullable = true, length = 45)
    public String getFechaDespido() {
        return fechaDespido;
    }

    public void setFechaDespido(String fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    @Basic
    @Column(name = "genero", nullable = true, length = 45)
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rrhh rrhh = (Rrhh) o;

        if (idEmpleado != null ? !idEmpleado.equals(rrhh.idEmpleado) : rrhh.idEmpleado != null) return false;
        if (apellido != null ? !apellido.equals(rrhh.apellido) : rrhh.apellido != null) return false;
        if (nombre != null ? !nombre.equals(rrhh.nombre) : rrhh.nombre != null) return false;
        if (departamento != null ? !departamento.equals(rrhh.departamento) : rrhh.departamento != null) return false;
        if (puesto != null ? !puesto.equals(rrhh.puesto) : rrhh.puesto != null) return false;
        if (salario != null ? !salario.equals(rrhh.salario) : rrhh.salario != null) return false;
        if (faltas != null ? !faltas.equals(rrhh.faltas) : rrhh.faltas != null) return false;
        if (cursosCapacitacion != null ? !cursosCapacitacion.equals(rrhh.cursosCapacitacion) : rrhh.cursosCapacitacion != null)
            return false;
        if (horasExtras != null ? !horasExtras.equals(rrhh.horasExtras) : rrhh.horasExtras != null) return false;
        if (despidos != null ? !despidos.equals(rrhh.despidos) : rrhh.despidos != null) return false;
        if (fechaDespido != null ? !fechaDespido.equals(rrhh.fechaDespido) : rrhh.fechaDespido != null) return false;
        if (genero != null ? !genero.equals(rrhh.genero) : rrhh.genero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmpleado != null ? idEmpleado.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (puesto != null ? puesto.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + (faltas != null ? faltas.hashCode() : 0);
        result = 31 * result + (cursosCapacitacion != null ? cursosCapacitacion.hashCode() : 0);
        result = 31 * result + (horasExtras != null ? horasExtras.hashCode() : 0);
        result = 31 * result + (despidos != null ? despidos.hashCode() : 0);
        result = 31 * result + (fechaDespido != null ? fechaDespido.hashCode() : 0);
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        return result;
    }
}
