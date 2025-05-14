/*

Faça um programa que peça o tamanho de um arquivo para download (em MB) e a 
velocidade de um link de Internet (em Mbps), calcule e informe o tempo 
aproximado de download do arquivo usando este link (em minutos).

(1 byte = 8 bits, 1 MB = 8 Mbps)

 */
package Ex01;

import java.util.Scanner;

public class Ex18 {
        public static void main(String[] args) {
            //Variável
            double tamanho;
            double tempo;
            double velocidade;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira o tamanho do arquivo em MB");
            tamanho = scan.nextDouble();
            
            System.out.println("Insira a velocidade da internet em MBps");
            velocidade = scan.nextDouble();
            
            tempo = ((tamanho*8) /velocidade) / 60;
            
            //Saída
            System.out.println("O tempo aproximado para download do arquivo é " +tempo+ " minutos");
            
            scan.close();
        }
}
