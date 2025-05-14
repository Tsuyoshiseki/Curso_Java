/*
 Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
package Ex02;

import java.util.Scanner;

public class Ex03 {
        public static void main(String[] args) {
            //Variável
            String sexo;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite seu sexo");
            sexo = scan.nextLine();
            
            //Saída
            if (sexo.equalsIgnoreCase("M")){
                System.out.println("O seu sexo é masculino");
                
            }else if (sexo.equalsIgnoreCase("F")) {
                System.out.println("O seu sexo é feminino");
                
            }else {
                System.out.println("Sexo inválido!");      
        }
            scan.close();
        }
}
