/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.semana2.tarea4;

/**
 *
 * @author Hector Garcia
 */
public class Ejercicio12 {
    
public static void main(String[] args) {
    
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = Integer.parseInt(System.console().readLine());

    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(n > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            n--;
        }
    }
    System.out.println();
  }
}
