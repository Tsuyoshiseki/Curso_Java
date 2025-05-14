/*
 Faça um Programa que converta metros para centímetros.
 */
package Ex01;

import java.util.Scanner;

public class Ex05 {
        public static void main(String[] args) {
            
            //Variável
            double cm;
            double m;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            
            System.out.println("Insira quantos metros serão transformados em centímetros: ");
            m = scan.nextDouble();
            
            cm = m * 100;
            
            System.out.println( +m+ " m em centímetros ficou: " +cm+ " cm");
            
            scan.close();
            
        }
}
