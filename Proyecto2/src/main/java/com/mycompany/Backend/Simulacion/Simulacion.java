/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Simulacion;

import com.mycompany.Backend.Aereopuerto.Aeropuerto;
import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Aviones.CabinaDeAvion;
import com.mycompany.Backend.Excepciones.ListaEnlazadaExcepcion;
import com.mycompany.Backend.ListaGenerica.ListaGenerica;
import java.io.Serializable;

/**
 *
 * @author Kenny
 */
public class Simulacion implements Serializable {
    
    private final Aeropuerto aeropuerto;
    private final ListaGenerica <Thread> listaDeHilos;
    
    public Simulacion( Aeropuerto aeropuerto){
        this.aeropuerto = aeropuerto;
        this.listaDeHilos = new ListaGenerica<>();
    }

    
     public void iniciarSimulacion() {

        try {
            iniciarLista(aeropuerto.getAvionesPequeños());
            iniciarLista(aeropuerto.getAvionesMedianos());
            iniciarLista(aeropuerto.getAvionesGrandes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     private void iniciarLista(ListaGenerica<Avion> lista) throws ListaEnlazadaExcepcion {

        for (int i = 0; i < lista.getTamañoDeLista(); i++) {

            Avion avion = lista.obtenerContenido(i);

            CabinaDeAvion cabina = new CabinaDeAvion(avion);

            Thread hilo = new Thread(cabina);

            listaDeHilos.agregarContenidoAlFinal(hilo);

            hilo.start();
        }
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }
     
     
    
    
}
