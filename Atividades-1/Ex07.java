/*
 Faça um Programa que calcule a área de um quadrado, em seguida mostre o 
dobro desta área para o usuário.
 */
package Ex01;

import java.util.Scanner;

public class Ex07 {
        public static void main(String[] args) {
            
            //Variável
            double lado;
            double area;
            double dobro;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite um lado do quadrado: ");
            lado = scan.nextDouble();
            
            //Processamento
            area = lado*lado;
            
            dobro = 2*area;
            
            //Saída
            System.out.println("Os dados do quadrado são:\n" +
                               "\nLado: " +lado+
                                "\nÁrea: " +area+
                                "\nDobro da área: " +dobro);
                                
            scan.close();                    
        }
}
