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
import com.mycompany.Backend.Estaciones.EstacionDeMantenimiento;
import com.mycompany.Backend.Estaciones.EstacionDesbordaje;
import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import com.mycompany.Backend.Pistas.Pista;
import com.mycompany.Backend.Pistas.PistaDeAterrizaje;
import com.mycompany.Backend.Pistas.PistaDespegue;

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

   public void gestionarAeropuerto() {
       conectarTorresConPistas();
        revisarAvionesVolando();
        enviarATorreControl();
        gestionarDesbordaje();
        gestionarMantenimiento();
    }
   
   private void conectarTorresConPistas() {
        try {
            ListaGenerica<EstacionDeControl> torres =aeropuerto.getEstacionDeControl();

           ListaGenerica<PistaDeAterrizaje> aterrizajes =aeropuerto.getPistasDeAterrizaje();

            ListaGenerica<PistaDespegue> despegues =aeropuerto.getPistasDeDespegue();

            for (int i = 0; i < torres.getTamañoDeLista(); i++) {
                EstacionDeControl torre = torres.obtenerContenido(i);

                for (int j = 0; j < aterrizajes.getTamañoDeLista(); j++) {
                    torre.agregarPistaAterrizaje(
                            aterrizajes.obtenerContenido(j)
                    );
                }

                for (int j = 0; j < despegues.getTamañoDeLista(); j++) {
                    torre.agregarPistaDespegue(
                            despegues.obtenerContenido(j)
                    );
                }
            }

        } catch (ListaEnlazadaExcepcion e) {
            e.printStackTrace();
        }
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
    
    private void enviarATorreControl() {

        try {
            ListaGenerica<EstacionDeControl> torres =
                    aeropuerto.getEstacionDeControl();

            for (int i = 0; i < torres.getTamañoDeLista(); i++) {

                EstacionDeControl torre = torres.obtenerContenido(i);

                if (!torre.estaLLena()) {

                    if (colaEmergencia.getTamañoDeLista() > 0) {

                        Avion avion = colaEmergencia.desencolar();

                        torre.getAvionesEnLista().encolar(avion);

                        return;
                    }

                    if (colaNormal.getTamañoDeLista() > 0) {

                        Avion avion = colaNormal.desencolar();

                        torre.getAvionesEnLista().encolar(avion);

                        return;
                    }
                }
            }

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
    
    private void gestionarDesbordaje() {

        try {
            ListaGenerica<PistaDeAterrizaje> pistas =aeropuerto.getPistasDeAterrizaje();

            ListaGenerica<EstacionDesbordaje> estaciones =aeropuerto.getEstacionDesborde();

            for (int i = 0; i < pistas.getTamañoDeLista(); i++) {

                PistaDeAterrizaje pista = pistas.obtenerContenido(i);

                if (pista.getAvionesEnLista().getTamañoDeLista() == 0) {
                    continue;
                }

                Avion avion = pista.getAvionesEnLista().obtenerContenido(0);
                CabinaDeAvion cabina = avion.getControladorAvion();

                if (!cabina.getEstadoDeAvion().equals("DESBORDAJE")) {
                    continue;
                }

                for (int j = 0; j < estaciones.getTamañoDeLista(); j++) {

                    EstacionDesbordaje estacion =
                            estaciones.obtenerContenido(j);

                    if (!estacion.estaLLena()) {

                        pista.liberarAvion();
                        estacion.ingresarAvion(avion);

                        cabina.darPermisoDesborde();
                        return;
                    }
                }
            }

        } catch (ListaEnlazadaExcepcion e) {
            e.printStackTrace();
        }
    }
    
    private void gestionarMantenimiento() {

        try {
            ListaGenerica<EstacionDesbordaje> desbordes =aeropuerto.getEstacionDesborde();

            ListaGenerica<EstacionDeMantenimiento> mantenimientos = aeropuerto.getEstacionDeMantenimiento();

            for (int i = 0; i < desbordes.getTamañoDeLista(); i++) {

                EstacionDesbordaje desborde = desbordes.obtenerContenido(i);

                if (desborde.getAvionesEnLista().getTamañoDeLista() == 0) {
                    continue;
                }

                Avion avion = desborde.getAvionesEnLista().obtenerContenido(0);
                CabinaDeAvion cabina = avion.getControladorAvion();

                if (!cabina.getEstadoDeAvion().equals("MANTENIMIENTO")) {
                    continue;
                }

                for (int j = 0; j < mantenimientos.getTamañoDeLista(); j++) {

                    EstacionDeMantenimiento mantenimiento =
                            mantenimientos.obtenerContenido(j);

                    if (!mantenimiento.estaLLena()) {

                        desborde.liberarAvion();
                        mantenimiento.ingresarAvion(avion);

                        cabina.darPermisoMantenimiento();
                        return;
                    }
                }
            }

        } catch (ListaEnlazadaExcepcion e) {
            e.printStackTrace();
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