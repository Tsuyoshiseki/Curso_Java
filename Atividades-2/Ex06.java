/*
 Faça um Programa que leia três números e mostre o maior deles.
 */
package Ex02;

import java.util.Scanner;

public class Ex06 {
        public static void main(String[] args) {
            //Variável
            int num1;
            int num2;
            int num3;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite o primeiro número");
            num1 = scan.nextInt();
            
            System.out.println("Digite o segundo número");
            num2 = scan.nextInt();
            
            System.out.println("Digite o terceiro número");
            num3 = scan.nextInt();
            
            
            //Saída
            if (num3>num2 || num3>num1){
                System.out.println("O maior número digitado foi o terceiro, o número "+num3);
            }else if (num2>num1 || num2>num3) {
                System.out.println("O maior número digitado foi o segundo, o número "+num2);
            }else if (num1>num3 || num1>num2){
                System.out.println("O maior número digitado foi o primeiro, o número "+num1);
            }
            scan.close();
        }
}
