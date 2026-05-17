/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aviones;

/**
 *
 * @author Kenny
 */
public class AvionGrande extends Avion{

    public AvionGrande(String tipo, int capacidadMin, int capacidadMax, int idAvion, int combustible) {
        super(tipo, capacidadMin, capacidadMax, idAvion, combustible);
    }

    public AvionGrande(int combustible, int minimaCapacidad, int capacidadMaxima, int idAvion, String tipo, int tiempoMantenimiento, int tiempoDesbordaje, int tiempoDespegue, int tiempoAterrizaje, int tiempoDeConsumo) {
        super(combustible, minimaCapacidad, capacidadMaxima, idAvion, tipo, tiempoMantenimiento, tiempoDesbordaje, tiempoDespegue, tiempoAterrizaje, tiempoDeConsumo);
    }
    
    
   
}
