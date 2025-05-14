/*
 Faça um Programa que pergunte quanto você ganha por hora e o número de 
horas trabalhadas no mês. Calcule e mostre o total do seu salário no 
referido mês.
 */
package Ex01;

import java.util.Scanner;

public class Ex08 {
        public static void main(String[] args) {
            
            //Variável
            double horas;
            double salario;
            double total;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira quanto você recebe por hora:");
            salario = scan.nextDouble();
            
            System.out.println("Insira quantas horas você trabalhou nesse mês:");
            horas = scan.nextDouble();
            
            total = salario * horas;
            
            System.out.println("O seu salário esse mês será: " +total);
            
            scan.close();
        }
}
