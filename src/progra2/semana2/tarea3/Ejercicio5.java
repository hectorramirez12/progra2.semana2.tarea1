/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.semana2.tarea3;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        float x,a,e; 
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Coeficiente de X:");
        x=teclado.nextInt();
        System.out.println("Término independiente:");
        a=teclado.nextInt();
        if(a==0)
          System.out.println("No es una ecuación de primer grado");  
        else
        {
             e=-a/x;
             System.out.println("La raíz es= " +e);
        }
        
                      
    }   
}
