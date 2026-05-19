/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.ListaGenerica;

import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;

/**
 *
 * @author Kenny
 * @param <T>
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
    
    public boolean listaVacia(){
        return nodoInicial == null;
    }
    
    public T obtenerContenido(int indiceObtenido) throws ListaEnlazadaExcepcion {
        NodoGenerico nodoBuscado = obtenerContenidoNodo(indiceObtenido);
        return (T) nodoBuscado.getContenidoDeLista();
    }
    
   private NodoGenerico<T> obtenerContenidoNodo(int indiceObtenido)
        throws ListaEnlazadaExcepcion {

        if (indiceObtenido < 0 || indiceObtenido >= tamañoDeLista) {
            throw new ListaEnlazadaExcepcion("El indice no existe.");
        }

        NodoGenerico<T> nodoActual = nodoInicial;

        for (int i = 0; i < indiceObtenido; i++) {
            nodoActual = nodoActual.getSiguienteNodo();
        }

        return nodoActual;
    }
    
    public void encolar(T contenido) {
        agregarContenidoAlFinal(contenido);
    }
    
     public T desencolar()  {

        if (listaVacia()) {
           return null;
        }

        T contenido = nodoInicial.getContenidoDeLista();

        nodoInicial = nodoInicial.getSiguienteNodo();

        tamañoDeLista--;

        if (nodoInicial == null) {
            nodoFinal = null;
        }

        return contenido;
    }

    public int getTamañoDeLista() {
        return tamañoDeLista;
    }
     
     public T verPrimero() throws ListaEnlazadaExcepcion {
        if (listaVacia()) {
            throw new ListaEnlazadaExcepcion("Lista vacia");
        }

        return nodoInicial.getContenidoDeLista();
    }
     
     public void limpiar() {
        nodoInicial = null;
        nodoFinal = null;
        tamañoDeLista = 0;
    }
     
     public boolean contiene(T dato) throws ListaEnlazadaExcepcion {

        NodoGenerico<T> actual = nodoInicial;

        while (actual != null) {

            if (actual.getContenidoDeLista().equals(dato)) {
                return true;
            }

            actual = actual.getSiguienteNodo();
        }

        return false;
    }
     
     public boolean listaVaciaPublica() {
        return nodoInicial == null;
    }
    
}
