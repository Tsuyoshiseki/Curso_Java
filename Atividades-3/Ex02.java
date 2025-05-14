/*
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

 */
package Ex03;

import java.util.Scanner;

public class Ex02 {
        public static void main(String[] args) {
            
//Variável
        double num;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite um número para saber se é POSITIVO ou NEGATIVO");
        num = scan.nextDouble();

//Processamento
        if (num <0){
            System.out.println("O número digitado é NEGATIVO");
            
        }else {
            System.out.println("O número digitado é POSITIVO");

        }  


//Saída
        scan.close();
        }
}
