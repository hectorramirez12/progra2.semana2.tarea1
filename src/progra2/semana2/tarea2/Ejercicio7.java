/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.semana2.tarea2;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Ejercicio7 {
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in);
        int baseimponible;
        
        System.out.println("Ingrese la base imponible");
        baseimponible = s.nextInt();
        System.out.println("El total de la factura es: " + (baseimponible*0.05+baseimponible));
        
        
        
                
                
        
    }
}
