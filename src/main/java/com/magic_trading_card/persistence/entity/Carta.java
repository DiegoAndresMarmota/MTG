package com.magic_trading_card.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartas")
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_coleccion")
    private Long numeroColeccion;

    @Column(name = "nombre_carta")
    private String nombreCarta;

    @Column(name = "nombre_juego_cartas")
    private String nombreJuegoCartas;

    @Column(name = "coleccion")
    private String coleccion;

    @Column(name = "costo_mana")
    private String costoMana;

    @Column(name = "tipo_carta")
    private String tipoCarta;

    @Column(name = "texto_carta", columnDefinition = "TEXT")
    private String textoCarta;

    @Column(name = "artista")
    private String artista;

    @Column(name = "rareza_carta")
    private String rareza;

    @Column(name = "acabado_brillante")
    private Boolean acabado;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "condicion")
    private String condicion;

    @Column(name = "stock")
    private Integer cantidad;

    public Long getNumeroColeccion() {
        return numeroColeccion;
    }

    public void setNumeroColeccion(Long numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public String getNombreJuegoCartas() {
        return nombreJuegoCartas;
    }

    public void setNombreJuegoCartas(String nombreJuegoCartas) {
        this.nombreJuegoCartas = nombreJuegoCartas;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getCostoMana() {
        return costoMana;
    }

    public void setCostoMana(String costoMana) {
        this.costoMana = costoMana;
    }

    public String getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(String tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public String getTextoCarta() {
        return textoCarta;
    }

    public void setTextoCarta(String textoCarta) {
        this.textoCarta = textoCarta;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public Boolean getAcabado() {
        return acabado;
    }

    public void setAcabado(Boolean acabado) {
        this.acabado = acabado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}
