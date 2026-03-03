/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.nicolas.tests;

/**
 *
 * @author USUARIO
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        boolean sistemaActivo = true;
        boolean tienePermiso = false;
        if (sistemaActivo == true){
            if (tienePermiso == true){
                System.out.println("Accion Ejecutada");
            } else{
                System.out.println("Permiso Denegado");
            }
        } else{
            System.out.println("Sistema Inactivo");
        }
    }
}
