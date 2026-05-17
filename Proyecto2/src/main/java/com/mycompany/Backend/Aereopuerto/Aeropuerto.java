/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Estaciones.Estacion;
import com.mycompany.Backend.Estaciones.EstacionDeControl;
import com.mycompany.Backend.Estaciones.EstacionDeMantenimiento;
import com.mycompany.Backend.Estaciones.EstacionDesbordaje;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import com.mycompany.Backend.Pistas.Pista;
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
    
    public void agregarAvionSegunTipo(Avion avion) {
        switch (avion.getTipo()) {
            case "PEQUEÑO":
                avionesPequeños.agregarContenidoAlFinal(avion);
                break;

            case "MEDIANO":
                avionesMedianos.agregarContenidoAlFinal(avion);
                break;

            case "GRANDE":
                avionesGrandes.agregarContenidoAlFinal(avion);
                break;
        }
    }
    
    public void agregarEstacionPorTipo(Estacion estacionObtenida){
        switch(estacionObtenida.getTipoDeArea()){
            case "DE CONTROL" :
                estacionDeControl.agregarContenidoAlFinal((EstacionDeControl) estacionObtenida);
                break;
            case "DE MANTENIMIENTO":
                estacionDeMantenimiento.agregarContenidoAlFinal((EstacionDeMantenimiento) estacionObtenida);
                break;
            case "DE DESBORDAJE":
                estacionDesborde.agregarContenidoAlFinal((EstacionDesbordaje) estacionObtenida);
                break;
        }
    }
    
    public void agregarPistasPorTipo(Pista pistaObtenida){
        switch(pistaObtenida.getTipoDeArea()){
            case  "DE ATERRIZAJE" :
                pistasDeAterrizaje.agregarContenidoAlFinal((PistaDeAterrizaje) pistaObtenida);
                break;
            case  "DE DESPEGUE" :
                pistasDeDespegue.agregarContenidoAlFinal((PistaDespegue) pistaObtenida);
             break;
        }
    }

    public ListaGenerica<Avion> getAvionesPequeños() {
        return avionesPequeños;
    }

    public ListaGenerica<Avion> getAvionesGrandes() {
        return avionesGrandes;
    }

    public ListaGenerica<Avion> getAvionesMedianos() {
        return avionesMedianos;
    }

    public ListaGenerica<PistaDeAterrizaje> getPistasDeAterrizaje() {
        return pistasDeAterrizaje;
    }

    public ListaGenerica<PistaDespegue> getPistasDeDespegue() {
        return pistasDeDespegue;
    }

    public ListaGenerica<EstacionDesbordaje> getEstacionDesborde() {
        return estacionDesborde;
    }

    public ListaGenerica<EstacionDeMantenimiento> getEstacionDeMantenimiento() {
        return estacionDeMantenimiento;
    }

    public ListaGenerica<EstacionDeControl> getEstacionDeControl() {
        return estacionDeControl;
    }

    
}
