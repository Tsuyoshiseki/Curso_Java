/*
Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
mostre a temperatura em graus Celsius. 

C = (5* (F-32) / 9). 

*/
package Ex01;

import java.util.Scanner;

public class Ex09 {
        public static void main(String[] args) {
            //Variável
            double F; //Farenheit
            double C;//Celsius
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira o valor em Farenheit: ");
            F = scan.nextDouble();
            
            C = (5* (F-32) / 9);
            
            System.out.println("O valor " +F+ "ºF em Celsius é: " +C+" ºC");
            
            scan.close();
        }
}
