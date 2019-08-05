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
public class Ejercicio4 {
    
           
         public static void main (String [] args)          
           {              
           Scanner s = new Scanner(System.in);        
  
            int a,b,c,d,e,f;       
  
System.out.print("Ingrese el primer número: ");
a = s.nextInt();  
System.out.print("Ingrese el segundo numero: ");               
b = s.nextInt();
c = a+b;
d = a-b;
e = a*b;
f = a/b;

        System.out.println("La Suma de los dos números es: "+c+"");
        System.out.println("La Resta de los dos números es: "+d+"");
        System.out.println("La Multiplicación de los dos números es: "+e+"");
        System.out.println("La División de los dos números es: "+f+"");
  }

 }
