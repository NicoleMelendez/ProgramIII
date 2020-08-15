/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.varycondi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Nicole
 */
public class Entrada {
    
    public static String inicializar(){
//        esta clase sirve como complemento de los programas
        String buzon="";
        InputStreamReader flujo = new InputStreamReader(System.in); //Introducir datos
        BufferedReader teclado = new BufferedReader(flujo); //lee los datos en memoria
    
    try{
        buzon=teclado.readLine();
    }
    catch(Exception e){
        System.out.append("Entradaincorrecta)");
    }
    return buzon;
    }
    
    public static int entero(){
        int valor = Integer.parseInt(inicializar());
        return valor;
    }
        
    public static double real(){
        double valor=Double.parseDouble(inicializar());
        return valor;
    }
    
    public static String cadena(){
        String valor=inicializar();
        return valor;
    }
    
    public static char caracter(){
        String valor=inicializar();
        return valor.charAt(0);
    }
    
    
}
