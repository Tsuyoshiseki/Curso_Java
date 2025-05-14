/*
 Faça um programa que pergunte o preço de três produtos e informe qual 
produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
package Ex02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Variáveis
        double valor1, valor2, valor3;
        Scanner scan = new Scanner(System.in);
        String produto = "primeiro"; 

        
        // Entrada
        System.out.println("Digite o primeiro valor:");
        valor1 = scan.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        valor2 = scan.nextDouble();
        
        System.out.println("Digite o terceiro valor:");
        valor3 = scan.nextDouble();
        
        
        double menorValor = valor1; 
        
        if (valor2 < menorValor) {
            menorValor = valor2;
            produto = "segundo";
        }
        if (valor3 < menorValor) {
            menorValor = valor3;
            produto = "terceiro";
        }
        
        // Saída
        System.out.println("O menor valor é o " + produto + " custando: R$" + menorValor);
        
        scan.close();
    }
}

