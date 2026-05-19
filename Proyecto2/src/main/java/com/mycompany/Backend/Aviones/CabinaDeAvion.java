/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aviones;

/**
 *
 * Clase encargada para controlar los tiempos de los vuelos, simula una cabina de control
 * dentro del avion ya que se encarga de controlar los avisos, controlar tiempos.
 * @author Kenny
 */
public class CabinaDeAvion implements Runnable {

    private final Avion avion;
    private String estadoDeAvion;
    private String estadoDeSolicitud;
    
    private boolean simulacionPausada;
    private boolean tienePermisoAterrizar;
    private boolean tienePermisoDespegar;
    private boolean tienePermisoDesborde;
    private boolean tienePermisoMantenimiento;
    
    private final String VOLANDO = "VOLANDO";
    private final String ATERRIZANDO = "ATERRIZANDO";
    private final String DESBORDAJE = "DESBORDAJE";
    private final String MANTENIMIENTO = "MANTENIMIENTO";
    private final String DESPEGUE = "DESPEGUE";
    
    private final String SIN_SOLICITUD = "SIN SOLICITUD";
    private final String SOLICITUD_NORMAL = "SOLICITUD NORMAL";
    private final String EMERGENCIA = "EMERGENCIA";

    public CabinaDeAvion(Avion avion) {
        this.avion = avion;
        this.simulacionPausada = false;
        this.estadoDeAvion = VOLANDO;
        this.tienePermisoAterrizar = false;
        this.tienePermisoDesborde = false;
        this.tienePermisoMantenimiento = false;
        this.tienePermisoDespegar = false;
        this.estadoDeSolicitud = SIN_SOLICITUD;
    }

    @Override
    public void run() {

        while (avion.isEstaVivo()) {

            try {

                if (simulacionPausada) {
                    Thread.sleep(200);
                    continue;
                }

                switch (estadoDeAvion) {

                    case VOLANDO:
                        controlarVuelo();
                        break;

                    case ATERRIZANDO:
                        controlarAterrizaje();
                        break;

                    case DESBORDAJE:
                        controlarDesbordaje();
                        break;

                    case MANTENIMIENTO:
                        controlarMantenimiento();
                        break;

                    case DESPEGUE:
                        controlarDespegue();
                        break;
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void controlarVuelo() {

        if (!avion.isEstaVivo()) {
            avion.lanzarAvisoVueloFallado();
            return;
        }

        if (!dormir(avion.getTiempoConsumo())) {
            return;
        }

        avion.decrementarCombustible();

        if (avion.lanzarAvisoEmergencia()) {
            solicitarEmergencia();

        } else if (avion.lanzarAvisoNormal()) {
            solicitarAterrizajeNormal();
        }

        if (tienePermisoAterrizar) {
            estadoDeAvion = ATERRIZANDO;
            estadoDeSolicitud = SIN_SOLICITUD;
            tienePermisoAterrizar = false;
        }
    }

    private void controlarAterrizaje() {
        if (!dormir(avion.getTiempoDeAterrizaje())){ 
            return;

        }

        if (tienePermisoDesborde) {
            estadoDeAvion = DESBORDAJE;
            tienePermisoDesborde = false;
        }
    }

    private void controlarDesbordaje() {
        if (!dormir(avion.getTiempoDeDesbordaje() * avion.getCapacidadMax())){
            return;
        }

        if (tienePermisoMantenimiento) {
            estadoDeAvion = MANTENIMIENTO;
            tienePermisoMantenimiento = false;
        }
    }

    private void controlarMantenimiento() {
        if (!dormir(avion.getTiempoDeMantenimiento())) {
            return;
        }

        if (tienePermisoDespegar) {
            estadoDeAvion = DESPEGUE;
            tienePermisoDespegar = false;
        }
    }

    private void controlarDespegue() {
        if (!dormir(avion.getTiempoDeDespegue())){
            return;
        }

        estadoDeAvion = VOLANDO;
    }

    private boolean dormir(int tiempo) {
        try {
            Thread.sleep(tiempo);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
    
    public String getEstadoSolicitud() {
        return estadoDeSolicitud;
    }   

    public void darPermisoDesborde(){
        tienePermisoDesborde = true;
    }
    
    public void darPermisoAterrizar(){
        tienePermisoAterrizar = true;
    }    
    
    public void darPermisoMantenimiento(){
        tienePermisoMantenimiento = true;
    }
    
    public void darPermisoDespegue(){
        tienePermisoDespegar = true;
    }
    
    public void pausarSimulacion() {
        simulacionPausada = true;
    }

    public void reanudarSimulacion() {
        simulacionPausada = false;
    }

    public String getEstadoDeAvion() {
        return estadoDeAvion;
    }

    public void setEstadoDeAvion(String estadoDeAvion) {
        this.estadoDeAvion = estadoDeAvion;
    }

    public void solicitarAterrizajeNormal() {
    estadoDeSolicitud = SOLICITUD_NORMAL;
    }

    public void solicitarEmergencia() {
        estadoDeSolicitud = EMERGENCIA;
    }
    
    public boolean isSimulacionPausada() {
        return simulacionPausada;
    }
}