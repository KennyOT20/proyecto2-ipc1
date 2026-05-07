/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.TorreDeControl;

import com.mycompany.Backend.Estaciones.EstacionDesbordaje;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import com.mycompany.Backend.Pistas.PistaDeAterrizaje;
import com.mycompany.Backend.Pistas.PistaDespegue;

/**
 *
 * @author Kenny
 */
public class TorreDeControl {
    
    private final ListaGenerica <PistaDeAterrizaje> pistasDeAterrizaje;
    private final ListaGenerica <PistaDespegue> pistasDeDespegue;
    private final ListaGenerica <EstacionDesbordaje> estacionDesborde;
    
    public TorreDeControl(){
        this.pistasDeAterrizaje = new ListaGenerica<>();
        this.pistasDeDespegue = new ListaGenerica<>();
        this.estacionDesborde = new ListaGenerica<>();
        
    }
    
    
    
}
