/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Aereopuerto.Gestores;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;

/**
 *
 * @author Kenny
 */
/*public class GestorDeAviones {

    private final ListaGenerica<Avion> avionesEnEstaciones;
    private int contadorDeAviones;
    private int limiteDeAviones;

    public GestorDeAviones() {
        this.avionesEnEstaciones = new ListaGenerica<>();
        this.contadorDeAviones = 0;
    }

    public void agregarAvionEnLista(Avion avion) {

        if (isListaLlena()) {
            return;
        }

        avionesEnEstaciones.agregarContenidoAlFinal(avion);
        contadorDeAviones++;
    }

    public Avion sacarAvion() {

        try {
            Avion avion = avionesEnEstaciones.desencolar();
            contadorDeAviones--;
            return avion;

        } catch (ListaEnlazadaExcepcion e) {
            return null;
        }
}

    public boolean isListaLlena() {
        return contadorDeAviones >= limiteDeAviones;
    }

    public int getContadorDeAviones() {
        return contadorDeAviones;
    }

    public int getLimiteDeAviones() {
        return limiteDeAviones;
    }

    public void setLimiteDeAviones(int limiteDeAviones) {
        this.limiteDeAviones = limiteDeAviones;
    }
}
*/