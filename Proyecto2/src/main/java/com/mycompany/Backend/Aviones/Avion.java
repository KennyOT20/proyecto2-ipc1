/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aviones;

import com.mycompany.Backend.Vuelo.Vuelo;

/**
 *
 * @author Kenny
 */
public abstract class Avion{
    
    private final Vuelo vuelo;
    private final CabinaDeAvion controladorAvion;
    private String tipo;
    private int tiempoDeVuelo;
    private int tiempoDeAviso;
    private int combustible;
    private int idAvion;
    private int tiempoConsumo;
    private int capacidadMax;
    private int capacidadMin;
    private boolean estaVivo;

    public Avion(int tiempoDeVuelo, String tipo, int capacidadMin, int capacidadMax, int tiempoConsumo) {
        this.vuelo = new Vuelo();
        this.controladorAvion = new CabinaDeAvion(this);
        this.tiempoDeVuelo = tiempoDeVuelo;
        this.tipo = tipo;
        this.capacidadMax = capacidadMax;
        this.capacidadMin = capacidadMin;
        this.tiempoConsumo = tiempoConsumo;
        this.combustible = 100;
        this.estaVivo = true;
        
    }
    
    public void decrementarCombustible(){
        combustible = combustible - 5;
        
        if(combustible <= 0){
            combustible = 0;
            estaVivo = false;
        }
        
    }
    
    public boolean lanzarAvisoVueloFallado(){
        return estaVivo = false;
    }
    
    public boolean lanzarAvisoEmergencia(){
        return combustible <= 25;
    }
    
    public boolean lanzarAvisoNormal(){
        return tiempoDeVuelo >= tiempoDeAviso;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getCapacidadMin() {
        return capacidadMin;
    }

    public void setCapacidadMin(int capacidadMin) {
        this.capacidadMin = capacidadMin;
    }

    public int getTiempoDeVuelo() {
        return tiempoDeVuelo;
    }

    public void setTiempoDeVuelo(int tiempoDeVuelo) {
        this.tiempoDeVuelo = tiempoDeVuelo;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public CabinaDeAvion getControladorAvion() {
        return controladorAvion;
    }

    public int getTiempoDeAviso() {
        return tiempoDeAviso;
    }

    public void setTiempoDeAviso(int tiempoDeAviso) {
        this.tiempoDeAviso = tiempoDeAviso;
    }

    public int getTiempoConsumo() {
        return tiempoConsumo;
    }

    public void setTiempoConsumo(int tiempoConsumo) {
        this.tiempoConsumo = tiempoConsumo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
    
    
    
    
}
