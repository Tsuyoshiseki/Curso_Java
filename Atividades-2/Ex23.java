/*
 Faça um Programa que peça um número e informe se o número é inteiro ou 
decimal. 

Dica: utilize uma função de arredondamento.

 */
package Ex02;

import java.util.Scanner;

public class Ex23 {
        public static void main(String[] args) {
//Variável
        double numero;
        double resto;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Insira um valor para saber se é inteiro ou decimal");
        numero = scan.nextDouble();

//Processamento
        resto = Math.round(numero);
        

        if(numero == resto){
        System.out.println("O número "+numero+ " é inteiro");


        }else {
        System.out.println("O número " +numero+ "  é decimal");

        }
//Saída
        }
}
