/*
 Faça um Programa que peça dois números e imprima a soma.
 */
package Ex01;

import java.util.Scanner;

public class Ex03 {
        public static void main(String[] args) {
            
            //Variável
            int num1, num2;
            int soma;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            
            System.out.println("Digite o primeiro valor:");
            num1 = scan.nextInt();
            
            System.out.println("Digite o segundo valor:");
            num2 = scan.nextInt();
            
            soma = num1 + num2;
            
            System.out.println("O valor da soma é " +soma);
            
            scan.close();
        }
}

