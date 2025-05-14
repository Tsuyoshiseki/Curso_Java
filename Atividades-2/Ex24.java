/*
Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual 
operação ele deseja realizar. O resultado da operação deve ser acompanhado de 
uma frase que diga se o número é: 

par ou ímpar; 

positivo ou negativo; 

inteiro ou decimal.
 */
package Ex02;

import java.util.Scanner;

public class Ex24 {
        public static void main(String[] args) {
//Variável
        double num1;
        double num2;
        int conta;
        double resultado=0;
        double ip;
        double resto;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Insira um valor");
        num1 = scan.nextDouble();

        System.out.println("Insira um segundo valor");
        num2 = scan.nextDouble();
        
        System.out.println("Escolha a operação desejada"+
                "\n 1- Adição"+
                "\n 2 - Subtração"+
                "\n 3 - Multiplicação "+
                "\n 4 - Divisão");
        conta = scan.nextInt();
        
                
        switch(conta){
            case 1: resultado = num1 + num2;
            break;
            
            case 2: resultado = num1 - num2;
            break;
            
            case 3: resultado = num1 * num2;
            break;
            
            case 4: resultado = num1 / num2;
            break;
        }
        
        
//Processamento

        ip = resultado%2;
        resto = Math.round(resultado);
        
        
//Par ou ímpar
        if(ip==0){
        System.out.println("O número "+resultado+ " é par");

        }else {
        System.out.println("O número "+resultado+ " é ímpar");

        }


//Positivo ou negativo
        if(resultado>0){
        System.out.println("O número "+resultado+ " é positivo");

        
        }else {
        System.out.println("O número "+resultado+ " é negativo");
        }
        
        
//Inteiro ou decimal
        if(resto == resultado){
        System.out.println("O número "+resultado+ " é inteiro");


        }else {
        System.out.println("O número " +resultado+ "  é decimal");
        }
               

//Saída
        scan.close();
        }
}
