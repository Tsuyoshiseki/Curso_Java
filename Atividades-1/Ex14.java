/*
 João Papo-de-Pescador, homem de bem, comprou um microcomputador para 
controlar o rendimento diário de seu trabalho. Toda vez que ele traz um 
peso de peixes maior que o estabelecido pelo regulamento de pesca do estado 
de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um programa que leia a variável peso 
(peso de peixes) e verifique se há excesso. Se houver, gravar na variável 
excesso e na variável multa o valor da multa que João deverá pagar. 
Caso contrário mostrar tais variáveis com o conteúdo ZERO.

 */
package Ex01;

import java.util.Scanner;

public class Ex14 {
        public static void main(String[] args) {
            //Variável
            double peso;
            double excesso;
            double limite = 50;
            double multa;
            Scanner scan  = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite quantos Kilos você pescou:");
            peso = scan.nextDouble();
            
            if(peso>limite){
                excesso = peso - limite; 
                multa = 4 * excesso;
                System.out.println("Você terá que pagar de multa o valor de: R$" +multa);
            }else {
                System.out.println("Você não precisa pagar multa, João.");
                
            scan.close();
            }
        }
}

