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
    
    private  ListaGenerica <Avion> avionesPequeños;
    private  ListaGenerica <Avion> avionesGrandes;
    private  ListaGenerica <Avion>  avionesMedianos;
    private  ListaGenerica <PistaDeAterrizaje> pistasDeAterrizaje;
    private  ListaGenerica <PistaDespegue> pistasDeDespegue;
    private  ListaGenerica <EstacionDesbordaje> estacionDesborde;
    private  ListaGenerica <EstacionDeMantenimiento> estacionDeMantenimiento;
    private  ListaGenerica <EstacionDeControl> estacionDeControl;
    
    public Aeropuerto(){
        this.avionesGrandes = new ListaGenerica<>();
        this.avionesMedianos = new ListaGenerica<>();
        this.avionesPequeños = new ListaGenerica<>();
        this.pistasDeAterrizaje = new ListaGenerica<>();
        this.pistasDeDespegue = new ListaGenerica<>();
        this.estacionDesborde = new ListaGenerica<>();
        this.estacionDeMantenimiento = new ListaGenerica<>();
        this.estacionDeControl = new ListaGenerica<>();
    }

    public ListaGenerica<Avion> getAvionesPequeños() {
        return avionesPequeños;
    }

    public void setAvionesPequeños(ListaGenerica<Avion> avionesPequeños) {
        this.avionesPequeños = avionesPequeños;
    }

    public ListaGenerica<Avion> getAvionesGrandes() {
        return avionesGrandes;
    }

    public void setAvionesGrandes(ListaGenerica<Avion> avionesGrandes) {
        this.avionesGrandes = avionesGrandes;
    }

    public ListaGenerica<Avion> getAvionesMedianos() {
        return avionesMedianos;
    }

    public void setAvionesMedianos(ListaGenerica<Avion> avionesMedianos) {
        this.avionesMedianos = avionesMedianos;
    }

    public ListaGenerica<PistaDeAterrizaje> getPistasDeAterrizaje() {
        return pistasDeAterrizaje;
    }

    public void setPistasDeAterrizaje(ListaGenerica<PistaDeAterrizaje> pistasDeAterrizaje) {
        this.pistasDeAterrizaje = pistasDeAterrizaje;
    }

    public ListaGenerica<PistaDespegue> getPistasDeDespegue() {
        return pistasDeDespegue;
    }

    public void setPistasDeDespegue(ListaGenerica<PistaDespegue> pistasDeDespegue) {
        this.pistasDeDespegue = pistasDeDespegue;
    }

    public ListaGenerica<EstacionDesbordaje> getEstacionDesborde() {
        return estacionDesborde;
    }

    public void setEstacionDesborde(ListaGenerica<EstacionDesbordaje> estacionDesborde) {
        this.estacionDesborde = estacionDesborde;
    }

    public ListaGenerica<EstacionDeMantenimiento> getEstacionDeMantenimiento() {
        return estacionDeMantenimiento;
    }

    public void setEstacionDeMantenimiento(ListaGenerica<EstacionDeMantenimiento> estacionDeMantenimiento) {
        this.estacionDeMantenimiento = estacionDeMantenimiento;
    }

    public ListaGenerica<EstacionDeControl> getEstacionDeControl() {
        return estacionDeControl;
    }

    public void setEstacionDeControl(ListaGenerica<EstacionDeControl> estacionDeControl) {
        this.estacionDeControl = estacionDeControl;
    }
    
}
