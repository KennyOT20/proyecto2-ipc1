/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Constructores;

import com.mycompany.Backend.Aereopuerto.Aeropuerto;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDeAviones;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDeEstaciones;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDePistas;
import com.mycompany.Backend.GestorDeDatos.LectorArchivoCSV;

/**
 *
 * @author Kenny
 */
public class ConstructorPartida {
    
    private final LectorArchivoCSV leerArchivo;
    private final GeneradorDeAviones generarAvion;
    private final GeneradorDeEstaciones generarEstacion;
    private final GeneradorDePistas generarPista;
    private final Aeropuerto aeropuerto;
    private final String carpetaALeer;
    
    private int cantidadCombustible;
    private int tiempoDeMantenimiento;
    private int tiempoDeDesbordaje;
    private int tiempoDeDespegue;
    private int tiempoDeConsumo;
    
    
    private final String ARCHIVO_AVIONES = "aviones.csv";
    private final String ARCHIVO_PISTA_DE_ATERRIZAJE = "aterrizaje.csv";
    private final String ARCHIVO_ESTACIONES_DE_CONTROL = "control.csv";
    private final String ARCHIVO_ESTACIONES_DESBORDAJE = "desbordaje.csv";
    private final String ARCHIVO_PISTA_DESPEGUE = "despegue.csv";
    private final String ARCHIVO_ESTACIONES_DE_MANTENIMIENTO = "mantenimiento.csv";
    
    public ConstructorPartida(String carpetaALeer){
        this.carpetaALeer = carpetaALeer;
        this.leerArchivo = new LectorArchivoCSV(carpetaALeer);
        this.aeropuerto = new Aeropuerto();
        this.generarAvion = new GeneradorDeAviones();
        this.generarEstacion = new GeneradorDeEstaciones();
        this.generarPista = new GeneradorDePistas();
    }
    
    private void obtenerAviones(){
        
    }
    
    private void obtenerEstaciones(){
        
    }
    
    private void obtenerPistas(){
        
    }
    

  
}
