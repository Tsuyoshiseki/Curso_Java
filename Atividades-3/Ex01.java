/*
 Faça um Programa que peça dois números e imprima o maior deles.

 */

package Ex03;

import java.util.Scanner;

public class Ex01 {
        public static void main(String[] args) {
//Variável
        double num1;
        double num2;
        double maior;

        Scanner scan = new Scanner(System.in);

        
//Entrada
        System.out.println("Digite o primeiro número");
        num1 = scan.nextDouble();
        
        System.out.println("Digite o segundo número");
        num2 = scan.nextDouble();
        

//Processamento
          if (num1<num2){
                maior = num2;

                
              
          }else{
                 maior = num1 ;

          }


//Saída
        System.out.println("O maior número é " +maior );
        
        scan.close();

        }
}
