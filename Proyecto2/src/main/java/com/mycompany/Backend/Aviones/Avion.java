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
    private boolean vueloFallado;
    private final CabinaDeAvion controladorAvion;
    private String tipo;
    private int tiempoDeMantenimiento;
    private int tiempoDeDesbordaje;
    private int tiempoDeDespegue;
    private int tiempoDeAviso;
    private int combustible;
    private int idAvion;
    private int tiempoConsumo;
    private int capacidadMax;
    private int capacidadMin;
    private boolean estaVivo;
    private int tiempoDeAterrizaje;

    public Avion(String tipo, int capacidadMin, int capacidadMax) {
        this.vuelo = new Vuelo();
        this.controladorAvion = new CabinaDeAvion(this);
        this.tipo = tipo;
        this.capacidadMax = capacidadMax;
        this.capacidadMin = capacidadMin;
        this.combustible = 100;
        this.estaVivo = true;
        this.vueloFallado = false;
        
    }
    
    public void decrementarCombustible(){
        combustible = combustible - 1;
        
        if(combustible <= 0){
            combustible = 0;
            estaVivo = false;
        }
        
    }
    
    public boolean lanzarAvisoVueloFallado(){
        vueloFallado = true;
        return vueloFallado;
    }
    
    public boolean lanzarAvisoEmergencia(){
        return combustible <= 25;
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

    public int getTiempoDeDespegue() {
        return tiempoDeDespegue;
    }
    
    public void setTiempoDeVuelo(int tiempoDeVuelo) {
        this.tiempoDeDespegue = tiempoDeVuelo;
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

    public int getTiempoDeAterrizaje() {
        return tiempoDeAterrizaje;
    }

    public void setTiempoDeAterrizaje(int tiempoDeAterrizaje) {
        this.tiempoDeAterrizaje = tiempoDeAterrizaje;
    }

    public int getTiempoDeMantenimiento() {
        return tiempoDeMantenimiento;
    }

    public int getTiempoDeDesbordaje() {
        return tiempoDeDesbordaje;
    }

    public void setTiempoDeDesbordaje(int tiempoDeDesbordaje) {
        this.tiempoDeDesbordaje = tiempoDeDesbordaje;
    }
    
    public Vuelo getVuelo() {
        return vuelo;
    }
    
}
