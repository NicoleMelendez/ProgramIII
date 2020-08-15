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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Llenar una matriz A [][] De tipo char de tamaño c x f los cuales 
        son ingresados por el usuario y deben ser impares, de tal forma que al imprimir 
        A [][] se visualice por pantalla una cruz         
        */
        int f, c; 
        
        boolean rightnumber = false; 
        
        do {
            System.out.print("Introduzca cantidad filas (numero impar): "); 
            f =Entrada.entero();
            System.out.print("Introduzca cantidad columnas (numero impar): "); 
            c =Entrada.entero();
            
            if(f % 2 != 0 && c % 2 != 0){
               rightnumber= true; 
            }else {
                System.out.println("Datos incorrectos. Ingrese 2 valores impares");
            }
            System.out.println(); 
        
        } while (!rightnumber);
        
        char matriz [][] = new char [f][c]; 
        int mitadfilas =  matriz.length /2; 
        int mitadcolums =  matriz[0].length / 2; 
                
              for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[0].length; j++) {
                       if (i== mitadfilas || j == mitadcolums) {
                          matriz [i][j]= '*'; 
                      }else{
                           matriz [i][j]= ' ';
                       }
                       System.out.print(matriz[i][j]+" "); 
                  }
                  System.out.println(); 
            }
        
        //NUMEROS SUGERIDOS AL CORRER 5 Y 3 PARA PODER VISUALIZAR BIEN LA FIGURA O 9 Y 7 
    }
    
}
