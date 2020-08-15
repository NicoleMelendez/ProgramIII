/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Matrices;

import com.test.varycondi.Entrada;

/**
 *
 * @author Nicole
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[]; 
        t = new int[5]; 
        for (int i = 0; i <5; i++) {
            
            System.out.print("Introduzca un numero: ");
            t[i]= Entrada.entero();      
        }
            System.out.println("Los numeros son: ");
            for (int i = 0; i < 5; i++) 
                System.out.println(t[i]);
    }
    
}
