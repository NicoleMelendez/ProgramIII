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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DIBUJA UNA FIGURA EN FORMA DE ARBOL DE NAVIDAD CON ASTERISCOS AL INGRESAR LA ALTURA 
        
        int altura;
        System.out.print("Introduce un numero entero para la altura: "); 
        altura= Entrada.entero(); 
        
        for (int numeroespacios=altura, numeroasteriscos=1; numeroasteriscos<=(altura*2)-1;numeroespacios--, numeroasteriscos+=2){
            //Espacios
            for (int i=0; i<numeroespacios;i++){
                System.out.print(" ");
            }
            //Asteriscos
            for (int j=numeroasteriscos; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
    }
} 
}
