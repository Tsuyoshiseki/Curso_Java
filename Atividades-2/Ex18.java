/*
Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a 
mesma é uma data válida.
 */
package Ex02;

import java.util.Scanner;

public class Ex18 {
        public static void main(String[] args) {
//Variável
        int dia;
        int mes;
        int fev;
        int rmes;
        int ano;
        int resto;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Insira o dia");
            dia = scan.nextInt();
            
        System.out.println("Insira o mês");
            mes = scan.nextInt();
            
        System.out.println("Insira o ano");
            ano = scan.nextInt();

        resto = ano%4;
        
//Processamento
          if(resto==0 && dia<=29 && mes<=12){
            System.out.println("A sua data " +dia+ "/" +mes+ "/" +ano+ " é valida");

          }if(resto==1 && dia<29 && mes<=12){
        System.out.println("A sua data " +dia+ "/" +mes+ "/" +ano+ " é valida");
              
          }else {
              System.out.println("Data inválida");
          }

//Saída
        
        scan.close();
        }
}
