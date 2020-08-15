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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    //Ingresar 2 numeros y elegir una de las opciones del menu para un resultado 
    public static void main(String[] args) {
        
        //Declaramos las variables
        int num1;
        int num2;
        int op; 
        
        //Entrada de numeros 
        System.out.println("Introduzca primer numero:");
        num1 = Entrada.entero(); 
        System.out.println("Introduzca segundo numero:");
        num2 = Entrada.entero(); 
 
        //Pedimos que elija una opcion del menu
        System.out.print("MENU \n Elija una de las siguientes opciones: \n"); 
        System.out.println(" 1. Suma \n 2.Multiplicacion \n 3.Resta \n 4.Division"); 
        op= Entrada.entero(); 
        
        //Realizamos las operaciones segun la opcion que elijan.
        // instrucción switch con tipo de datos int
        switch (op){
            
            case 1: System.out.println("El resultado de la suma es "+(num1+num2));
                    break; 
            case 2: System.out.println("El resultado de la multiplicación es "+(num1*num2));
                    break; 
            case 3: System.out.println("El resultado de la resta es "+(num1-num2));
                    break; 
            case 4: System.out.println("El resultado de la división es "+(num1/num2));
                    break; 
            
        }
            
    }
    
}
