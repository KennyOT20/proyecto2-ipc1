/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Pistas;

import com.mycompany.Backend.Aereopuerto.AreaDeAviones;

/**
 *
 * @author Kenny
 */
public class Pista extends AreaDeAviones{
    
    public Pista(int idDeArea, String tipoDeArea, int capacidadMaxima) {
        super(idDeArea, tipoDeArea, capacidadMaxima);
        setCapacidadMaxima(capacidadMaxima);
    }
    


}
