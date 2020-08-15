/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Entregable;

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
        
        //Ingresar 5 numeros y calcula cual es el maximo y minimo 
        
            int maximo, minimo; 
            int[] num = new int[5];
            maximo = num[0];
            minimo = 1000000000;

            for (int i = 0; i <5; i++) {

                System.out.print("Introduzca un numero entero: ");
                num[i]= Entrada.entero();

                    if (num[i] > maximo)
                            maximo = num[i];

                    if (num[i]< minimo){ 
                                minimo = num[i];
                    }
            }

            System.out.print("El numero mayor es: "+maximo+"\n");
            System.out.print("El numero menor es: "+minimo);
            
            
        }
    }

