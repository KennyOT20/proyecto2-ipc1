/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.ListaGenerica;

/**
 *
 * @author Kenny
 */
public class NodoGenerico <T>  {
    
    private T contenidoDeLista;
    private NodoGenerico siguienteNodo;
    
    public NodoGenerico(T contenidoDeLista){
        this.contenidoDeLista = contenidoDeLista;
    }

    public T getContenidoDeLista() {
        return contenidoDeLista;
    }

    public void setContenidoDeLista(T contenidoDeLista) {
        this.contenidoDeLista = contenidoDeLista;
    }

    public NodoGenerico getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoGenerico siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    
    
}
