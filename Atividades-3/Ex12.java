/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que 
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
package Ex03;

import javax.swing.JOptionPane;

public class Ex12 {
        public static void main(String[] args) {
//Variável
        double salarioB;
        double salarioL;
        double ir;
        double inss;
        double fgts;
        double desconto;
        double horas;
        double valorH;
        


//Entrada
        horas = Double.parseDouble
        (JOptionPane.showInputDialog("Insira a quatidade de horas trabalhadas:"));
        
        valorH = Double.parseDouble
        (JOptionPane.showInputDialog("Insira o valor da hora:"));

//Processamento
          salarioB = horas * valorH;
          
          fgts = 0.11 * salarioB;
          
          inss = 0.10 * salarioB;

          if(salarioB <= 900){
              ir = 0;
              
          }else if(salarioB <= 1500){
              ir = salarioB * 0.05;
              
          }else if(salarioB <= 2500){
              ir = salarioB * 0.10;
              
          }else {
              ir = salarioB * 0.20;
          }
          
          desconto = ir + inss;
          
          salarioL = salarioB - desconto;
//Saída
        JOptionPane.showMessageDialog(null,"Salário Bruto: R$ "+salarioB+
                "\n(-) IR (5%) : R$ "+ir+
                "\n(-) INSS (10%) : R$ "+inss+
                "\nFGTS (11%) : R$ "+fgts+
                "\nTotal de Descontos : R$ "+desconto+
                "\nSalário Líquido: R$ "+salarioL);


        }
}
