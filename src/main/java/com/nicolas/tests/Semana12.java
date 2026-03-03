/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.nicolas.tests;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Semana12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int asientos[][] ={
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        };
        System.out.print("Ingrese fila (0 a 2): ");
        int fila = sc.nextInt();
        System.out.print("Ingrese la columna (0 a 2): ");
        int col = sc.nextInt();
        asientos[fila][col] = 1;
        System.out.println("Estado de la sala.");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <=3; j++){
                System.out.print(asientos[i][j]+"\t");
            }
            System.out.println();
            }
        }
    }

