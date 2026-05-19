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

    private boolean simulacionPausada;

    private final String VOLANDO = "VOLANDO";
    private final String ATERRIZANDO = "ATERRIZANDO";
    private final String DESBORDAJE = "DESBORDAJE";
    private final String MANTENIMIENTO = "MANTENIMIENTO";
    private final String DESPEGUE = "DESPEGUE";

    public CabinaDeAvion(Avion avion) {
        this.avion = avion;
        this.simulacionPausada = false;
        this.estadoDeAvion = VOLANDO;
    }

    @Override
    public void run() {

        while (avion.isEstaVivo()) {

            try {

                // Manejo de pausa
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

        dormir(avion.getTiempoConsumo());
        avion.decrementarCombustible();

        // Ejemplo simple de transición
        if (avion.getCombustible() <= 3) {
            estadoDeAvion = ATERRIZANDO;
        }
    }

    private void controlarAterrizaje() {
        dormir(avion.getTiempoDeAterrizaje());
        estadoDeAvion = DESBORDAJE;
    }

    private void controlarDesbordaje() {
        dormir(avion.getTiempoDeDesbordaje() * avion.getCapacidadMax());
        estadoDeAvion = MANTENIMIENTO;
    }

    private void controlarMantenimiento() {
        dormir(avion.getTiempoDeMantenimiento());
        estadoDeAvion = DESPEGUE;
    }

    private void controlarDespegue() {
        dormir(avion.getTiempoDeDespegue());

        // IMPORTANTE: cerrar ciclo
        estadoDeAvion = VOLANDO;
    }

    // Método auxiliar
    private void dormir(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Control de simulación
    public void pausarSimulacion() {
        simulacionPausada = true;
    }

    public void reanudarSimulacion() {
        simulacionPausada = false;
    }

    // Getters y setters
    public String getEstadoDeAvion() {
        return estadoDeAvion;
    }

    public void setEstadoDeAvion(String estadoDeAvion) {
        this.estadoDeAvion = estadoDeAvion;
    }

    public boolean isSimulacionPausada() {
        return simulacionPausada;
    }
}