/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Simulacion;

import com.mycompany.Backend.Aereopuerto.Aeropuerto;
import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Aviones.CabinaDeAvion;
import com.mycompany.Backend.Estaciones.Estacion;
import com.mycompany.Backend.Estaciones.EstacionDeControl;
import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import com.mycompany.Backend.Pistas.Pista;

/**
 *
 * @author Kenny
 */
public class ControladorTraficoAereo {

    private final Aeropuerto aeropuerto;

    private final ListaGenerica<Avion> colaNormal;
    private final ListaGenerica<Avion> colaEmergencia;

    public ControladorTraficoAereo(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
        this.colaNormal = new ListaGenerica<>();
        this.colaEmergencia = new ListaGenerica<>();
    }

    public void gestionarAterrizajes() {
        revisarAvionesVolando();
    }
    
    private void revisarAvionesVolando() {
        try {
            revisarLista(aeropuerto.getAvionesPequeños());
            revisarLista(aeropuerto.getAvionesMedianos());
            revisarLista(aeropuerto.getAvionesGrandes());

        } catch (ListaEnlazadaExcepcion e) {
            e.printStackTrace();
        }
    }
    
    private void revisarLista(ListaGenerica<Avion> lista) throws ListaEnlazadaExcepcion {

        for (int i = 0; i < lista.getTamañoDeLista(); i++) {

            Avion avion = lista.obtenerContenido(i);
            CabinaDeAvion cabina = avion.getControladorAvion();

            if (!cabina.getEstadoDeAvion().equals("VOLANDO")) {
                continue;
            }

            if (avion.lanzarAvisoEmergencia()) {

                if (!colaEmergencia.contiene(avion)) {
                    colaEmergencia.encolar(avion);
                }

            } else if (avion.lanzarAvisoNormal()) {

                if (!colaNormal.contiene(avion)) {
                    colaNormal.encolar(avion);
                }
            }
        }
    }
    
    public void asignarPistaAterrizaje(Pista pistaAterrizajeAsignada, Avion avionAsignado){
        pistaAterrizajeAsignada.getAvionesEnLista().encolar(avionAsignado);
        
    }
    
    public void asignarPistaDespegue(Pista pistaDespegueAsignada, Avion avionAsinado){
        pistaDespegueAsignada.getAvionesEnLista().encolar(avionAsinado);
    }
    
    public void asignarEstacionDesborde(Estacion estacionDesbordaje, Avion avionAsignado){
        estacionDesbordaje.getAvionesEnLista().encolar(avionAsignado);
        
    }
    
    public void asignarEstacionMantenimiento(Estacion estacionMantenimiento, Avion avionAsignado){
        estacionMantenimiento.getAvionesEnLista().encolar(avionAsignado);
    }
    
    public void comunicarTorreDeControlAterrizaje(EstacionDeControl estacion, Avion avionComunicado){
        estacion.getAvionesEnLista().encolar(avionComunicado);
    }
    
    public void comunicarTorreDeControlDespegue(EstacionDeControl estacion, Avion avionComunicado){
        estacion.getAvionesDespegue().encolar(avionComunicado);
    }
    
}