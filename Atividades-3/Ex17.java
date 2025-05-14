/*
Faça um Programa que peça um número correspondente a um determinado ano e 
em seguida informe se este ano é ou não bissexto.

 */
package Ex03;

import java.util.Scanner;

public class Ex17 {
        public static void main(String[] args) {
//Variável
        double ano;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite um ano para saber se é bissexto");
        ano = scan.nextDouble();

//Processamento
         if (ano % 4 == 0){
            System.out.println("O ano digitado é bissexto");
             
         }else { 
            System.out.println("O ano digitado NÃO é bissexto");

         }


//Saída
        }
}
