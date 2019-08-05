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
public class Ejercicio3 {
    
     public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String Dia[]={"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
      System.out.println("Ingresa un numero");
      int d= s.nextInt();
      if(d >= 1 && d <= 7){
          System.out.println("el dia "+d+" es "+Dia[d-1]);
      }else{
          System.out.println("No es un dia de la semana");
      }     
      }
}
