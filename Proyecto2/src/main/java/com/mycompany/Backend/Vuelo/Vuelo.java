/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Vuelo;

import com.mycompany.Backend.Aviones.Avion;

/**
 *
 * @author Kenny
 */
public class Vuelo {
    
    public void simularVuelo(Avion avionEnVuelo){
        
        avionEnVuelo.decrementarCombustible();
        
        if(avionEnVuelo.lanzarAviso()){
            
        }
        
    }
    
}
