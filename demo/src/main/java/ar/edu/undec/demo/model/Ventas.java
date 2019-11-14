package ar.edu.undec.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ventas {
    private Integer idventa;
    private String cliente;
    private BigDecimal importe;
    private BigDecimal contado;
    private BigDecimal credito;
    private String medio;
    private String destino;
    private String mes;

    @Id
    @Column(name = "idventa", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    @Basic
    @Column(name = "cliente", nullable = true, length = 254)
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Basic
    @Column(name = "importe", nullable = true, precision = 4)
    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    @Basic
    @Column(name = "contado", nullable = true, precision = 4)
    public BigDecimal getContado() {
        return contado;
    }

    public void setContado(BigDecimal contado) {
        this.contado = contado;
    }

    @Basic
    @Column(name = "credito", nullable = true, precision = 4)
    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    @Basic
    @Column(name = "medio", nullable = true, length = 254)
    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    @Basic
    @Column(name = "destino", nullable = true, length = 250)
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Basic
    @Column(name = "mes", nullable = true, length = 20)
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ventas ventas = (Ventas) o;

        if (idventa != null ? !idventa.equals(ventas.idventa) : ventas.idventa != null) return false;
        if (cliente != null ? !cliente.equals(ventas.cliente) : ventas.cliente != null) return false;
        if (importe != null ? !importe.equals(ventas.importe) : ventas.importe != null) return false;
        if (contado != null ? !contado.equals(ventas.contado) : ventas.contado != null) return false;
        if (credito != null ? !credito.equals(ventas.credito) : ventas.credito != null) return false;
        if (medio != null ? !medio.equals(ventas.medio) : ventas.medio != null) return false;
        if (destino != null ? !destino.equals(ventas.destino) : ventas.destino != null) return false;
        if (mes != null ? !mes.equals(ventas.mes) : ventas.mes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idventa != null ? idventa.hashCode() : 0;
        result = 31 * result + (cliente != null ? cliente.hashCode() : 0);
        result = 31 * result + (importe != null ? importe.hashCode() : 0);
        result = 31 * result + (contado != null ? contado.hashCode() : 0);
        result = 31 * result + (credito != null ? credito.hashCode() : 0);
        result = 31 * result + (medio != null ? medio.hashCode() : 0);
        result = 31 * result + (destino != null ? destino.hashCode() : 0);
        result = 31 * result + (mes != null ? mes.hashCode() : 0);
        return result;
    }
}
