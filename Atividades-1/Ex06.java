/*
 Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */            


package Ex01;

import java.util.Scanner;

public class Ex06 {
        public static void main(String[] args) {

        //Variável
                double raio;
                double area;
                Scanner scan = new Scanner(System.in);
                
        //Entrada
        
                System.out.println("Insira o valor do raio do círculo");
                raio = scan.nextDouble();
                
                //A = π * r²
                area = raio*raio;
                
                System.out.println("O raio " +raio+ " tem a área: " +area+ "π");
                System.out.println("Ou " +(area*Math.PI));

                scan.close();        
      
    }
}

      
