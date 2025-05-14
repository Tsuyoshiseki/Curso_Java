/*
Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a 
mesma é uma data válida.
 */
package Ex03;

import java.util.Scanner;

public class Ex18 {
        public static void main(String[] args) {
//Variável
        int dia;
        int mes;
        int ano;
        Scanner scan = new Scanner(System.in);        

//Entrada
        System.out.println("Digite o dia: ");
        dia = scan.nextInt();

        System.out.println("Digite o mês: ");
        mes = scan.nextInt();
        
        System.out.println("Digite o ano: ");
        ano = scan.nextInt();
        
        
//Processamento
        boolean anoBissexto = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
        
        boolean dataValida = false;

        // Verificar se o mês é válido
        if (mes >= 1 && mes <= 12) {
            // Verificar o número de dias por mês
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia >= 1 && dia <= 31) dataValida = true;
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia >= 1 && dia <= 30) dataValida = true;
                    break;
                case 2:
                    if (anoBissexto && dia >= 1 && dia <= 29) {
                        dataValida = true;
                    } else if (!anoBissexto && dia >= 1 && dia <= 28) {
                        dataValida = true;
                    }
                    break;
            }
        }

        // Saída
        if (dataValida) {
            System.out.println("A sua data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("Data inválida.");
        }

        scan.close();
    }
}