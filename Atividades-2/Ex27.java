/*
Uma quitanda está vendendo frutas com a seguinte tabela de preços: 

            Até 5 Kg                Acima de 5 Kg   
Morango     R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã        R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.

Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade 
(em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

 */
package Ex02;

import java.util.Scanner;

public class Ex27 {
        public static void main(String[] args) {
            
//Variável
        double valorT;
        double valorD;
        double valorMg;
        double valorMc;
        double kgMg;
        double kgMc;
        Scanner scan = new Scanner(System.in);

//Entrada
        System.out.println("Digite quantos kilogramas de morango");
        kgMg = scan.nextDouble();
        
        System.out.println("Digite quantos kilogramas de maçã");
        kgMc = scan.nextDouble();
        


//Processamento

//Morango
          if(kgMg <=5){
              valorMg = kgMg * 2.5;
              
          }else {
              valorMg = kgMg * 2.2;
          }

//Maçã
          if(kgMc <=5){
              valorMc = kgMc * 1.8;
              
          }else {
              valorMc = kgMc * 1.5;
          }
          
          
//Valor total
          valorT = valorMg + valorMc;
          
          if(valorT>=25 || kgMc>8 || kgMg>8){
              valorD = valorT - (valorT * 0.1);
              
          }else {
              valorD = 0;
              
          }
          
//Saída
        System.out.println("Maçã: " +kgMc+ " Kg");
        System.out.println("Morango: " +kgMg+ " Kg");
        System.out.println("Valor total: R$" +valorT);
        System.out.println("Valor com 10% de desconto: R$" +valorD);

        scan.close();
        }
}
