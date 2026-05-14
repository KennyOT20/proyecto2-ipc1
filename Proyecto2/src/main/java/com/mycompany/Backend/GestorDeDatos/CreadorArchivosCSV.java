/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.GestorDeDatos;

import java.io.File;

/**
 *
 * @author Kenny
 */
public class CreadorArchivosCSV {

    private final static String PATH_PRINCIPAL = "datos/";
    private String nombreDeDatos;
    
    private int cantidadDeAvionesGrandes;
    private int cantidadDeAvionesMedianos;
    private int cantidadDeAvionesPequeños;
    private int combustibleGrande;
    private int combustibleMediano;
    private int combustiblePequeño;
    private int tiempoAterrizaje;
    private int tiempoDespegue;
    private int tiempoConsumoGalon;
    private int tiempoMantenimiento;
    private int tiempoDesbordaje;
    private int cantidadPistasAterrizaje;
    private int cantidadPistasDespegue;
    private int cantidadEstacionesControl;
    private int cantidadEstacionDesbordaje;
    private int cantidadEstacionMantenimiento;
    private int capacidadAterrizaje;
    private int capacidadDespegue;
    private int capacidadControl;
    private int capacidadDesbordaje;
    private int capacidadMantenimiento;
    
    public CreadorArchivosCSV(String nombreDeDatos){
        this.nombreDeDatos = nombreDeDatos;
        crearCarpetaDeArchivos();
    }
    
    private void crearCarpetaDeArchivos(){
        File carpetaDeDatos = new File(obtenerPathCarpetas());
        
        if(carpetaDeDatos.exists() == false){
            carpetaDeDatos.mkdirs();
        }
    }
    
    public String obtenerPathCarpetas() {
        return PATH_PRINCIPAL + nombreDeDatos + "/";
    }

    public String obtenerArchivoAviones() {
        return obtenerPathCarpetas() + "aviones.csv";
    }

    public String obtenerArchivoControl() {
        return obtenerPathCarpetas() + "control.csv";
    }

    public String obtenerArchivoMantenimiento() {
        return obtenerPathCarpetas() + "mantenimiento.csv";
    }

    public String obtenerArchivoDesbordaje() {
        return obtenerPathCarpetas() + "desbordaje.csv";
    }

    public String obtenerArchivoAterrizaje() {
        return obtenerPathCarpetas() + "aterrizaje.csv";
    }

    public String obtenerArchivoDespegue() {
        return obtenerPathCarpetas() + "despegue.csv";
    }
    

    // SETTERS AVIONES
    public void setCantidadDeAvionesGrandes(int cantidadDeAvionesGrandes) {
        this.cantidadDeAvionesGrandes = cantidadDeAvionesGrandes;
    }

    public void setCantidadDeAvionesMedianos(int cantidadDeAvionesMedianos) {
        this.cantidadDeAvionesMedianos = cantidadDeAvionesMedianos;
    }

    public void setCantidadDeAvionesPequeños(int cantidadDeAvionesPequeños) {
        this.cantidadDeAvionesPequeños = cantidadDeAvionesPequeños;
    }

    // SETTERS COMBUSTIBLE
    public void setCombustibleGrande(int combustibleGrande) {
        this.combustibleGrande = combustibleGrande;
    }

    public void setCombustibleMediano(int combustibleMediano) {
        this.combustibleMediano = combustibleMediano;
    }

    public void setCombustiblePequeño(int combustiblePequeño) {
        this.combustiblePequeño = combustiblePequeño;
    }

    // SETTERS TIEMPOS
    public void setTiempoAterrizaje(int tiempoAterrizaje) {
        this.tiempoAterrizaje = tiempoAterrizaje;
    }

    public void setTiempoDespegue(int tiempoDespegue) {
        this.tiempoDespegue = tiempoDespegue;
    }

    public void setTiempoConsumoGalon(int tiempoConsumoGalon) {
        this.tiempoConsumoGalon = tiempoConsumoGalon;
    }

    public void setTiempoMantenimiento(int tiempoMantenimiento) {
        this.tiempoMantenimiento = tiempoMantenimiento;
    }

    public void setTiempoDesbordaje(int tiempoDesbordaje) {
        this.tiempoDesbordaje = tiempoDesbordaje;
    }

    // SETTERS CANTIDADES
    public void setCantidadPistasAterrizaje(int cantidadPistasAterrizaje) {
        this.cantidadPistasAterrizaje = cantidadPistasAterrizaje;
    }

    public void setCantidadPistasDespegue(int cantidadPistasDespegue) {
        this.cantidadPistasDespegue = cantidadPistasDespegue;
    }

    public void setCantidadEstacionesControl(int cantidadEstacionesControl) {
        this.cantidadEstacionesControl = cantidadEstacionesControl;
    }

    public void setCantidadEstacionDesbordaje(int cantidadEstacionDesbordaje) {
        this.cantidadEstacionDesbordaje = cantidadEstacionDesbordaje;
    }

    public void setCantidadEstacionMantenimiento(int cantidadEstacionMantenimiento) {
        this.cantidadEstacionMantenimiento = cantidadEstacionMantenimiento;
    }

    // SETTERS CAPACIDADES
    public void setCapacidadAterrizaje(int capacidadAterrizaje) {
        this.capacidadAterrizaje = capacidadAterrizaje;
    }

    public void setCapacidadDespegue(int capacidadDespegue) {
        this.capacidadDespegue = capacidadDespegue;
    }

    public void setCapacidadControl(int capacidadControl) {
        this.capacidadControl = capacidadControl;
    }

    public void setCapacidadDesbordaje(int capacidadDesbordaje) {
        this.capacidadDesbordaje = capacidadDesbordaje;
    }

    public void setCapacidadMantenimiento(int capacidadMantenimiento) {
        this.capacidadMantenimiento = capacidadMantenimiento;
    }

    
    
}
