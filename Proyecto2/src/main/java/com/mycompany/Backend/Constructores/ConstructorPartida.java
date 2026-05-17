/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.Constructores;

import com.mycompany.Backend.Aereopuerto.Aeropuerto;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDeAviones;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDeEstaciones;
import com.mycompany.Backend.Aereopuerto.Generadores.GeneradorDePistas;
import com.mycompany.Backend.Aviones.Avion;
import com.mycompany.Backend.Estaciones.Estacion;
import com.mycompany.Backend.GestorDeDatos.LectorArchivoCSV;
import com.mycompany.Backend.Pistas.Pista;

/**
 *
 * @author Kenny
 */
public class ConstructorPartida {
    
    private final LectorArchivoCSV leerArchivo;
    private final GeneradorDeAviones generarAvion;
    private final GeneradorDeEstaciones generarEstacion;
    private final GeneradorDePistas generarPista;
    private final Aeropuerto aeropuerto;
    private final String carpetaALeer;
    
    private int cantidadCombustible;
    private int tiempoDeMantenimiento;
    private int tiempoDeDesbordaje;
    private int tiempoDeDespegue;
    private int tiempoDeConsumo;
    
    
    private final String ARCHIVO_AVIONES = "aviones.csv";
    private final String ARCHIVO_PISTA_DE_ATERRIZAJE = "aterrizaje.csv";
    private final String ARCHIVO_ESTACIONES_DE_CONTROL = "control.csv";
    private final String ARCHIVO_ESTACIONES_DESBORDAJE = "desbordaje.csv";
    private final String ARCHIVO_PISTA_DESPEGUE = "despegue.csv";
    private final String ARCHIVO_ESTACIONES_DE_MANTENIMIENTO = "mantenimiento.csv";
    
    public ConstructorPartida(String carpetaALeer){
        this.carpetaALeer = carpetaALeer;
        this.leerArchivo = new LectorArchivoCSV(carpetaALeer);
        this.aeropuerto = new Aeropuerto();
        this.generarAvion = new GeneradorDeAviones();
        this.generarEstacion = new GeneradorDeEstaciones();
        this.generarPista = new GeneradorDePistas();
    }
    
    private void obtenerAviones() {
        String[][] datos = leerArchivo.leerArchivo(ARCHIVO_AVIONES);

        for (int i = 0; i < datos.length; i++) {

            String[] fila = datos[i];

            int id = Integer.parseInt(fila[0].trim());
            int combustible = Integer.parseInt(fila[1].trim());
            int capacidadMin = Integer.parseInt(fila[2].trim());
            int capacidadMax = Integer.parseInt(fila[3].trim());
            String tipo = fila[4].trim();

            Avion avion = generarAvion.crearGrande(combustible, capacidadMin, capacidadMax, id, tipo,
                    tiempoDeMantenimiento, tiempoDeDesbordaje, tiempoDeDespegue, tiempoDeDesbordaje, tiempoDeConsumo);
            
            aeropuerto.agregarAvionSegunTipo(avion);
        }

    }
    
    private void obtenerPistas() {

        String[][] aterrizajes =leerArchivo.leerArchivo(ARCHIVO_PISTA_DE_ATERRIZAJE);

        String[][] despegues = leerArchivo.leerArchivo(ARCHIVO_PISTA_DESPEGUE);

        cargarPistas(aterrizajes);
        cargarPistas(despegues);
    }

   private void cargarPistas(String[][] datos) {

        for (int i = 0; i < datos.length; i++) {

            String tipo = datos[i][0].trim();
            int id = Integer.parseInt(datos[i][1].trim());
            int capacidad = Integer.parseInt(datos[i][2].trim());

            Pista pista;

            switch (tipo) {
                case "DE ATERRIZAJE":
                    pista = generarPista.deAterrizaje(capacidad, id, tipo);
                    break;

                case "DE DESPEGUE":
                    pista = generarPista.deDespeuge(capacidad, id, tipo);
                    break;

                default:
                    throw new IllegalArgumentException("Tipo invalido");
            }

            aeropuerto.agregarPistasPorTipo(pista);
        }
    }
   
   private void cargarEstaciones(String[][] datos) {

        for (int i = 0; i < datos.length; i++) {

            String tipo = datos[i][0].trim();
            int id = Integer.parseInt(datos[i][1].trim());
            int capacidad = Integer.parseInt(datos[i][2].trim());

            Estacion estacion;

            switch (tipo) {
                case "DE CONTROL":
                    estacion = generarEstacion.crearDeControl(id, tipo, capacidad);
                    break;

                case "DE MANTENIMIENTO":
                    estacion = generarEstacion.crearDeMantenimiento(id, tipo, capacidad);
                    break;

                case "DE DESBORDAJE":
                    estacion = generarEstacion.crearDeDesborde(id, tipo, capacidad);
                    break;

                default:
                    throw new IllegalArgumentException("Tipo invalido");
            }

            aeropuerto.agregarEstacionPorTipo(estacion);
        }
    }

    public void setCantidadCombustible(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public void setTiempoDeMantenimiento(int tiempoDeMantenimiento) {
        this.tiempoDeMantenimiento = tiempoDeMantenimiento;
    }

    public void setTiempoDeDesbordaje(int tiempoDeDesbordaje) {
        this.tiempoDeDesbordaje = tiempoDeDesbordaje;
    }

    public void setTiempoDeDespegue(int tiempoDeDespegue) {
        this.tiempoDeDespegue = tiempoDeDespegue;
    }

    public void setTiempoDeConsumo(int tiempoDeConsumo) {
        this.tiempoDeConsumo = tiempoDeConsumo;
    }
    
    
  
}
