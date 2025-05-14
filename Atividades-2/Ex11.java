/*
As Organizações Tabajara resolveram dar um aumento de salário aos seus 
colaboradores e lhe contrataram para desenvolver o programa que calculará os 
reajustes. 

Faça um programa que recebe o salário de um colaborador e o reajuste 
segundo o seguinte critério, baseado no salário atual: 

- salários até R$ 280,00 (incluindo): aumento de 20% 
- salários entre R$ 280,00 e R$ 700,00: aumento de 15% 
- salários entre R$ 700,00 e R$ 1500,00: aumento de 10% 
- salários de R$ 1500,00 em diante aumento de 5% 

Αρός ο aumento ser realizado, informe na tela: 
- o salário antes do reajuste; 
- o percentual de aumento aplicado; 
- o valor do aumento; 
- o novo salário, após o aumento.
 */
package Ex02;

import java.util.Scanner;

public class Ex11 {
        public static void main(String[] args) {
            //Variável
            double salario;
            double aumento;
            double Nsalario;
            Scanner scan = new Scanner(System.in);
            
            //Entrada
            System.out.println("Digite o salário");
            salario = scan.nextDouble();
            
            //Processamento
            if(salario<=280){
                aumento = salario*0.2;
                Nsalario = aumento + salario;
                System.out.println("O salário anterior era: R$" +salario);
                System.out.println("A porcentagem foi de: 20%");
                System.out.println("O valor do aumento foi de: R$" +aumento);
                System.out.println("O novo salário será: R$" +Nsalario);

            }if(salario>280 && salario<=700){
                aumento = salario*0.15;
                Nsalario = aumento + salario;
                System.out.println("O salário anterior era: R$" +salario);
                System.out.println("A porcentagem foi de: 15%");
                System.out.println("O valor do aumento foi de: R$" +aumento);
                System.out.println("O novo salário será: R$" +Nsalario);
                
            }if(salario>700 && salario<=1500){
                aumento = salario*0.10;
                Nsalario = aumento + salario;
                System.out.println("O salário anterior era: R$" +salario);
                System.out.println("A porcentagem foi de: 10%");
                System.out.println("O valor do aumento foi de: R$" +aumento);
                System.out.println("O novo salário será: R$" +Nsalario);
                
            }if(salario>1500){
                aumento = salario*0.05;
                Nsalario = aumento + salario;
                System.out.println("O salário anterior era: R$" +salario);
                System.out.println("A porcentagem foi de: 5%");
                System.out.println("O valor do aumento foi de: R$" +aumento);
                System.out.println("O novo salário será: R$" +Nsalario);
            }
        
            //Saída
            scan.close();

                        
        }
}
