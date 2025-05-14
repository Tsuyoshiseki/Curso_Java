/*
 Faça um Programa que pergunte quanto você ganha por hora e o número de 
horas trabalhadas no mês. Calcule e mostre o total do seu salário no 
referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê: 

1 - Salário bruto.
2 - Quanto pagou ao INSS. 
3 - Quanto pagou ao sindicato. 
4 - Salário líquido. 
5 - Calcule os descontos e o salário líquido, conforme a tabela abaixo: 

Salário Bruto  
R$ - IR (11%) 
R$ - INSS (8%) 
R$ - Sindicato (5%)  
R$ = Salário Liquido

Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
package Ex01;

import java.util.Scanner;

public class Ex15 {
        public static void main(String[] args) {
            
        //Variável
            double horas;
            double salario;
            double bruto;
            double liq;
            double ir = 0;
            double inss = 0;
            double sin = 0;
            Scanner scan = new Scanner(System.in);
            
        //Entrada
            System.out.println("Insira quanto você recebe por hora:");
            salario = scan.nextDouble();
            
            System.out.println("Insira quantas horas você trabalhou nesse mês:");
            horas = scan.nextDouble();
            
            bruto = salario * horas;
            
            ir = bruto * 11/100;
            inss = bruto * 8/100;
            sin = bruto * 5/100;
            
            liq = bruto - ir - inss - sin;
            
            System.out.println("O seu salário bruto é: " +bruto+
            "\nOs descontos foram: \nIR: R$" +ir+ 
                                "\nINSS: R$" +inss+
                                "\nSindicato: R$" +sin+
                                "\nTotal de descontos: " +(ir+inss+sin)+    
                                "\nSeu salário líquido: R$" +liq);
            
            scan.close();
        }
}
