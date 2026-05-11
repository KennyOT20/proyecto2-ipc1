/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Estaciones.EstacionDeControl;
import com.mycompany.Backend.Estaciones.EstacionDeMantenimiento;
import com.mycompany.Backend.Estaciones.EstacionDesbordaje;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import com.mycompany.Backend.Pistas.PistaDeAterrizaje;
import com.mycompany.Backend.Pistas.PistaDespegue;
import java.io.Serializable;

/**
 *
 * @author Kenny
 */
public class Aeropuerto implements Serializable {
    
    private final ListaGenerica <Avion> avionesAreopuerto;
    private final ListaGenerica <PistaDeAterrizaje> pistasDeAterrizaje;
    private final ListaGenerica <PistaDespegue> pistasDeDespegue;
    private final ListaGenerica <EstacionDesbordaje> estacionDesborde;
    private final ListaGenerica <EstacionDeMantenimiento> estacionDeMantenimiento;
    private final ListaGenerica <EstacionDeControl> estacionDeControl;
    
    private int cantidadPistasAterrizaje;
    private int cantidadPistasDespegue;
    private int cantidadEstacionDesborde;
    private int cantidadEstacionMantenimiento;
    
    public Aeropuerto(){
        this.avionesAreopuerto = new ListaGenerica<>();
        this.pistasDeAterrizaje = new ListaGenerica<>();
        this.pistasDeDespegue = new ListaGenerica<>();
        this.estacionDesborde = new ListaGenerica<>();
        this.estacionDeMantenimiento = new ListaGenerica<>();
        this.estacionDeControl = new ListaGenerica<>();
    }
    
    
    
}
