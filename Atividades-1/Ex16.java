/*
 Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho 
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta 
é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 
18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de 
tinta a serem compradas e o preço total.
 */
package Ex01;

import java.util.Scanner;

public class Ex16 {
        public static void main(String[] args) {
            //Variável
            double area;
            double lataV = 80;
            double lataL = 18;
            double lataQ = 0;
            double litro;
            double preco = 0;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira quantos metros possui o local");
            area = scan.nextDouble();
            
            litro = area /3;
            
            lataQ = litro /lataL; //lataQ = Math.ceil(litro /lataL); para arredondar

            preco = lataV * lataQ;
            
            //Saída
            System.out.println("A quantidade de latas utilizada: " +lataQ);
            System.out.println("O valor total a ser pago: R$" +preco);
            
            scan.close();
        }
}

