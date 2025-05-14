/*
 Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
package Ex01;

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {
            
            //Variável
            double nota1,nota2,nota3,nota4;
            double media;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira a primeira nota: ");
            nota1 = scan.nextDouble();
            
            System.out.println("Insira a segunda nota: ");
            nota2 = scan.nextDouble(); 
            
            System.out.println("Insira a terceira nota: ");
            nota3 = scan.nextDouble();
            
            System.out.println("Insira a quarta nota: ");
            nota4 = scan.nextDouble();
            
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            
            //Saída
            System.out.println("A média do aluno é: " +media);
            
            scan.close();
        }
}
