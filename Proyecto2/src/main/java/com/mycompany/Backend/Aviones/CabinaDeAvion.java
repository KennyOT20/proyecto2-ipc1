/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aviones;

/**
 *
 * @author Kenny
 */
public class CabinaDeAvion implements Runnable{

    private final Avion avion;
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
                
            }
        } catch (Exception e) {
        }
    }
    
}
