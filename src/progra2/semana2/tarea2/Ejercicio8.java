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
public class Ejercicio8 {
     public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int preciohora=12, horas, sueldo = 0;

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    horas = s.nextInt();
    
    if (horas <= 48) {
      sueldo = preciohora * horas;
      } else {
      System.out.println(" En número de horas ingresadas está incorrecto");} 
      System.out.println("El sueldo semanal que le corresponde es de: " + sueldo + " Quetzales";
    
  }
}
        
        
          
        
        
   
