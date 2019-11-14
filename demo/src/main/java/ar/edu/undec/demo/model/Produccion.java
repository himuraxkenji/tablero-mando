package ar.edu.undec.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produccion {
    private Integer id;
    private String producto;
    private Double productoEnProceso;
    private Double productoTerminados;
    private Double defectuosos;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "producto", nullable = true, length = 5)
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Basic
    @Column(name = "producto_en_proceso", nullable = true, precision = 0)
    public Double getProductoEnProceso() {
        return productoEnProceso;
    }

    public void setProductoEnProceso(Double productoEnProceso) {
        this.productoEnProceso = productoEnProceso;
    }

    @Basic
    @Column(name = "producto_terminados", nullable = true, precision = 0)
    public Double getProductoTerminados() {
        return productoTerminados;
    }

    public void setProductoTerminados(Double productoTerminados) {
        this.productoTerminados = productoTerminados;
    }

    @Basic
    @Column(name = "defectuosos", nullable = true, precision = 0)
    public Double getDefectuosos() {
        return defectuosos;
    }

    public void setDefectuosos(Double defectuosos) {
        this.defectuosos = defectuosos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produccion that = (Produccion) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (producto != null ? !producto.equals(that.producto) : that.producto != null) return false;
        if (productoEnProceso != null ? !productoEnProceso.equals(that.productoEnProceso) : that.productoEnProceso != null)
            return false;
        if (productoTerminados != null ? !productoTerminados.equals(that.productoTerminados) : that.productoTerminados != null)
            return false;
        if (defectuosos != null ? !defectuosos.equals(that.defectuosos) : that.defectuosos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (producto != null ? producto.hashCode() : 0);
        result = 31 * result + (productoEnProceso != null ? productoEnProceso.hashCode() : 0);
        result = 31 * result + (productoTerminados != null ? productoTerminados.hashCode() : 0);
        result = 31 * result + (defectuosos != null ? defectuosos.hashCode() : 0);
        return result;
    }
}
