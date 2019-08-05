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
public class Ejercicio1 {
  
 public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introducir un día de la semana y le mostraré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 
    
    switch(dia) {
      case "lunes":
     
      case "martes":
        
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Sistemas Informáticos");
        break;
      case "viernes":
        System.out.println("Bases de Datos");
        break;
      case "sábado":
       System.out.println("Programación II");
        break;
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}