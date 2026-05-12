/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Generadores;

import java.util.Random;

/**
 *
 * @author Kenny
 */
public class Generadores {
    
    private final Random random;
    
    public Generadores(){
        this.random = new Random();
    }
    
     protected int generarNumerosAleatorios(int min, int max){
        return random.nextInt(min, max);
    }
    
}
