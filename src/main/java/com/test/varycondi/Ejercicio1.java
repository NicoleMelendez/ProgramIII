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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
    double a,b,c; //coeficientes ax2+bx+c=0
    double x1,x2,d; //soluciones y determinantes
    
    //pedido de datos de entrada a evaluar 
    System.out.println("Introduzca primer coeficiente (a):");
    a = Entrada.entero(); 
    System.out.println("Introduzca segundo coeficiente: (b):");
    b = Entrada.entero(); 
    System.out.println("Introduzca tercer coeficiente: (c):"); 
    c = Entrada.entero(); 
    //calculamos el determinante 
    d = ((b*b)-4*a*c); 
    
    //evaluacion de condicion 
    if(d<0)
        System.out.println("No existen soluciones reales"); 
    else { //si a=0 nos encontramos una division por cero.
        x1 = (-b+Math.sqrt(d))/(2*a); 
        x2 = (-b-Math.sqrt(d))/(2*a);
        System.out.println("Solucion: " + x1); 
        System.out.println("Solucion: " + x2); 
    }
    //queda confirmar que a sea distinto de 0 
    }
    
}
