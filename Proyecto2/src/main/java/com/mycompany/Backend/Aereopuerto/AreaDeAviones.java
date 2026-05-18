/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;

/**
 *
 * @author Kenny
 */
public abstract class AreaDeAviones {

    private final ListaGenerica <Avion> avionesEnLista;
    private String tipoDeArea;
    private int capacidad;
    private int capacidadMaxima;
    private final int idDeArea;
    
    public AreaDeAviones(int idDeArea, String tipoDeArea, int capacidadMaxima){
        this.idDeArea = idDeArea;
        this.tipoDeArea = tipoDeArea;
        this.avionesEnLista = new ListaGenerica<>();
        this.capacidadMaxima = capacidadMaxima;
    }
 
    public boolean estaLLena(){
        return capacidad >= capacidadMaxima;
    }
    
    public void ingresarAvion(Avion avion){
        avionesEnLista.encolar(avion);
    }
    public Avion liberarAvion() throws ListaEnlazadaExcepcion{
        return avionesEnLista.desencolar();
    }

    public String getTipoDeArea() {
        return tipoDeArea;
    }

    public int getIdDeArea() {
        return idDeArea;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    
    
    
    
}
