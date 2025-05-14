/*
 . Faça um programa para o cálculo de uma folha de pagamento, sabendo que 
os descontos são do Imposto de Renda, que depende do salário bruto 
(conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 
11% do Salário Bruto, mas não é descontado (é a empresa que deposita). 

O Salário Líquido corresponde ao Salário Bruto menos os descontos. 

O programa deverá pedir ao usuário o valor da sua hora e a quantidade de 
horas trabalhadas no mês. 

Desconto do IR: 
Salário Bruto até 900 (inclusive) - isento 
Salário Bruto até 1500 (inclusive) - desconto de 5% 
Salário Bruto até 2500 (inclusive) - desconto de 10% 
Salário Bruto acima de 2500 - desconto de 20% 

Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5*220) : R$ 1100,00 
(-) IR (5%) : R$ 55,00 
(-) INSS (10%) : R$ 110,00 
FGTS (11%) : R$ 121,00 
Total de descontos : R$ 165,00 
Salário Liquido : R$ 935,00

 */
package Ex02;

import java.util.Scanner;

public class Ex12 {
        public static void main(String[] args) {
            //Variável
            double hora;
            double valorH;
            double salarioB;
            double salarioL;
            double ir;
            double irV;
            double inss;
            double fgts;
            double descontos;
            double sindicato;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Insira o valor da sua hora");
            valorH = scan.nextDouble();
            
            System.out.println("Insira a quantidade de horas trabalhadas");
            hora = scan.nextDouble();
            
            salarioB = valorH * hora;
            
            
            sindicato = salarioB * 0.03;
            
            inss = salarioB * 0.1;
            
            fgts = salarioB * 0.11;
            
 
            //Processamento
            if(salarioB<=900){
                ir = 0;
                irV = Double.parseDouble("Isento");
                
            }else if(salarioB>900 && salarioB<=1500){
                ir = salarioB * 0.05;
                irV = 5;
                
            }else if(salarioB>1500 && salarioB<=2500){
                ir = salarioB * 0.1;
                irV = 10;
                
            }else {
                ir = salarioB * 0.2;
                irV = 20;
            }
            
            descontos = inss + ir;
            
            salarioL = salarioB - descontos;
            
            
            //Saída
            System.out.println("Salário bruto:" +salarioB);
            System.out.println("IR (" +irV+ "%):" +ir);
            System.out.println("INSS (10%):" +inss);
            System.out.println("Sindicato (3%):" +sindicato);
            System.out.println("FGTS (11%):" +fgts);
            System.out.println("Total de descontos:" +descontos);
            System.out.println("Salário líquido:" +salarioL);

        }
}
