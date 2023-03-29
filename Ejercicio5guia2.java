/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia2;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio5guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
                Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero");
numero=leer.nextInt();
        System.out.println(Math.multiplyExact(2,numero)+" "+ Math.multiplyExact(3,numero)+" "+ Math.sqrt(numero));
    }
    
}
