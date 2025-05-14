/*
Faça um programa que lê as duas notas parciais obtidas por um aluno numa 
disciplina ao longo de um semestre, e calcule a sua média. A atribuição de 
conceitos obedece à tabela abaixo: 

Média de Aproveitamento Conceito 

Entre 9.0 e 10.0   A
Entre 7.5 e 9.0    B
Entre 6.0 e 7.5    C
Entre 4.0 e 6.0    D
Entre 4.0 e zero   E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente 
e a mensagem "APROVADO" se o conceito for A, B ou C ou "REPROVADO" se o 
conceito for D ou E.
 */
package Ex03;

import java.util.Scanner;

public class Ex14 {
        public static void main(String[] args) {
//Variável
        double nota1;
        double nota2;
        double media;
        String aprovacao;
        String conceito;
        Scanner scan = new Scanner(System.in);

//Entrada
       System.out.println("Insira a primeira nota");
       nota1 = scan.nextDouble();

       System.out.println("Insira a segunda nota");
       nota2 = scan.nextDouble();
       
//Processamento
        media = (nota1 + nota2) / 2; 
        
        if(media<6){
            aprovacao = "Reprovado";
        }else {
            aprovacao = "Aprovado";

        }
        
        if(media >= 9){
            conceito = "A";
            
        }else if(media >= 7.5){
            conceito = "B";
            
        }else if(media >= 6){
            conceito = "C";
            
        }else if(media >= 4){
            conceito = "D";            

        }else {
            conceito = "E";
        }

//Saída
        System.out.println("Sua primeira nota: "+nota1);
        System.out.println("Sua segunda nota: "+nota2);
        System.out.println("Sua média: "+media);
        System.out.println("Nota conceitual: "+conceito);
        System.out.println("Você foi "+aprovacao);


        }
}
