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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int a,b,c; 
        System.out.print("Introduzca primer numero: "); 
        a= Entrada.entero(); 
        System.out.print("Introduzca segundo numero: "); 
        b= Entrada.entero(); 
        System.out.print("Introduzca tercer numero: "); 
        c= Entrada.entero(); 
        if(a>b && b>c)
            System.out.println( a+ ", "+b+", "+c); 
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{ 
                if(b>a && a>c)
                    System.out.println(b+", "+a+", "+c);
                else{ 
                   if(b>c && c>a)
                       System.out.println(b+", "+c+", "+a);
                   else{
                       if(c>a && a>b)
                           System.out.println(c+", "+a+", "+b);
                       else{ 
                           if(c>b && b>a)
                               System.out.println(c+", "+b+", "+a);
                       }
                   }
                }
            }
        }
        
    }
    
}
