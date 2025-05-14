/*
 Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo 
que calcule seu peso ideal, usando a seguinte fórmula: 

(72.7*altura) - 58

 */
package Ex01;

import java.util.Scanner;

public class Ex12 {
        public static void main(String[] args) {
            
            //Variável
            double altura;
            double ideal;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira a sua altura em cm: ");
            altura = scan.nextDouble();
            
            ideal = ((72.7 * altura) - 58)/100;
            
            System.out.println("Seu peso ideal é " +ideal+ " Kg");
            
            scan.close();

            
            
        }
}
