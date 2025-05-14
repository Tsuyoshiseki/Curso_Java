/*
 Faça um programa para a leitura de duas notas parciais de um aluno.

O programa deve calcular a média alcançada por aluno e apresentar: 

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
A mensagem "Reprovado", se a média for menor do que sete; 
A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
package Ex02;

import java.util.Scanner;

public class Ex05 {
        public static void main(String[] args) {
            //Variável
            double media;
            double nota1;
            double nota2;
            Scanner scan = new Scanner(System.in);
            
            
            //Entrada
            System.out.println("Digite a primeira nota");
            nota1 = scan.nextDouble();
            
            System.out.println("Digite a segunda nota");
            nota2 = scan.nextDouble();
            
            media = (nota1 + nota2) / 2;
            //Saída
            if (media==10){
                System.out.println("O aluno ficou com média "+media+ " e está APROVADO COM DISTINÇÃO");
            }else if(media>=7){
                System.out.println("O aluno ficou com média "+media+ " e está APROVADO");
            }else {
                System.out.println("O aluno ficou com média "+media+ " e está REPROVADO");

            }
                scan.close();
        }
        
}
