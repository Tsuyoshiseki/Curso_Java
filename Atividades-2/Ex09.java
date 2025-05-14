/*
 Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
package Ex02;

import java.util.Scanner;

public class Ex09 {
        public static void main(String[] args) {
            //Variável
            int num1,num2,num3;
            Scanner scan = new Scanner(System.in);
            int menor, maior, meio;

            //Entrada
            System.out.println("Digite o primeiro número:");
            num1 = scan.nextInt();
        
            System.out.println("Digite o segundo número:");
            num2 = scan.nextInt();
        
            System.out.println("Digite o terceiro número:");
            num3 = scan.nextInt();

            menor = num1;
            maior = num1;
            meio = num1;
            
            //Saída
          if(num2>maior && num3<num2){
          maior = num2;
          meio = num3;
          
          }if(num3>maior && num2<num3){
          maior = num3;
          meio = num2;
          
          }if(maior>num3 && num2<num3){
              meio = num3;
              menor = num2;
              
          }if(maior>num2 && num3<num2){
              meio = num2;
              menor = num3;
              
          }if(num3>maior && num2<menor){
              maior = num3;
              menor = num2;
              
          }if(num2>maior && num3<menor){
              maior = num2;
              menor = num3;
          }
          System.out.println(maior+ " > " +meio+ " > " +menor);
}
}

