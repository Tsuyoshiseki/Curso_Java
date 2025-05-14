/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

 */
package Ex03;

import java.util.Scanner;

public class Ex03 {
        public static void main(String[] args) {
//Variável
        char sexo;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Digite seu sexo: \n(F) - Feminino \n(M) - Masculino");
        sexo = scan.next().charAt(0);

//Processamento
        if (Character.toUpperCase(sexo) == 'F') {
            System.out.println("O seu sexo é feminino");
        
        } else if (Character.toUpperCase(sexo) == 'M') {
            System.out.println("O seu sexo é Masculino");

          }else {
            System.out.println("O seu sexo é inválido");

        }


//Saída
        scan.close();
        }
}
