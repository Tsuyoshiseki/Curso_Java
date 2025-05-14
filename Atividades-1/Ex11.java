/*
Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre: 

a. o produto do dobro do primeiro com metade do segundo.
b. a soma do triplo do primeiro com o terceiro. 
c. o terceiro elevado ao cubo.

 */
package Ex01;

import java.util.Scanner;

public class Ex11 {
        public static void main(String[] args) {
            
            //Vairiável
            int num1;
            int num2;
            double num3;
            double c1, c2, c3;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira o primeiro número interio:");
            num1 = scan.nextInt();
            
            System.out.println("Insira o segundo número inteiro:");
            num2 = scan.nextInt();
            
            System.out.println("Insira o número real:");
            num3 = scan.nextDouble();
            
            c1 = (2*num1) * (num2/2);
            c2 = (3*num1) + num3;
            c3 = num3*num3*num3;
            
            System.out.println("Produto do dobro do primeiro com metade do segundo: " +c1+
                                "\nSoma do triplo do primeiro com o terceiro: " +c2+
                                "\nTerceiro elevado ao cubo: " +c3);
            
            scan.close();
        }
}
