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
public class CabinaDeAvion implements Runnable{

    private final Avion avion;
    private String estadoDeAvion;
    private final String VOLANDO = "VOLANDO";
    private final String ATERRIZANDO = "ATERRIZANDO";
    private final String MANTENIMIENTO = "MANTENIMIENTO";
    
    public CabinaDeAvion(Avion avion){
        this.avion = avion;
    }
    
    @Override
    public void run() {
        
        try {
            while(avion.isEstaVivo()){
                
                switch(estadoDeAvion){
                    case VOLANDO:
                        controlarVuelo();
                        break;
                    case ATERRIZANDO:
                        break;
                    case MANTENIMIENTO:
                        break;
                    default:
                        break;
                }
                
            }
        } catch (Exception e) {
        }
    }
    
    /**
     * Metodo encargado de controlar el vuelo siempre y cuando el avion tenga combustible y evite chocar
     * gasta el combustible de la manera adecuada.
     * @throws InterruptedException 
     */
    private void controlarVuelo() throws InterruptedException{
        
        if(!avion.isEstaVivo()){
            avion.lanzarAvisoVueloFallado();
        }
        
        Thread.sleep(avion.getTiempoConsumo());
        
        avion.decrementarCombustible();
        
    }
    
    
    private void verificarTorreControl(){
        
    }

    
    // Getters y setters.
    public String getEstadoDeAvion() {
        return estadoDeAvion;
    }

    public void setEstadoDeAvion(String estadoDeAvion) {
        this.estadoDeAvion = estadoDeAvion;
    }
    
    
    
}
