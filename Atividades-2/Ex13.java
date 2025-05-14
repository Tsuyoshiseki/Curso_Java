/*
 . Faça um Programa que leia um número e exiba o dia correspondente da semana. 
(1-Domingo, 2- Segunda, etc.), 
se digitar outro valor deve aparecer valor inválido.
 */
package Ex02;

import java.util.Scanner;

public class Ex13 {
        public static void main(String[] args) {
            //Variável
            int dia;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insert a day of the week (1-7)");
            dia = scan.nextInt();
                    
            
            //Processamento
            if(dia == 1){
                System.out.println("You choose sunday");
                
            }else if(dia == 2){
                System.out.println("You choose monday");

            }else if(dia == 3){
                System.out.println("You choose tuesday");
               
            }else if(dia == 4){
                System.out.println("You choose wednesday");
                
            }else if(dia == 5){
                System.out.println("You choose thursday");
                
            }else if(dia == 6){
                System.out.println("You choose friday");
                
            }else if(dia == 7){
                System.out.println("You choose saturday");
            }else{
                System.out.println("Valor incorreto digitado");
            }
            
            scan.close();
                    
           
            //Saída
        }
}
