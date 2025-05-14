/*
Faça um Programa que leia três números e mostre o maior e o menor deles.

 */
package Ex03;

import java.util.Scanner;

public class Ex07 {
        public static void main(String[] args) {
//Variável
        double num1;
        double num2;
        double num3;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite o primeiro número");
        num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        num2 = scan.nextDouble();
        
        System.out.println("Digite o terceiro número");
        num3 = scan.nextDouble();

//Processamento
        if (num1>num2 && num1>num3){
            System.out.println("O número " +num1+ " é o maior" );
            
            if(num2<num3){
            System.out.println("O número " +num2+ " é o menor" );

            }else {
            System.out.println("O número " +num3+ " é o menor" );

            } 
            
        }else if (num2>num3 && num2>num1){
            System.out.println("O número " +num2+ " é o maior" );
            
            if(num1<num3){
            System.out.println("O número " +num1+ " é o menor" );

            }else {
            System.out.println("O número " +num3+ " é o menor" );
            }
            
        }else if (num3>num2 && num3>num1){
            System.out.println("O número " +num3+ " é o maior" );
            
            if(num1<num2){
            System.out.println("O número " +num1+ " é o menor" );

            }else {
            System.out.println("O número " +num2+ " é o menor" );
            }
        }
        
//Saída
        scan.close();
        }
}
