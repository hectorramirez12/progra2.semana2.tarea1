/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.semana2.tarea2;

  import java.io.*;
/**
 *
 * @author Hector Garcia
 */
public class Ejercicio2 {
    
  
   public static void main( String[] args ) throws Exception
    {
       BufferedReader teclado;
       long euros;
       double pesetas;
       String linea;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("Cantidad Euros: ");
       linea = teclado.readLine();
       euros = Integer.parseInt(linea);
       pesetas = euros*166.387;
       System.out.println(pesetas+" pts. corresponden a "+euros+" euros.");
    }
  }