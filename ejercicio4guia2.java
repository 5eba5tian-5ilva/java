
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class ejercicio4guia1 {


    public static void main(String[] args){

        float grados;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese los grados centigrados:");
        grados = teclado.nextFloat();

        System.out.println("Su equivalente en grados Fahrenheit: " + (32+(9*grados/5) +"°F"));
    }
   
}
