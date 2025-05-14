/*
Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

 */
package Ex03;

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {
//Variável
        char letra;
        Scanner scan = new Scanner(System.in);
        
//Entrada
        System.out.println("Digite uma letra para saber se é vogal ou consoante");
        letra = scan.next().charAt(0);


//Processamento
         if (Character.toUpperCase(letra) == 'A'||
             Character.toUpperCase(letra) == 'E'||
             Character.toUpperCase(letra) == 'I'||
             Character.toUpperCase(letra) == 'O'||
             Character.toUpperCase(letra) == 'U') {
         
            System.out.println("A letra é uma vogal");
         
        }else {
            System.out.println("A letra é uma consoante");
        }

//Saída
        scan.close();
        }
}
