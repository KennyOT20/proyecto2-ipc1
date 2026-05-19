/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Estaciones;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import com.mycompany.Backend.Pistas.PistaDeAterrizaje;
import com.mycompany.Backend.Pistas.PistaDespegue;

/**
 *
 * @author Kenny
 */
public class EstacionDeControl extends Estacion{

    private final ListaGenerica<PistaDeAterrizaje> pistasAterrizaje;
    private final ListaGenerica<PistaDespegue> pistasDespegue;
    private ListaGenerica <Avion> avionesDespegue;
    
    public EstacionDeControl(int idDeArea, String tipoDeArea, int capacidadMaxima) {
        super(idDeArea, tipoDeArea, capacidadMaxima);
        this.avionesDespegue = new ListaGenerica<>();
        this.pistasAterrizaje = new ListaGenerica<>();
        this.pistasDespegue = new ListaGenerica<>();
    }
    
    public void agregarPistaAterrizaje(PistaDeAterrizaje pista) {
        pistasAterrizaje.agregarContenidoAlFinal(pista);
    }

    public void agregarPistaDespegue(PistaDespegue pista) {
        pistasDespegue.agregarContenidoAlFinal(pista);
    }

    public ListaGenerica<Avion> getAvionesDespegue() {
        return avionesDespegue;
    }

    public ListaGenerica<PistaDeAterrizaje> getPistasAterrizaje() {
        return pistasAterrizaje;
    }

    public ListaGenerica<PistaDespegue> getPistasDespegue() {
        return pistasDespegue;
    }
    
    
    
}
