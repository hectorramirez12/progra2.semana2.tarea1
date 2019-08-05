/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.semana2.tarea3;

/**
 *
 * @author Hector Garcia
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
    
    int[] n = new int[3];
    int i;
    
    System.out.println("Por favor, introduzca 3 números enteros.");
    System.out.println("Pulse la tecla INTRO después de introducir cada número.");

    for (i = 0; i < 3; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nLos números introducidos, al revés, son los siguientes:");
    for (i = 2; i >= 0; i--) {
      System.out.println(n[i]);
    }
  }
}
