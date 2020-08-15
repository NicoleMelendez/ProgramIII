/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Funciones;

import com.test.varycondi.Entrada;

/**
 *
 * @author Nicole
 */

public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    static int maximo(int a, int b) { //suponemos que los 2 numeros seran distintos
        int max; 
            if(a>b)
                max=a; 
            else
                max=b; 
        return(max);
    }
    
    public static void main(String[] args) {
        int max; 
        int a, b; 
        System.out.print("Introduce un numero: ");
        a= Entrada.entero(); 
        System.out.print("Introduce otro numero: ");
        b= Entrada.entero();
        max= maximo (a,b); 
        System.out.println("El numero mayor es: " +max);        
    }
    
}
