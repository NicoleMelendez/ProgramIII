/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Matrices;

import com.test.varycondi.Entrada;

/**
 *
 * @author Nicole
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeros[]; 
        int i; 
        boolean creciente, decreciente; 
        /*
        creciente indicará si los numeros estan ordenados de forma creciente
        decreciente indicará si la serie está ordenada de forma decreciente 
        los posibles valores para creciente y decreciente son: 
        creciente decreciente 
        false false -> cuando todos los numeros sean identicos 
        false true -> orden decreciente 
        true false -> orden creciente 
        true true -> desordenado 
        
        si, para algun i, se cumple t[i]> t[i+1]: la serie t[1], t[i+1] es decreciente 
        
        o el caso contrario. 
        
        */
        numeros = new int[10]; 
        creciente = false; 
        decreciente= false; 
        //leemos los numeros 
        System.out.println("Leyendo numeros: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numero: ");
            numeros[i]= Entrada.entero(); 
        }
        
        for (i = 0; i < 9; i++) { //usamos i e i+1, por lo que la i solo podrá llegar hasta 8 (ó <9) 
            
            if(numeros[i] > numeros [i+1]) //en este momento es decreciente
                decreciente=true; 
            if(numeros[i] < numeros[i+1]) //en este momento es creciente
                creciente=true; 
            //depediendo de los valores de creciente y decreciente daremos un tipo de ordenacion
            
            if (creciente== true && decreciente==false) //toda las parejas estan en orden creciente
                System.out.println("Serie creciente.");
            if (creciente== false && decreciente==true) //toda las parejas estan en orden decreciente
                System.out.println("Serie decreciente.");
            if (creciente== true && decreciente==true) //Si ha tenido momentos crecientes y decrecientes
                System.out.println("Serie desordenada.");
            if (creciente== false && decreciente==false) //no hay parejas crecientes ni decrecientes
                System.out.println("Todos los numeros ."); //lo que significa que todos son iguales
        }
    }
    
}
