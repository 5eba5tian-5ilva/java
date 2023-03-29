/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia2;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio3guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
               
    }
    
}
