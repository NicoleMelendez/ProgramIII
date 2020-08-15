/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.MatricesnDimensio;

/**
 *
 * @author Nicole
 */
public class NewEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j; 
        int t[] []; 
        t = new int[8] [6]; //se inicializa toda la tabla a 0. 
        //rellenamos la matriz marco 
        for (i = 0; i<8; i++) 
            for (j = 0;  j<6; j++) {
                if(i==0 || i==7) //si nos encontramos en la primera o ultima columna
                    t[i][j]=1; 
                        if(j==0 || j==5) //si nos encontramos en la primera o ultima fila
                            t[i][j]=1;                         
                                }
                                System.out.print("Matriz marco: ");
                                for (i = 0; i< 8; i++) {
                                    System.out.println(); 
                                    for (j = 0; j< 6; j++) {
                                        System.out.print (t[i][j]+" ");
                                             }          
                                                }
                                        System.out.println();
    }
    
}
