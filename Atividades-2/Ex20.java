/*
Faça um Programa para leitura de três notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e presentar: 

- A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva 
média alcançada; 

- A mensagem "Reprovado", se a média for menor do que 7, com a respectiva 
média alcançada; 

- A mensagem "Aprovado com Distinção", se a média for igual a 10.
 */
package Ex02;

import java.util.Scanner;

public class Ex20 {
        public static void main(String[] args) {
//Variável
        double nota1;
        double nota2;
        double nota3;
        double media;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite a primeira nota");
        nota1 = scan.nextDouble();
        
        System.out.println("Digite a segunda nota");
        nota2 = scan.nextDouble();
        
        System.out.println("Digite a terceira nota");
        nota3 = scan.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;

//Processamento
          if(media<10 && media>=7){
              System.out.println("Aprovado");
              System.out.println("Média: " +media);

          }else if(media<7){
              System.out.println("Reprovado");
              System.out.println("Média: " +media);
              
          }else {
              System.out.println("Aprovado com distinção");
              System.out.println("Média: " +media);
          }


//Saída
        }
}
