
package progra2.semana2.tarea2;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */

public class Ejercicio1 {

    public static Scanner s = new Scanner(System.in);
  
    public static void main(String[] args) {
          
        int num1, num2;
        
        System.out.println("Ingrese El Primer Número A Multiplicar");
        num1 = s.nextInt ();
        System.out.println("Ingrese El Segundo Número A Multiplicar");
        num2 =s.nextInt();
        System.out.println("El resultado de su multiplicación es:" +num1*num2);
        
        
        
    }
    
}
