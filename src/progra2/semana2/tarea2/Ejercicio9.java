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
public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);    
    int radio, altura;
    
    System.out.println("Ingrese el Radio del cono: ");
    radio= s.nextInt();
    System.out.println("Ingrese la Altura del cono: ");
    altura= s.nextInt();
        
    System.out.println("El volumen del cono es: " + (Math.PI*(radio*radio)*altura/3));
    
    
    }
    
    
}
