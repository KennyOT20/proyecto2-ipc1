/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.GestorDeDatos;

import com.mycompany.Backend.Aereopuerto.Aeropuerto;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public class CreadorDeDatos {
    
    private final Aeropuerto aeropuerto;
    private int avionesGrandes;
    private int avionesPequeños;
    private int avionesMedianos;
    private int estacionesDeControl;
    private int capacidadDeControl;
    private int estacionesDeMantenimiento;
    private int capacidadDeMantenimiento;
    private int estacionesDeDesbordaje;
    private int capacidadDeDesbordaje;
    
    public CreadorDeDatos(){
        this.aeropuerto = new Aeropuerto();
    }
    
    public void crearDatos(){
        
    }
    
    public int getAvionesGrandes() {
        return avionesGrandes;
    }

    public void setAvionesGrandes(int avionesGrandes) {
        this.avionesGrandes = avionesGrandes;
    }

    public int getAvionesPequeños() {
        return avionesPequeños;
    }

    public void setAvionesPequeños(int avionesPequeños) {
        this.avionesPequeños = avionesPequeños;
    }

    public int getAvionesMedianos() {
        return avionesMedianos;
    }

    public void setAvionesMedianos(int avionesMedianos) {
        this.avionesMedianos = avionesMedianos;
    }

    public int getEstacionesDeControl() {
        return estacionesDeControl;
    }

    public void setEstacionesDeControl(int estacionesDeControl) {
        this.estacionesDeControl = estacionesDeControl;
    }

    public int getCapacidadDeControl() {
        return capacidadDeControl;
    }

    public void setCapacidadDeControl(int capacidadDeControl) {
        this.capacidadDeControl = capacidadDeControl;
    }

    public int getEstacionesDeMantenimiento() {
        return estacionesDeMantenimiento;
    }

    public void setEstacionesDeMantenimiento(int estacionesDeMantenimiento) {
        this.estacionesDeMantenimiento = estacionesDeMantenimiento;
    }

    public int getCapacidadDeMantenimiento() {
        return capacidadDeMantenimiento;
    }

    public void setCapacidadDeMantenimiento(int capacidadDeMantenimiento) {
        this.capacidadDeMantenimiento = capacidadDeMantenimiento;
    }

    public int getEstacionesDeDesbordaje() {
        return estacionesDeDesbordaje;
    }

    public void setEstacionesDeDesbordaje(int estacionesDeDesbordaje) {
        this.estacionesDeDesbordaje = estacionesDeDesbordaje;
    }

    public int getCapacidadDeDesbordaje() {
        return capacidadDeDesbordaje;
    }

    public void setCapacidadDeDesbordaje(int capacidadDeDesbordaje) {
        this.capacidadDeDesbordaje = capacidadDeDesbordaje;
    }

}
