/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Funciones;

import com.test.varycondi.Entrada;

/**
 *
 * @author Nicole
 */
public class Ejercicio14 {
//La funcion es_primo indicia si el numero pasado es o no primo 
    //recordamos que un numero primo es solo divisile por el mismo y 1 
    /**
     * @param args the command line arguments
     */
    
static boolean es_primo(int num)
{
    boolean primo; 
    int i; 
    primo=true; /*
    suponemos que el numero es primo, este algoritmo 
    se puede mejorar sabiendo que si un numero no es divisible entre 2
    y su raiz cuadrada, entonces ya no sera divisible por 
    ningun otro numero -> sera primo 
    
    con esta mejora podemos ahorrar muchas vueltas del while
    para numeros grandes 
    */
    i=2; 
        while(i<num && primo==true) //en realidad bastaria probar hasta la raiz cuadrada de num
        {
            if(num %i==0) //si es divisible 
                primo=false; //si hemos entrado aqui significa que el numero no es primo 
            i++;
        }   
        return(primo); 
}
/*
esta funcion devuelve el numero de divisiores primos del numero pasado como parametro.
un ejemplo: 
los divisores de 24 son: 2 y 3 
aunque 4 y 6 tambien dividen a 24, no se consideran divisores primos, al no ser primos
por lo que 24 tiene 3 divisores primos: el 1, 2 y 3
*/
static int num_divisores (int num){
    int cont; 
    cont=1; //siempre habra un divisor seguro, el 1. 
    for (int i=2; i<=num; i++)
        if(es_primo (i) && num %i == 0) //si i es primo y divide a num
            cont++; //incrementamos el numero de divisores primos
    return(cont); 
}
    public static void main(String[] args) {
        int num, div; 
        System.out.print("Introduce numero: ");
        num= Entrada.entero(); 
        div= num_divisores(num); 
        System.out.println("Tiene " +div+ "divisores");
    }
    
}
