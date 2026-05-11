/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Generadores;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Aviones.AvionGrande;
import com.mycompany.Backend.Aviones.AvionMediano;
import com.mycompany.Backend.Aviones.AvionPequeño;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public class GeneradorDeAviones {
    
    private final Random random;
    private int pasajerosMax;
    
    public GeneradorDeAviones(){
        this.random = new Random();
    }
    
    public Avion crearAvionPequeño(){
        pasajerosMax = generarNumerosAleatorios(5, 10);
        return new AvionPequeño("PEQUEÑO", 5, pasajerosMax );
    }
    
    public Avion crearAvionMediano(){
        pasajerosMax = generarNumerosAleatorios(15, 25);
        return new AvionMediano("MEDIANO", 15, pasajerosMax);
    }
    
    public Avion crearAvionGrande(){
        pasajerosMax = generarNumerosAleatorios(30, 40);
        return new AvionGrande("GRANDE", 30, pasajerosMax);
    }
    
    private int generarNumerosAleatorios(int min, int max){
        return random.nextInt(min, max);
    }
    
}
