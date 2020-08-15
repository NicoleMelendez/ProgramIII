/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.CiclosAnidados;

import com.test.varycondi.Entrada;

/**
 *
 * @author Nicole
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j, num, cont_pri; 
        boolean primo; 
        cont_pri=0; 
        System.out.print("Introduce un numero: "); 
        num= Entrada.entero(); 
        //vamos procesando todos los numeros entre 1..num 
        for (int i = 1; i <=num; i++) {
            //veremos si el numero i es divisible en el rango 2..i-1
            //El bucle while se puede hacer con menos vuelta... consultar algoritmos para primos 
            primo=true; 
            j=2; 
                while(j<=i-1 && primo==true)
                {
                    if (i%j==0) 
                       primo=false; 
                    j++; 
                }
                        if (primo==true) {
                            cont_pri++; //si es primo incrementamos el contador de primos 
                            System.out.println(i+(" es primo"));
                        }                         
            }
                            System.out.println("En el rango 1.." + num + ", hay "+ cont_pri + " numeros primos");
    }
    
}
