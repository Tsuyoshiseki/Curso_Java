/*
 . Um posto está vendendo combustíveis com a seguinte tabela de descontos: 

Álcool: 
a. até 20 litros, desconto de 3% por litro 
b. acima de 20 litros, desconto de 5% por litro 

Gasolina: 
c. até 20 litros, desconto de 4% por litro 
d. acima de 20 litros, desconto de 6% por litro 

Escreva um algoritmo que leia o número de litros vendidos, o tipo de 
combustível (codificado da seguinte forma: A-álcool, G- gasolina), calcule 
e imprima o valor a ser pago pelo cliente. 

litro da gasolina é R$ 2,50 
litro do álcool é R$ 1,90

 */
package Ex02;

import java.util.Scanner;

public class Ex26 {
        public static void main(String[] args) {
//Variável
        String ga;
        double LA = 1.9;
        double LG = 2.5;
        double litro = 0;
        double valorT = 0, valorD = 0;
        double desconto = 0;
        Scanner scan = new Scanner(System.in);
        

//Entrada
        System.out.println("Deseja abastecer com Álcool(A) ou Gasolina(G)");
        ga = scan.nextLine();
        if (ga.equalsIgnoreCase("A")){
            ga = "Álcool";
        }else {
            ga = "Gasolina";
        }
        
        System.out.println("Quantos litros deseja abastecer de " +ga);
        litro = scan.nextDouble();
        
        

//Processamento

//Álcool
        if (ga.equalsIgnoreCase("álcool")) {
            
          valorT = litro * LA;

            
        }if(litro<=20){        
            desconto = LA * (3/100);
            
            
        }else {           
            desconto = LA * 0.05;
        }
        
//Gasolina       
        if (ga.equalsIgnoreCase("gasolina")) {
            
            valorT = litro * LG;
                    
        }if(litro<=20){
            desconto = LG * 0.04;
            
        }else {
            desconto = LG * 0.05;
            
        }
        
//Saída
        
        valorD = valorT - (valorT * desconto);
        
        System.out.println("Combustível usado: " +ga);
        System.out.println("Valor sem desconto: R$" +valorT);
        System.out.println("Valor com desconto: R$" +valorD);

        scan.close();

        }
}
