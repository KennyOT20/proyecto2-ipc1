/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Backend.GestorDeDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kenny
 */
public class LectorArchivoCSV {
    
    private final String nombreCarpeta;
    
    public LectorArchivoCSV(String nombreCarpeta){
        this.nombreCarpeta = nombreCarpeta;
    }
    
    public String [][] leerArchivo(String nombreDeArchivo){
        
        String pathCompleto = "datos/" +  nombreCarpeta + "/" + nombreDeArchivo;
        File archivoEncontrado = new File(pathCompleto);
        
        int cantidadLineas = contarLineas(archivoEncontrado);

        String[][] datos = new String[cantidadLineas][];

        try (BufferedReader buffer = new BufferedReader(new FileReader(archivoEncontrado))) {

            String linea = buffer.readLine();
            int fila = 0;

            while (linea != null) {
                datos[fila] = linea.split(",");
                fila++;
                linea = buffer.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }

    private int contarLineas(File archivo) {
        int contador = 0;

        try (BufferedReader buffer =
                     new BufferedReader(new FileReader(archivo))) {

            while (buffer.readLine() != null) {
                contador++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contador;
    }
        
}
