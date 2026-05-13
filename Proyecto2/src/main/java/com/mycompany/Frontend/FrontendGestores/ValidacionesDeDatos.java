/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Frontend.FrontendGestores;

/**
 *
 * @author Kenny
 */
public class ValidacionesDeDatos {
    
    private final CreadorDeDatosFrontend creadorDeDatos;
    
    public ValidacionesDeDatos(CreadorDeDatosFrontend creadorDeDatos){
        this.creadorDeDatos = creadorDeDatos;
    }
    
    public boolean validarCantidadDeAviones() {
        try {
            int cantidadGrandes = Integer.parseInt(creadorDeDatos.getAvionesGrande().getText().trim());
            int cantidadMedianos = Integer.parseInt(creadorDeDatos.getAvionesMedianos().getText().trim());
            int cantidadPequeños = Integer.parseInt(creadorDeDatos.getAvionesPequeños().getText().trim());

            if (cantidadGrandes < 0 || cantidadMedianos < 0 || cantidadPequeños < 0) {
                return false;
            }

            int totalDeAviones = cantidadGrandes + cantidadMedianos + cantidadPequeños;

            if (totalDeAviones <= 0) {
                return false;
            }
            
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean validarCombustibleDeAviones() {
        try {
            int combustibleAvionGrande = Integer.parseInt(creadorDeDatos.getCombustibleGrande().getText().trim());
            int combustibleAvionMediano = Integer.parseInt(creadorDeDatos.getCombustibleMediano().getText().trim());
            int combustibleAvionPequeño = Integer.parseInt(creadorDeDatos.getCombustiblePequeño().getText().trim());

            if (combustibleAvionGrande <= 0 || combustibleAvionMediano <= 0 || combustibleAvionPequeño <= 0) {
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean validarTiempos() {
        try {
            int tiempoAterrizajeValor = Integer.parseInt(creadorDeDatos.getTiempoAterrizaje().getText().trim());
            int tiempoDespegueValor = Integer.parseInt(creadorDeDatos.getTiempoDeDespegue().getText().trim());
            int tiempoGalonValor = Integer.parseInt(creadorDeDatos.getTiempoDeGalon().getText().trim());
            int tiempoMantenimientoValor = Integer.parseInt(creadorDeDatos.getTiempoDeMantenimiento().getText().trim());
            int tiempoDesbordajeValor = Integer.parseInt(creadorDeDatos.getTiempoDesbordaje().getText().trim());

            if (tiempoAterrizajeValor <= 0|| tiempoDespegueValor <= 0 || tiempoGalonValor <= 0
                    || tiempoMantenimientoValor <= 0|| tiempoDesbordajeValor <= 0) {
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
