/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto;

import com.mycompany.Backend.Aviones.Avion;

/**
 *
 * @author Kenny
 */
public interface Aereopuerto {
    
    public boolean estaLLena();
    public void ingresarAvion(Avion avion);
    public void liberarAvion();
    
}
