/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Pistas;

import com.mycompany.Backend.Aereopuerto.Aereopuerto;
import com.mycompany.Backend.Aviones.Avion;

/**
 *
 * @author Kenny
 */
public class Pista implements Aereopuerto {
    
    private String tipoDePista;

    @Override
    public boolean estaLLena() {
        return false;
    }

    @Override
    public void ingresarAvion(Avion avion) {
    }

    @Override
    public void liberarAvion() {
    }
    
    
    
}
