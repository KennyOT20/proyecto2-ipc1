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
    
    protected boolean validarCantidadDeAviones() {
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
    
    protected boolean validarCombustibleDeAviones() {
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
    
    protected boolean validarCantidadDeAreas() {
        try {
            int cantidadDesbordaje = Integer.parseInt(creadorDeDatos.getCantidadEstacionDesbordaje().getText().trim());
            int cantidadMantenimiento = Integer.parseInt(creadorDeDatos.getCantidadEstacionMantenimiento().getText().trim());
            int cantidadControl = Integer.parseInt(creadorDeDatos.getCantidadEstacionesControl().getText().trim());

            int cantidadPistasDespegue = Integer.parseInt( creadorDeDatos.getCantidadPistasDespliegue().getText().trim());
            int cantidadPistasAterrizaje = Integer.parseInt(creadorDeDatos.getPistasDeAterrizaje().getText().trim());

            if (cantidadDesbordaje <= 0 || cantidadMantenimiento <= 0|| cantidadControl <= 0
                    || cantidadPistasDespegue <= 0|| cantidadPistasAterrizaje <= 0) {
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    protected boolean validarCapacidadDeAreas() {
        try {
            int capacidadAterrizaje = Integer.parseInt(creadorDeDatos.getCapacidadDeAterrizaje().getText().trim());
            int capacidadControl = Integer.parseInt(creadorDeDatos.getCapacidadDeControl().getText().trim());
            int capacidadDesbordaje = Integer.parseInt(creadorDeDatos.getCapacidadDeDesbordaje().getText().trim());
            int capacidadDespliegue = Integer.parseInt(creadorDeDatos.getCapacidadDeDespliegue().getText().trim());
            int capacidadMantenimiento = Integer.parseInt(creadorDeDatos.getCapacidadDeMantenimiento().getText().trim());

            if (capacidadAterrizaje <= 0 || capacidadControl <= 0|| capacidadDesbordaje <= 0
                    || capacidadDespliegue <= 0 || capacidadMantenimiento <= 0) {
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    protected boolean validarNombre(){
        
        if(creadorDeDatos.getNombreDeDatos().getText().isEmpty()){
            return false;
        } else {
            return true;
        }
    }
    
}
