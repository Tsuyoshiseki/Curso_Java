/*
 . Faça um Programa que pergunte em que turno você estuda. 
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou 
"Valor Inválido!", conforme o caso.
 */
package Ex02;

import java.util.Scanner;

public class Ex10 {
        public static void main(String[] args) {
            
            //Variável
            String turno;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Em que turno você estuda?"
                                + "\nM - Matutino"
                                + "\nV - Vespertino"
                                + "\nN - Noturno");
            turno = scan.nextLine();
            
            //Saída
          
           if(turno.equalsIgnoreCase("M")){ 
                    System.out.println("Bom dia");
           }if(turno.equalsIgnoreCase("V")){ 
                    System.out.println("Boa tarde"); 
           }if(turno.equalsIgnoreCase("N")){ 
                    System.out.println("Boa noite");
           }else {
               System.out.println("Opção inválida");
            }
       
            scan.close();
           
        }
}