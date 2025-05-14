/*
 Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
negativo.
 */
package Ex02;

import java.util.Scanner;

public class Ex02 {
        public static void main(String[] args) {
            //Variável
            int num;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite um número");
            num = scan.nextInt();
            
            //Saída
            
            if (num<0){
                System.out.println("O número "+num+ " que você digitou é negativo");
                
            }else if (num>0){
                System.out.println("O número "+num+ " que você digitou é positivo");
                
            }else {
                System.out.println("O número digitado foi 0");
        
}
        }
}
                    

