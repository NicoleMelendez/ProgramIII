/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.CiclosAnidados;

/**
 *
 * @author Nicole
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tabla, i; 
        for (tabla=1; tabla <=10; tabla++) {
            
                System.out.println ("\n\nTabla del " +tabla); 
                System.out.println ("--------------"); 
            for (i = 1; i <=10; i++) {
                
                System.out.println (tabla+ " x " +i + " = " + tabla*i);         
            }
            
        }
    }
    
}
