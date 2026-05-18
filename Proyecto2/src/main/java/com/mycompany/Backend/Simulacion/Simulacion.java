/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Simulacion;

import com.mycompany.Backend.Aereopuerto.Aeropuerto;
import java.io.Serializable;

/**
 *
 * @author Kenny
 */
public class Simulacion implements Serializable {
    
    private final Aeropuerto aeropuerto;
    
    public Simulacion( Aeropuerto aeropuerto){
        this.aeropuerto = aeropuerto;
    }

    
     public void  iniciarSimulacion(){
         
     }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }
     
     
    
    
}
