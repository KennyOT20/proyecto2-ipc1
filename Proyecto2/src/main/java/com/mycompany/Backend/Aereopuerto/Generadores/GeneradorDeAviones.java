/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Generadores;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Aviones.AvionGrande;
import com.mycompany.Backend.Aviones.AvionMediano;
import com.mycompany.Backend.Aviones.AvionPequeño;

/**
 *
 * @author Kenny
 */
public class GeneradorDeAviones extends Generadores {
    private int pasajerosMax;
    private int idAvion;
    
    public GeneradorDeAviones(){
    }
    
    public Avion crearAvionPequeño(){
        pasajerosMax = generarNumerosAleatorios(5, 10);
        idAvion = generarNumerosAleatorios(1000, 9999);
        return new AvionPequeño("PEQUEÑO", 5, pasajerosMax, idAvion );
    }
    
    public Avion crearAvionMediano(){
        pasajerosMax = generarNumerosAleatorios(15, 25);
        idAvion = generarNumerosAleatorios(1000, 9999);
        return new AvionMediano("MEDIANO", 15, pasajerosMax, idAvion);
    }
    
    public Avion crearAvionGrande(){
        pasajerosMax = generarNumerosAleatorios(30, 40);
        idAvion = generarNumerosAleatorios(1000, 9999);
        return new AvionGrande("GRANDE", 30, pasajerosMax, idAvion);
    }

    
}
