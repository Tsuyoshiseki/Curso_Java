/*
Faça um Programa que pergunte em que turno você estuda. Peça para digitar 
(M) - Matutino ou (V) - Vespertino ou (N) - Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou 
"Valor Inválido!", conforme o caso.
 */
package Ex03;

import java.util.Scanner;

public class Ex10 {
        public static void main(String[] args) {
//Variável
        String turno;
        Scanner scan = new Scanner(System.in); 


//Entrada
        System.out.println("Digite o turno que você estuda \n(M) - Matutino \n(V) - Vespertino \n(N) - Noturno");
        turno = scan.nextLine();

//Processamento
        if(turno.equalsIgnoreCase ("M")){
            System.out.println("Bom Dia!");
        }

        else if(turno.equalsIgnoreCase ("V")){
            System.out.println("Boa Tarde!");
                
        }else if(turno.equalsIgnoreCase ("N")){
            System.out.println("Boa Noite!");
            
        }else {
            System.out.println("Turno não corresponde ao solicitado!");

        }

//Saída
        scan.close();
        }
}
