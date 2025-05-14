/*
 Faça um Programa que peça dois números e imprima o maior deles.
 */
package Ex02;

import java.util.Scanner;

public class Ex01 {
        public static void main(String[] args) {
            //Variável
            int valor1;
            int valor2;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite o primeiro número");
            valor1 = scan.nextInt();
            
            System.out.println("Digite o segundo número");
            valor2 = scan.nextInt();
            
            //Saída
            
            if(valor1 >valor2){
                System.out.println("O maior valor é: "+valor1);
            }else {
                System.out.println("O maior valor é: "+valor2);

            }
        }
}

