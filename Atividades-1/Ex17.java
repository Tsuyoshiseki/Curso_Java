/*

 Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho 
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta 
é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 
18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos 
preços em 3 situações: comprar apenas latas de 18 litros; • comprar apenas 
galões de 3,6 litros; misturar latas e galões, de forma que o preço seja o 
menor. Acrescente 10% de folga e sempre arredonde os valores para cima, 
isto é, considere latas cheias.

 */
package Ex01;

import java.util.Scanner;

public class Ex17 {
        public static void main(String[] args) {
        
//Variável   
            double area;
            double lataV = 80; 
            double lataL = 18;
            double galaoV = 25;
            double galaoL = 3.6;
            double lataQ = 0;
            double galaoQ = 0;
            double litro;
            double precoLata = 0;
            double precoGalao = 0;
            double preco2 = 0;


            Scanner scan = new Scanner(System.in);
            
        //Entrada
            System.out.println("Insira quantos metros possui o local");
            area = scan.nextDouble();
            
            litro = (area /6) * 1.1;
            
            //Calculo Lata
            lataQ = Math.ceil(litro /lataL); //lataQ = Math.ceil(litro /lataL); para arredondar

            precoLata = lataV * lataQ;
            
            //Calculo Galão
            galaoQ = Math.ceil(litro /galaoL);

            precoGalao = galaoV * galaoQ;

            
        //Saída
            System.out.println("A quantidade de latas utilizada: " +lataQ);
            System.out.println("O valor total a ser pago: R$" +precoLata);
            System.out.println("A quantidade de galão utilizada: " +galaoQ);
            System.out.println("O valor total a ser pago: R$" +precoGalao);
            
            scan.close();
        }
}

