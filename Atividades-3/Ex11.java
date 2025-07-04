/*
As Organizações Tabajara resolveram dar um aumento de salário aos seus 
colaboradores e lhe contraram para desenvolver o programa que calculará os 
reajustes.

Faça um programa que recebe o salário de um colaborador e o reajuste segundo 
o seguinte critério, baseado no salário atual:

- salários até R$ 280,00 (incluindo): aumento de 20%
- salários entre R$ 280,00 e R$ 700,00: aumento de 15%
- salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
- salários de R$ 1500,00 em diante aumento de 5% 


Após o aumento ser realizado, informe na tela:

- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- o novo salário, após o aumento.
 */
package Ex03;

import javax.swing.JOptionPane;

public class Ex11 {
        public static void main(String[] args) {
//Variável
        double salario;
        double aumento;
        double nsalario;
        double diferenca;
        int porcentagem;
        
//Entrada
        salario = Double.parseDouble
        (JOptionPane.showInputDialog("Digite o salário o salário do colaborador"));

//Processamento
          if(salario<=280){
            aumento = salario * 0.2;
            porcentagem = 20;
            
          }else if(salario>280 || salario>=700){
            aumento = salario * 0.15;
            porcentagem = 15;

          }else if(salario>700 || salario>=1500){
            aumento = salario * 0.10;
            porcentagem = 10;
            
          }else {
            aumento = salario * 0.05;
            porcentagem = 5;
          }

          nsalario = aumento + salario;
//Saída
        JOptionPane.showMessageDialog(null,"O salário anterior: "+salario+
                "\nO percentual de aumento aplicado: "+porcentagem+" %"+
                "\nO valor de aumento: "+aumento+
                "\nO novo salário: "+nsalario);
        }
}
