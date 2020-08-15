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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    //PIDE 6 NOTAS Y DICE CUANTAS ESTAN APROBADAS, CONDICIONADAS Y SUSPENDIDAS DEPENDIENDO LA NOTA
    public static void main(String[] args) {
        
        int nota,aprobados,suspendidos,condicionados;        
        aprobados=0;        
        suspendidos=0;
        condicionados=0;  
        
        for (int i=1;i<=6;i++)        
        {            
            System.out.print("Introduzca nota entre 0 y 10: ");            
            nota=Entrada.entero();
            
            if(nota >= 5)                    
                    aprobados++;
            else
                if(nota == 4)                
                    condicionados++;                          
                    else                    
                        if(nota < 4) // este if sobra, ya que es el único caso posible                        
                            suspendidos++;        
        }        
    System.out.println("Aprobados: " +aprobados);  
    System.out.println("Condicionados: "+condicionados);
    System.out.println("Suspensos: " +suspendidos);        

	
      
	  
	
    }
    
}
