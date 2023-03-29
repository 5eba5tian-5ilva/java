/*Escribir un programa que pida dos números enteros por teclado 
*y calcule la suma de los dos. 
*El programa deberá después mostrar el resultado de la suma
*/
package javaintro01;

import java.util.Scanner;



public class Javaintro01 {

 
    public static void main(String[] args) {
        // TODO code application logic here
     int num1, num2 ,resultado;
     Scanner leer= new Scanner(System.in);
             System.out.println("ingrese un numero");
     num1=leer.nextInt();
      
        System.out.println("ingrese un numero");        
     num2=leer.nextInt();
     
     resultado= num1 + num2;
        System.out.println("el resultado de la suma es : "+ resultado);
             
        
        
        
        
        
    }
    
}
