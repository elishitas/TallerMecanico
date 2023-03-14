package com.besysoft.TallerMecanico.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrdenTrabajo implements Serializable {

    private Integer id;

    private Integer cantidadCuotas;

    private String detalleFalla;

    private String estado;

    private LocalDateTime fechaFinReparacion;

    private LocalDateTime fechaIngreso;

    private LocalDateTime fechaPago;

    private String formaPago;

    private BigDecimal importeTotal;

    private Integer kilometraje;

    private String nivelCombustible;

    private String tipoTarjeta;

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(Integer id, Integer cantidadCuotas, String detalleFalla, String estado, LocalDateTime fechaFinReparacion, LocalDateTime fechaIngreso, LocalDateTime fechaPago, String formaPago, BigDecimal importeTotal, Integer kilometraje, String nivelCombustible, String tipoTarjeta) {
        this.id = id;
        this.cantidadCuotas = cantidadCuotas;
        this.detalleFalla = detalleFalla;
        this.estado = estado;
        this.fechaFinReparacion = fechaFinReparacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
        this.importeTotal = importeTotal;
        this.kilometraje = kilometraje;
        this.nivelCombustible = nivelCombustible;
        this.tipoTarjeta = tipoTarjeta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getDetalleFalla() {
        return detalleFalla;
    }

    public void setDetalleFalla(String detalleFalla) {
        this.detalleFalla = detalleFalla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaFinReparacion() {
        return fechaFinReparacion;
    }

    public void setFechaFinReparacion(LocalDateTime fechaFinReparacion) {
        this.fechaFinReparacion = fechaFinReparacion;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(String nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
}
