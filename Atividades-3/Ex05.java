/*
Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:

 - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 - A mensagem "Reprovado", se a média for menor do que sete;
 */
package Ex03;

import java.util.Scanner;

public class Ex05 {
        public static void main(String[] args) {
//Variável
        double nota1;
        double nota2;
        double media;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite a primeira nota");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = scan.nextDouble();
        
//Processamento
        
        media = (nota1 + nota2)/2;

        if(media>=7){
            System.out.println("Sua média foi "+media+ ", você foi APROVADO.");
        }else{
            System.out.println("Sua média foi "+media+ ", você foi REPROVADO.");

        }

//Saída
        scan.close();
        }
}
