/*
 Faça um Programa que peça um número e então mostre a mensagem O número 
informado foi [número].
 */
package Ex01;

import java.util.Scanner;

public class Ex02 {
        public static void main(String[] args) {
            
            //Variável
            int num = 0;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            
            //Saída
            System.out.println("Número que foi digitado: " +num);
            
            scan.close();
        }
}
