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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; 
        System.out.print("Introduzca un numero: ");
        num= Entrada.entero(); 
        while(num!=0) //mientras num sea diferente de 0 
        {
            if(num>0)//mayor que 0: positivo 
                System.out.println("Positivo");
            else //sino es positivo: es negativo 
                System.out.println("Negativo"); //repetimos el proceso y volvemos a leer num
                System.out.print("Introduzca otro numero: "); 
                num=Entrada.entero(); 
        }
    }
    
}
