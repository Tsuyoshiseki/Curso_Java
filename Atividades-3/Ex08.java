/*
Faça um programa que pergunte o preço de três produtos e informe qual produto 
você deve comprar, sabendo que a decisão é sempre pelo mais barato.

 */
package Ex03;

import java.util.Scanner;

public class Ex08 {
        public static void main(String[] args) {
//Variável
        double prod1;
        double prod2;
        double prod3;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite o valor do primeiro produto");
        prod1 = scan.nextDouble();

        System.out.println("Digite o valor do segundo produto");
        prod2 = scan.nextDouble();
        
        System.out.println("Digite o valor do terceiro produto");
        prod3 = scan.nextDouble();

//Processamento
        if (prod1<prod2 && prod1<prod3){
            System.out.println("O produto 1, de valor " +prod1+ " é o mais barato");
            
        }else if (prod2<prod3 && prod2<prod1){
            System.out.println("O produto 2, de valor " +prod2+ " é o mais barato");
            
        }else {
            System.out.println("O produto 3, de valor " +prod3+ " é o mais barato");
            
        }
        
//Saída
        scan.close();
        }
}

