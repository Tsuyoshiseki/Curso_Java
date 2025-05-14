/*
Faça um Programa que leia três números e mostre-os em ordem decrescente.

 */
package Ex03;

import java.util.Scanner;

public class Ex09 {
        public static void main(String[] args) {
//Variável
        double num1;
        double num2;
        double num3;
        double menor=0;
        double meio=0;
        double maior=0;
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
        maior = num1;
        
            if(num2>num3){
                meio = num2;
                menor = num3;
                
            }else {
                meio = num3;
                menor = num2;
            }
        }
            
        if (num2>num3 && num2>num1){
        maior = num2;
        
             if(num1>num3){
                meio = num1;
                menor = num3;
                
            }else {
                meio = num3;
                menor = num1;
            }
        }
        
        if (num3>num2 && num3>num1){
        maior = num3;
        
             if(num1>num2){
                meio = num1;
                menor = num2;
                
            }else {
                meio = num2;
                menor = num1;
            }
        }
        
//Saída
        System.out.println("Os números em ordem decrescente é: " +maior+ " > " +meio+ " > " +menor);

        scan.close();
        }
}
