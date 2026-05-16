/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.GestorDeDatos;

import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDeAviones;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDeEstaciones;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDePistas;
import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Estaciones.Estacion;
import com.mycompany.Backend.Pistas.Pista;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kenny
 */
public class CreadorArchivosCSV {

    private final GeneradorDeAviones crearAviones;
    private final GeneradorDeEstaciones crearEstaciones;
    private final GeneradorDePistas crearPistas;
    private final static String PATH_PRINCIPAL = "datos/";
    private final String nombreDeDatos;
    
    private int cantidadDeAvionesGrandes;
    private int cantidadDeAvionesMedianos;
    private int cantidadDeAvionesPequeños;
    private int combustibleGrande;
    private int combustibleMediano;
    private int combustiblePequeño;
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
        this.crearAviones = new GeneradorDeAviones();
        this.crearEstaciones = new GeneradorDeEstaciones();
        this.crearPistas = new GeneradorDePistas();
    }
    
    
    private void crearCarpetaDeArchivos(){
        File carpetaDeDatos = new File(obtenerPathCarpetas());
        
        if(carpetaDeDatos.exists() == false){
            carpetaDeDatos.mkdirs();
        }
    }
    
    public void guardarDatos(){
        crearCarpetaDeArchivos();
        guardarAviones();
        guardarEstaciones();
        guardarPistas();
    }
    
    private void guardarAviones(){
        File archivoAviones = new File(obtenerArchivoAviones());
        guardarAvionesPequeños(archivoAviones);
        guardarAvionesMedianos(archivoAviones);
        guardarAvionesGrandes(archivoAviones);
        
    }
    
    private void guardarEstaciones(){
        File archivoControl = new File(obtenerArchivoControl());
        File archivoMantenimiento = new File(obtenerArchivoMantenimiento());
        File archivoDesbordaje = new File(obtenerArchivoDesbordaje());
        
        guardarEstacionDeControl(archivoControl);
        guardarEstacionesDeMantenimiento(archivoMantenimiento);
        guardarEstacionDesbordaje(archivoDesbordaje);
    }
    
    private void guardarPistas(){
        File archivoPistaDeAterrizaje = new File(obtenerArchivoAterrizaje());
        File archivoPistaDeDespegue = new File(obtenerArchivoDespegue());
        
        guardarPistasDeAterrizaje(archivoPistaDeAterrizaje);
        guardarPistasDeDespeje(archivoPistaDeDespegue);
        
    }
    
    private void guardarPistasDeAterrizaje(File archivoPistaDeAterrizaje){
        try (FileWriter fileWriter = new FileWriter(archivoPistaDeAterrizaje, true)){ 
            
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            for (int i = 0; i < cantidadPistasAterrizaje; i++) {
                Pista pistasDeAterrizaje = crearPistas.crearPistaAterrizaje(capacidadAterrizaje);
                
                String lineaCSVAterrizaje = pistasDeAterrizaje.getTipoDeArea() + ", " +
                        pistasDeAterrizaje.getIdDeArea() + ", " + pistasDeAterrizaje.getCapacidadMaxima();
                
                printWriter.println(lineaCSVAterrizaje);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void guardarPistasDeDespeje(File archivoPistaDespeje){
        try (FileWriter fileWriter = new FileWriter(archivoPistaDespeje, true)){ 
            
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            for (int i = 0; i < cantidadPistasDespegue; i++) {
                Pista pistaDeDespegue = crearPistas.crearPistaDespegue(capacidadDespegue);
                
                String lineaCSVDespegue = pistaDeDespegue.getTipoDeArea() + ", " +
                        pistaDeDespegue.getIdDeArea() + ", " + pistaDeDespegue.getCapacidadMaxima();
                
                printWriter.println(lineaCSVDespegue);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     private void guardarAvionesPequeños(File archivoAviones){
        
        try (FileWriter fileWriter = new FileWriter(archivoAviones, true)){ 
            
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            for (int i = 0; i < cantidadDeAvionesMedianos; i++) {
                Avion avionPequeño = crearAviones.crearAvionPequeño(combustiblePequeño);
                
                String lineaCSV = avionPequeño.getIdAvion() + ", " + avionPequeño.getCombustible() + ", " + avionPequeño.getCapacidadMin() + ", "+ avionPequeño.getCapacidadMax() 
                        + ", " + avionPequeño.getTipo();
                
                printWriter.println(lineaCSV);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
     
     private void guardarAvionesGrandes(File archivoAviones){
         try (FileWriter fileWriter = new FileWriter(archivoAviones, true)) {
             PrintWriter printWriter = new PrintWriter(fileWriter);
            
            for (int i = 0; i < cantidadDeAvionesGrandes; i++) {
                Avion avionGrande = crearAviones.crearAvionGrande(combustibleGrande);
                
                String lineaCSV = avionGrande.getIdAvion() + ", " + avionGrande.getCombustible() + ", " + avionGrande.getCapacidadMin() + ", "+ avionGrande.getCapacidadMax() 
                        + ", " + avionGrande.getTipo();
                
                printWriter.println(lineaCSV);
            }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     
     private void guardarAvionesMedianos(File archivoAviones){
         try (FileWriter fileWriter = new FileWriter(archivoAviones, true)) {
             PrintWriter printWriter = new PrintWriter(fileWriter);
            
            for (int i = 0; i < cantidadDeAvionesPequeños; i++) {
                Avion avionMediano = crearAviones.crearAvionMediano(combustibleMediano);
                
                String lineaCSV = avionMediano.getIdAvion() + ", " + avionMediano.getCombustible() + ", " + avionMediano.getCapacidadMin() + ", "+ avionMediano.getCapacidadMax() 
                        + ", " + avionMediano.getTipo();
                
                printWriter.println(lineaCSV);
            }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     
     private void guardarEstacionesDeMantenimiento(File archivoMantenimiento){
         try (FileWriter fileWriter = new FileWriter(archivoMantenimiento, true )) {
             PrintWriter printWriter = new PrintWriter(fileWriter);
             
             for (int i = 0; i < cantidadEstacionMantenimiento; i++) {
                 Estacion estacionDeMantenimiento = crearEstaciones.crearEstacionDeMantenimiento(capacidadMantenimiento);
                 
                 String lineaCSVMantenimiento = estacionDeMantenimiento.getTipoDeArea() + ", " + 
                         estacionDeMantenimiento.getIdDeArea() + ", " + estacionDeMantenimiento.getCapacidadMaxima();
                 
                 printWriter.println(lineaCSVMantenimiento);
             }
             
         } catch (Exception e) {
         }
     }
     
     private void guardarEstacionDeControl(File archivoControl){
         try (FileWriter fileWriter = new FileWriter(archivoControl, true )) {
             PrintWriter printWriter = new PrintWriter(fileWriter);
             
             for (int i = 0; i < cantidadEstacionesControl; i++) {
                 Estacion estacionDeControl = crearEstaciones.crearEstacionDeContro(capacidadControl);
                 
                 String lineaCSVControl = estacionDeControl.getTipoDeArea() + ", " + estacionDeControl.getIdDeArea() + ", " + 
                         estacionDeControl.getCapacidadMaxima();
                 
                 printWriter.println(lineaCSVControl);
             }
             
         } catch (Exception e) {
         }
     }
     
     private void guardarEstacionDesbordaje(File archivoDesbordaje){
         try (FileWriter fileWriter = new FileWriter(archivoDesbordaje, true )) {
             PrintWriter printWriter = new PrintWriter(fileWriter);
             
             for (int i = 0; i < cantidadEstacionDesbordaje; i++) {
                 Estacion estacionDeMantenimiento = crearEstaciones.crearEstacionDeDesborde(capacidadDesbordaje);
                 
                 String lineaCSVDesbordaje = estacionDeMantenimiento.getTipoDeArea() + ", " + estacionDeMantenimiento.getIdDeArea() + ", " 
                         + estacionDeMantenimiento.getCapacidadMaxima();
                 
                 printWriter.println(lineaCSVDesbordaje);
             }
             
         } catch (Exception e) {
         }
     }
    
    public boolean verificarNombreRepetido() {
        File carpetaDeDatos = new File(obtenerPathCarpetas());
        return carpetaDeDatos.exists();
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
