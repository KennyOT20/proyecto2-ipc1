/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.GestorDeDatos;

/**
 *
 * @author Kenny
 */
public class CreadorArchivosCSV {

    private final static String PATH_DATOS = "datos/";
    private final static String ARCHIVO_AVIONES = PATH_DATOS + "aviones.CSV";
    private final static String ARCHIVO_ESTACIONES_DE_CONTROL = PATH_DATOS + "control.CSV";
    private final static String ARCHIVO_ESTACIONES_DE_MANTENIMIENTO = PATH_DATOS + "mantenimiento.CSV";
    private final static String ARCHIVO_ESTACIONES_DE_DESBORDE = PATH_DATOS + "desbordaje.CSV";
    private final static String ARCHIVO_PISTAS_DE_ATERRIZAJE = PATH_DATOS + "desbordaje.CSV";
    private final static String ARCHIVO_PISTAS_DE_DESPLIEGUE = PATH_DATOS + "despliegue.CSV";
    
    // Aviones
    private int cantidadDeAvionesGrandes;
    private int cantidadDeAvionesMedianos;
    private int cantidadDeAvionesPequeños;

    // Combustible
    private int combustibleGrande;
    private int combustibleMediano;
    private int combustiblePequeño;

    // Tiempos
    private int tiempoAterrizaje;
    private int tiempoDespegue;
    private int tiempoConsumoGalon;
    private int tiempoMantenimiento;
    private int tiempoDesbordaje;

    // Cantidades de areas
    private int cantidadPistasAterrizaje;
    private int cantidadPistasDespegue;
    private int cantidadEstacionesControl;
    private int cantidadEstacionDesbordaje;
    private int cantidadEstacionMantenimiento;

    // Capacidades
    private int capacidadAterrizaje;
    private int capacidadDespegue;
    private int capacidadControl;
    private int capacidadDesbordaje;
    private int capacidadMantenimiento;
    
    public void guardarAviones(){
        
    }
    
    public void guardarEstacionesDeControl(){
        
    }
    
    public void guardarEstacionesDeAterrizaje(){
        
    }
    
    public void guardarEstacionesDeMantenimiento(){
        
    }
    
    public void guardarPistasDeAterrizaje(){
        
    }
    
    public void guardarPistasDeDespliegue(){
        
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
