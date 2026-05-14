/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Generadores;

import com.mycompany.Backend.Estaciones.Estacion;
import com.mycompany.Backend.Estaciones.EstacionDeControl;
import com.mycompany.Backend.Estaciones.EstacionDeMantenimiento;
import com.mycompany.Backend.Estaciones.EstacionDesbordaje;



/**
 *
 * @author Kenny
 */
public class GeneradorDeEstaciones extends Generadores {
    
    private int idEstacion;
    
   public Estacion crearEstacionDeContro(int capacidad){
       idEstacion = generarNumerosAleatorios(10000, 19999);
       return new EstacionDeControl(idEstacion, "Estacion de control", capacidad);
   }
    
   public Estacion crearEstacionDeMantenimiento(int capacidad){
       idEstacion = generarNumerosAleatorios(10000, 19999);
       return new EstacionDeMantenimiento(idEstacion, "Estacion de mantenimiento", capacidad);
   }
   
   public Estacion crearEstacionDeDesborde(int capacidad){
       idEstacion = generarNumerosAleatorios(10000, 19999);
       return new EstacionDesbordaje(idEstacion, "Estacion de desbordaje", capacidad);
   }
    
    
}
