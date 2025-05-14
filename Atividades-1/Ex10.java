/*
 Faça um Programa que peça a temperatura em graus Celsius, transforme e 
mostre em graus Farenheit.

C = (5* (F-32) / 9)

 */
package Ex01;

import java.util.Scanner;

public class Ex10 {
        public static void main(String[] args) {
            
            //Variável
            double F; //Farenheit
            double C;//Celsius
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira o valor em Celsius: ");
            C = scan.nextDouble();
            
            F = (C* 9/5) + 32;
            
            System.out.println("O valor " +C+ "ºC em Celsius é: " +F+" ºF");
            
            scan.close();
        
            
        }
}
