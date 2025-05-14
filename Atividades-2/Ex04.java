/*
 Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */
package Ex02;

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {
            //Variável
            String letra;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite uma letra.");
            letra = scan.nextLine();
            
            //Saída
            if(     letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u")){
            System.out.println("A letra que você digitou é uma vogal.");
                
            }else {
                System.out.println("A letra que você digitou é uma consoante.");
                    
        scan.close();
}
}
}