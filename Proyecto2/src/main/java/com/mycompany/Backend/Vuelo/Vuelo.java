/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Vuelo;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;

/**
 *
 * @author Kenny
 */
public class Vuelo {
    
    private final ListaGenerica <Avion> listaDeAvionesVuelo;
    
    public Vuelo(){
        this.listaDeAvionesVuelo = new ListaGenerica<>();
    }
    
    public void iniciarVuelo(Avion avionEnVuelo){
        listaDeAvionesVuelo.agregarContenidoAlFinal(avionEnVuelo);
    }
    
    public Avion terminarVuelo() throws ListaEnlazadaExcepcion{
        return  listaDeAvionesVuelo.obtenerContenido(1);
    }
    
}
