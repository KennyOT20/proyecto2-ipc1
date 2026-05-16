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
        return new PistaDeAterrizaje(idPista, "De aterrizaje", capacidad);
    }
    
    public Pista crearPistaDespegue(int capacidad){
        idPista = generarNumerosAleatorios(100, 999);
        return new PistaDespegue(idPista, "De despegue", capacidad);
    }
    
}
