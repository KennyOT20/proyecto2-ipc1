/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Generadores;

import com.mycompany.Backend.Pistas.Pista;
import com.mycompany.Backend.Pistas.PistaDeAterrizaje;
import com.mycompany.Backend.Pistas.PistaDespegue;

/**
 *
 * @author Kenny
 */
public class GeneradorDePistas extends Generadores{
    
    private int idPista;
    
    public Pista crearPistaAterrizaje(int capacidad){
        idPista = generarNumerosAleatorios(100, 999);
        return new PistaDeAterrizaje(idPista, "DE ATERRIZAJE", capacidad);
    }
    
    public Pista crearPistaDespegue(int capacidad){
        idPista = generarNumerosAleatorios(100, 999);
        return new PistaDespegue(idPista, "DE DESPEGUE", capacidad);
    }
    
    //Para crear una pista mediante una carga de datos
    
    public Pista deAterrizaje(int capacidad, int id, String tipo){
        return new PistaDeAterrizaje(id, tipo, capacidad);
    }
    
    public Pista deDespeuge(int capacidad, int id, String tipo){
        return new PistaDespegue(id, tipo, capacidad);
    }
    
}
