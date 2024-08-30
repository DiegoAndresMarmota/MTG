package com.magic_trading_card.persistence.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_cartas")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ident_compra")
    private Long idCompra;

    @Column(name = "ident_comprador")
    private String idComprador;

    @Column(name = "fecha_compra")
    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    @Column(name = "detalle_compra")
    private String detalle;

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}
