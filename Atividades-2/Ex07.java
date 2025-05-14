/*
 Faça um Programa que leia três números e mostre o maior e o menor deles.
 */
package Ex02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Variáveis
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        int maior = 0, menor = 0;
        
        // Entrada
        System.out.println("Digite o primeiro número:");
        num1 = scan.nextInt();
        
        System.out.println("Digite o segundo número:");
        num2 = scan.nextInt();
        
        System.out.println("Digite o terceiro número:");
        num3 = scan.nextInt();
        
        if (num2 > num3 || num2 >num1) {
            maior = num2;
        }
        if (num3 > num2 || num3 >num1) {
            maior = num3;
        }
        if (num1 > num2 || num1 >num3) {
            maior = num1;
        }
        if (num2 < num3 || num2 <num1) {
            menor = num2;
        }
        if (num3 < num2 || num3 <num1) {
            menor = num3;
        }
        if (num1 < num2 || num1 <num3) {
            menor = num1;
        }
        
        // Saída
        System.out.println("O maior número digitado foi: " +maior);
        System.out.println("O menor número digitado foi: " +menor);
        
        scan.close();
    }
}
