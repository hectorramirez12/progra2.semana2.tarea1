/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.semana2.tarea2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Hector Garcia
 */
public class Ejercicio3 {
    
    
    public static void main( String[] args ) throws Exception
    {
       BufferedReader teclado;
       long pesetas;
       double euros;
       String linea;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("Cantitdad Pesetas: ");
       linea = teclado.readLine();
       pesetas = Integer.parseInt(linea);
       euros = pesetas/166.387;
       System.out.println(pesetas+" Pesetas Corresponden a "+euros+" Euros.");
    }
  }
