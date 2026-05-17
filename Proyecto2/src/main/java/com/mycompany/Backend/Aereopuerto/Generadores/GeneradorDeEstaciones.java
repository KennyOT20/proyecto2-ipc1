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
    
    //Metodos creadores de estaciones para crear datos
    public Estacion crearEstacionDeContro(int capacidad){
        idEstacion = generarNumerosAleatorios(10000, 19999);
        return new EstacionDeControl(idEstacion, "DE CONTROL", capacidad);
    }

    public Estacion crearEstacionDeMantenimiento(int capacidad){
        idEstacion = generarNumerosAleatorios(10000, 19999);
        return new EstacionDeMantenimiento(idEstacion, "DE MANTENIMIENTO", capacidad);
    }

    public Estacion crearEstacionDeDesborde(int capacidad){
        idEstacion = generarNumerosAleatorios(10000, 19999);
        return new EstacionDesbordaje(idEstacion, "DE DESBORDAJE", capacidad);
    }
    
    //Metodos creadores para cargar datos
    
    public Estacion crearDeControl(int idEstacion, String tipo, int capacidad){
        return new EstacionDeControl(idEstacion, tipo, capacidad);
    }
    
    public Estacion crearDeMantenimiento(int idEstacion, String tipo, int capacidad){
        return new EstacionDeMantenimiento(idEstacion, tipo, capacidad);
    }
    
    public Estacion crearDeDesborde(int idEstacion, String tipo, int capacidad){
        return new EstacionDesbordaje(idEstacion, tipo, capacidad);
    }
    
    
}
