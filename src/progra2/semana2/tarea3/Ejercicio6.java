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
public class Ejercicio6 {
    
      final static double g = 9.81;

  public static void main(String[] args) {

    System.out.print("Por favor, introducir la altura (en metros) en la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
