/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar 
ao usuário a valor do saque e depois informar quantas notas de cada valor 
serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. 
O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se 
preocupar com a quantidade de notas existentes na máquina. 

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas 
de 100, uma nota de 50, uma nota de 5 e uma nota de 1;

Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas 
de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

 */
package Ex02;

import java.util.Scanner;

public class Ex21 {
        public static void main(String[] args) {
//Variável
        int saque;
        int centena, dezena, unidade;
        int cem = 0, cinquenta = 0, dez = 0, cinco = 0, um = 0;
        Scanner scan = new Scanner(System.in);
 

//Entrada
        System.out.println("Quanto você gostaria de sacar?");
        saque = scan.nextInt();

        centena = saque/100;
        dezena = (saque%100) / 10;
        unidade = saque%10;

//Processamento
          if(saque<10){
              System.out.println("O valor mínimo para sacar é R$ 10,00");
          }else if(saque>600){
              System.out.println("O valor máximo para sacar é R$ 600,00");
          }
//centena
           cem = centena;

//dezena
          if(dezena==5){
              dez = 0;
              cinquenta = 1;
              
          }else if(dezena>5){
              cinquenta = 1;
              dez = dezena - 5;
              
          }else {
              dez = dezena;
          }
//unidade       
           if(unidade==5){
              um = 0;
              cinco = 1;
              
          }else if(unidade>5){
              cinco = 1;
              um = unidade - 5;
              
          }else {
              um = unidade;
          }
          
              System.out.println("Notas de 100: " +cem);
              System.out.println("Notas de 50: " +cinquenta); 
              System.out.println("Notas de 10: " +dez);
              System.out.println("Notas de 5: " +cinco);
              System.out.println("Notas de 1: " +um);
              System.out.println("Saque: R$" +saque);

//Saída
            scan.close();
        }
}
