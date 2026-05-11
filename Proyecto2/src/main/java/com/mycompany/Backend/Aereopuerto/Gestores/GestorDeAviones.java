/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Gestores;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;

/**
 *
 * @author Kenny
 */
public class GestorDeAviones {
    
    private final ListaGenerica <Avion> avionesEnAeropuerto;
    private int contadorDeAviones;
    private boolean listaLLena;
    private int limiteDeAviones;
    
    public GestorDeAviones(){
        this.avionesEnAeropuerto = new ListaGenerica<>();
        this.contadorDeAviones = 0;
        this.listaLLena = false;
    }
    
    
    public void agregarAvionEnLista(Avion avion){
        avionesEnAeropuerto.agregarContenidoAlFinal(avion);
        contadorDeAviones ++;
        
        if(contadorDeAviones >= limiteDeAviones){
            listaLLena = true;
        }
        
        
    }
    

    public int getLimiteDeAviones() {
        return limiteDeAviones;
    }

    public void setLimiteDeAviones(int limiteDeAviones) {
        this.limiteDeAviones = limiteDeAviones;
    }
    
    
    
}
