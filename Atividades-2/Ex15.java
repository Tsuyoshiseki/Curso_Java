/*
 . Faça um Programa que peça os 3 lados de um triângulo. O programa deverá 
informar se os valores podem ser um triângulo. Indique, caso os lados formem 
um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 

Dicas: 

- Três lados formam um triângulo quando a soma de quaisquer dois lados for 
maior que o terceiro;

- Triângulo Equilátero: três lados iguais; 

- Triângulo Isósceles: quaisquer dois lados iguais; 

- Triângulo Escaleno: três lados diferentes;
 */
package Ex02;

import java.util.Scanner;

public class Ex15 {
        public static void main(String[] args) {
            
            //Variável
            double lado1;
            double lado2;
            double lado3;
            double soma;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite o primeiro lado do triângulo");
            lado1 = scan.nextDouble();
            
            System.out.println("Digite o primeiro lado do triângulo");
            lado2 = scan.nextDouble();
            
            System.out.println("Digite o primeiro lado do triângulo");
            lado3 = scan.nextDouble();
            
            
            
            //Processamento
            if(lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1){
                if(lado1 == lado2 && lado2 == lado3){
                    System.out.println("Triângulo equilátero");
                    
                }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
                    System.out.println("Triângulo isóceles");
                    
                }else {
                    System.out.println("Triângulo escaleno");
                }
                
                    
            }else{
                System.out.println("Os lados apresentados não forma um triângulo");
            }
            
            
            //Saída
            scan.close();
            
        }
}
