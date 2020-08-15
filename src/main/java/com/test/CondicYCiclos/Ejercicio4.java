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

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cuadrado; 
        //num guardará el numero que leamos 
        //y cuadrado guardará el cuadrado de num 
        System.out.print("Introduzca numero: ");
        num = Entrada.entero(); 
        while(num>=0) { //repetimos el proceso mientras el numero leido no sea negativo
            cuadrado=num*num; 
            System.out.println(num+ " es igual a "+cuadrado); 
            System.out.print("Introduzca otro numero: ");
            num=Entrada.entero(); //volvemos a leer num
                 
        }
    }
    
}
