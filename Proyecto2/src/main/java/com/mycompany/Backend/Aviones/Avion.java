/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aviones;

import com.mycompany.Backend.Vuelo.Vuelo;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public abstract class Avion{
    
    private boolean vueloFallado;
    private CabinaDeAvion controladorAvion;
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
    private int ultimoAvisoEnviado;

    //Constructor para guardar un avion en datos

    /**
     *
     * @param tipo
     * @param capacidadMin
     * @param capacidadMax
     * @param idAvion
     * @param combustible
     */
    public Avion(String tipo, int capacidadMin, int capacidadMax, int idAvion, int combustible) {
        this.tipo = tipo;
        this.capacidadMax = capacidadMax;
        this.capacidadMin = capacidadMin;
        this.idAvion = idAvion;
        this.combustible = combustible;
    }
    
    // Constructor para crear un avion con datos ya guardados
    public Avion(int combustible, int minimaCapacidad, int capacidadMaxima, int idAvion, String tipo, int tiempoMantenimiento
         , int tiempoDesbordaje, int tiempoDespegue, int tiempoAterrizaje, int tiempoDeConsumo){
        this.tiempoConsumo = tiempoDeConsumo;
        this.tiempoDeDesbordaje = tiempoDesbordaje;
        this.combustible = combustible;
        this.capacidadMin = minimaCapacidad;
        this.capacidadMax = capacidadMaxima;
        this.idAvion = idAvion;
        this.tipo = tipo;
        this.estaVivo = true;
        this.controladorAvion = new CabinaDeAvion(this);
        this.ultimoAvisoEnviado = 100;
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
    
    public boolean lanzarAvisoEmergencia() {
        return combustible <= 25;
    }   
    
    public boolean lanzarAvisoNormal() {

        if (combustible <= 60 && combustible % 10 == 0
                && combustible < ultimoAvisoEnviado) {

            ultimoAvisoEnviado = combustible;
            return true;
        }

        return false;
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
    
    public String getTipo() {
        return tipo;
    }
    
    
    
}
