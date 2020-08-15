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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    //FUNCION QUE AL INGRESAR 2 NUMEROS GENERARA 10 NUMEROS ALEATORIOS ENTRE LAS CANTIDADES INGRESADAS
      
    public static void main(String[] args) {
        
        int max, min;
        System.out.print("Introduce un numero pequeño para crear el limite: "); 
        min= Entrada.entero();
        System.out.print("Introduce un numero más grande para crear el limite: "); 
        max= Entrada.entero();
        
               
        for (int i = 0; i < 10; i++) {
            
            System.out.println(NumAleatorio(min, max));
        }
    }
    
    public static int NumAleatorio(int minimo, int maximo) {
        
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
    
}
