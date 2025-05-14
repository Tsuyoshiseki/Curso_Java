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
package Ex03;

import java.util.Scanner;

public class Ex16 {
        public static void main(String[] args) {
//Variável
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite o valor de a");
        a = scan.nextDouble();

        System.out.println("Digite o valor de a");
        b = scan.nextDouble();
        
        System.out.println("Digite o valor de a");
        c = scan.nextDouble();
        
        
//Processamento
        delta = Math.pow(b,2) - 4 * a * c;

        x1 = (- b + Math.sqrt(delta)) / 2 * a;
        
        x2 = (- b - Math.sqrt(delta)) / 2 * a;

//Saída
        if(a == 0) {
            System.out.println("Equação não pode ser feita, a = 0");  
            
        }else if (delta <0) {
            System.out.println("Equação não pode ser feita, delta < 0");  

        }else if (delta == 0) {
            System.out.println("A equação possui apenas uma raiz real");
            System.out.println(+x1);
            
        }else {
            System.out.println("A equação possui duas raiz reais");
            System.out.println(+x1);
            System.out.println(+x2);
            
        }
            
        scan.close();
        
        }
}
