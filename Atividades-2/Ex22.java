/*
 . Faça um Programa que peça um número inteiro e determine se ele é par ou 
impar. Dica: utilize o operador módulo (resto da divisão).
 */
package Ex02;

import java.util.Scanner;

public class Ex22 {
        public static void main(String[] args) {
//Variável
        int numero;
        int resto;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Insira um número para saber se é par ou ímpar");
        numero = scan.nextInt();

        resto = numero%2;

//Processamento
          if(resto==0){
        System.out.println("O número " +numero+ " é par");
              
          }else {
        System.out.println("O número " +numero+ " é ímpar");
        }


//Saída
        }
}
