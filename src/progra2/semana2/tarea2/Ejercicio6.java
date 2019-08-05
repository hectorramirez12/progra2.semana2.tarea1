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
public class Ejercicio6 {
    public static void main (String [] args)          
           {
             Scanner s = new Scanner(System.in)  ;
             int area, base, altura;
             System.out.println("Ingrese el dato de Base del Triángulo");
             base= s.nextInt();
             System.out.println("Ingrese el dato de Altura del Triángulo");
             altura= s.nextInt();
             area = base*altura/2;
             System.out.println("El area del Triángulo es: " +area);
             
             
           }
}
