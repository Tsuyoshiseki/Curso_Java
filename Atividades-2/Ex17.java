/*
Faça um Programa que peça um número correspondente a um determinado ano e 
em seguida informe se este ano é ou não bissexto.
 */
package Ex02;

import java.util.Scanner;

public class Ex17 {
        public static void main(String[] args) {
//Variável
        int ano;
        int resto;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Insira algum ano");
            ano = scan.nextInt();


//Processamento
          resto = ano%4;


//Saída
        if(resto==0){
            System.out.println("O ano " +ano+ " é bissexto");
        }else {
            System.out.println("O ano " +ano+ " não é bissexto");

        }
        
        scan.close();
        }
}
