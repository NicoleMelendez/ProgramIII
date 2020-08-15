/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.varycondi;

/**
 *
 * @author Nicole
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments 
     */
    
    public static void main(String[] args) {
        
        int n1, n2; //declaracion de variables 
        System.out.print("Introduce un numero: ");//introduccion de numero 1 por teclado
        n1= Entrada.entero(); 
        System.out.print("Introduce otro numero: ");//introduccion de numero 2 por teclado
        n2= Entrada.entero();
        
        if(n1==n2) //evaluacion de condicion 
            System.out.println("Son iguales"); 
        else 
            System.out.println("No son iguales");
            
    }
}
