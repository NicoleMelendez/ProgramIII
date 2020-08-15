/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.CondicYCiclos;

import com.test.varycondi.Entrada;

/**
 *
 * @author Nicole
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sueldo, suma, mayor_1000; 
        suma=0; 
        mayor_1000=0; 
        for (int i = 1; i < 10; i++) {
            
            System.out.print("Escribe un suledo: ");
            sueldo = Entrada.entero(); 
            if (sueldo>1000) {
                mayor_1000++; 
                suma = suma + sueldo; 
                
            }
            System.out.println("Mayores de 1000 hay: "+mayor_1000);
            System.out.println("La suma es de: "+suma);
        }
    }
    
}
