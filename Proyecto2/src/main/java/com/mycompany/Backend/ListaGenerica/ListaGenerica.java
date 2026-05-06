/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.ListaGenerica;

import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;

/**
 *
 * @author Kenny
 */
public class ListaGenerica <T> {
    
    private NodoGenerico <T> nodoInicial;
    private NodoGenerico <T> nodoFinal;
    private int tamañoDeLista;
    
    public ListaGenerica(){
        this.tamañoDeLista = 0;
    }
    
    public void agregarContenidoAlFinal(T contenidoObtenido){
        NodoGenerico <T> nuevoNodo = new NodoGenerico(contenidoObtenido);
        
        if(listaVacia()){
            nodoInicial = nuevoNodo;
        } else {
            nodoFinal.setSiguienteNodo(nuevoNodo);
        }
        
        nodoFinal = nuevoNodo;
        tamañoDeLista ++;
    }
    
    private boolean listaVacia(){
        return nodoInicial == null;
    }
    
    public T obtenerContenido(int indiceObtenido) throws ListaEnlazadaExcepcion {
        NodoGenerico nodoBuscado = obtenerContenidoNodo(indiceObtenido);
        return (T) nodoBuscado;
    }
    
    private NodoGenerico <T> obtenerContenidoNodo(int indiceObtenido) throws ListaEnlazadaExcepcion{
        if(indiceObtenido < 0 || indiceObtenido >= tamañoDeLista){
            throw new ListaEnlazadaExcepcion ("El indice no existe.");
        }
        
        NodoGenerico<T> nodoActual = nodoInicial;
        
        for (int i = 0; i < indiceObtenido; i++) {
            nodoActual.getSiguienteNodo();
        }
        
        return nodoActual;
    }
    
}
