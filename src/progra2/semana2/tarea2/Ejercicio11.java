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
public class Ejercicio11 {
    public static void main(String[] args) {
      
    Scanner s = new Scanner (System.in);    
    double kb;
    
    System.out.println("Ingrese los KiloBytes para convertirlos a MegaBytes: ");  
    kb=s.nextDouble();
    
    System.out.println("Los KiloBytes Ingresados, Equivalen a: " +(kb/1024) + " Megabytes ");
    
    }
    
    
}

