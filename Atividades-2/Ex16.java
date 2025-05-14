/*
Faça um programa que calcule as raízes de uma equação do segundo grau, na forma 
ax2 + bx + c. O programa deverá pedir os valores de a, bece fazer as 
consistências, informando ao usuário nas seguintes situações: 

a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo 
grau e o programa não deve fazer pedir os demais valores, sendo encerrado; 

b. Se o delta calculado for negativo, a equação não possui raizes reais. 
Informe ao usuário e encerre o programa; 

c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; 
informe-a ao usuário; 

d. Se o delta for positivo, a equação possui duas raiz reais; 
informe-as ao usuário;

fórmula de Bhaskara:

(-b +- √-4*a*c) / 2*a
 */
package Ex02;

import java.util.Scanner;

public class Ex16 {
        public static void main(String[] args) {
            
//Variável
            double a;
            double b;
            double c;
            double delta;
            double bH1;
            double bH2;
            Scanner scan = new Scanner(System.in);
            
//Entrada
            System.out.println("Insira o valor de A");
            a = scan.nextDouble();
            
            System.out.println("Insira o valor de B");
            b = scan.nextDouble();
            
            System.out.println("Insira o valor de C");
            c = scan.nextDouble();
            
            delta =Math.pow(b, 2) - 4 * a * c;
            
            bH1 = (-b +  Math.sqrt(delta)) / 2*a;
            
            bH2 = (-b - Math.sqrt(delta)) / 2*a;

//Processamento
            if(a==0){
                System.out.println("A equação não pode ser feita, pois não é de segundo grau");
            
            }else if(delta<0){
                System.out.println("O delta é menor que 0");

            }else if(delta==0){
                System.out.println("O delta é igual a 0, só possui uma raiz real");
                System.out.println(+bH1);

            }else {
                System.out.println("O delta é positivo, logo possui duas raízes");
                System.out.println(+bH1);
                System.out.println(+bH2);                
            }
  
//Saída
            scan.close();
        }
}
