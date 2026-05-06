/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Frontend;

import javax.swing.JFrame;

/**
 *
 * @author Kenny
 */
public class VentanaPrincipal extends JFrame{
    
    public VentanaPrincipal(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Simulador de vuelos");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
