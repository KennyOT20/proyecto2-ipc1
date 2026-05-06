/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aviones;

/**
 *
 * @author Kenny
 */
public abstract class Avion{
    
    private final CabinaDeAvion controladorAvion;
    private int tiempoDeVuelo;
    private int tiempoDeAviso;
    private int combustible;
    private int idAvion;
    private String tipo;
    private int capacidadMax;
    private int capacidadMin;
    private boolean estaVivo;

    public Avion(int tiempoDeVuelo, String tipo, int capacidadMin, int capacidadMax) {
        this.controladorAvion = new CabinaDeAvion(this);
        this.tiempoDeVuelo = tiempoDeVuelo;
        this.tipo = tipo;
        this.capacidadMax = capacidadMax;
        this.capacidadMin = capacidadMin;
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
    
    
    
}
