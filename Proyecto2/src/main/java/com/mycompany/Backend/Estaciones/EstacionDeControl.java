/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Estaciones;

import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;

/**
 *
 * @author Kenny
 */
public class EstacionDeControl extends Estacion{

    private ListaGenerica <Avion> avionesDespegue;
    public EstacionDeControl(int idDeArea, String tipoDeArea, int capacidadMaxima) {
        super(idDeArea, tipoDeArea, capacidadMaxima);
        this.avionesDespegue = new ListaGenerica<>();
    }

    public ListaGenerica<Avion> getAvionesDespegue() {
        return avionesDespegue;
    }
    
}
