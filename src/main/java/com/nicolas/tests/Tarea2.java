/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.nicolas.tests;

/**
 *
 * @author USUARIO
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int edad = 17;
        boolean tieneDocumento = true;
        if (edad >= 18 && tieneDocumento){
            System.out.println("Puede acceder al servicio.");
        }else{
            System.out.println("No puede acceder al servicio.");
        }
    }
}
