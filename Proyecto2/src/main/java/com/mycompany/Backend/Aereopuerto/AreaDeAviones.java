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

    private final ListaGenerica<Avion> avionesEnLista;
    private String tipoDeArea;
    private int capacidadActual;
    private int capacidadMaxima;
    private final int idDeArea;

    public AreaDeAviones(int idDeArea, String tipoDeArea, int capacidadMaxima) {
        this.idDeArea = idDeArea;
        this.tipoDeArea = tipoDeArea;
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        this.avionesEnLista = new ListaGenerica<>();
    }

    public boolean estaLLena() {
        return capacidadActual >= capacidadMaxima;
    }

    public boolean ingresarAvion(Avion avion) {

        if (estaLLena()) {
            return false;
        }

        avionesEnLista.encolar(avion);
        capacidadActual++;
        return true;
    }

    public Avion liberarAvion() {

        Avion avion = avionesEnLista.desencolar();

        if (avion != null) {
            capacidadActual--;
        }

        return avion;
    }

    public int getCapacidadActual() {
        return capacidadActual;
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

    public ListaGenerica<Avion> getAvionesEnLista() {
        return avionesEnLista;
    }
}