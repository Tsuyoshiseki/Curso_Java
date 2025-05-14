/*
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. 
Confira: 
                Até 5 Kg            Acima de 5 Kg 
File Duplo      R$ 5,80 por Kg      R$ 4,90 por Kg
Alcatra         R$ 6,80 por Kg      R$ 5,90 por Kg
Picanha         R$ 7,80 por Kg      R$ 6,90 por Kg 

Para atender a todos os clientes, cada cliente poderá levar apenas um 
dos tipos de carne da promoção, porém não há limites para a quantidade de 
carne por cliente. Se compra for feita no cartão Tabajara o cliente 
receberá ainda um desconto de 5% sobre o total a compra. 

Escreva um programa que peça o tipo e a quantidade de carne comprada 
pelo usuário e gere um cupom fiscal, contendo as informações da compra: 

- Tipo de carne;
- Quantidade de carne;
- Preço total;
- Tipo de pagamento;
- Valor do desconto; 
- Valor a pagar.

 */
package Ex02;

import java.util.Scanner;

public class Ex28 {
        public static void main(String[] args) {
//Variável
        String carne;
        String cartao;
        double kg;
        double valorT;
        double desconto = 0;
        double valorD;
        Scanner scan = new Scanner(System.in);
//Entrada
        System.out.println("Selecionar carne:"+
                "\n File duplo (1)"+
                "\n Alcatra (2)"+
                "\n Picanha (3)");
        carne = scan.nextLine();
        
        if (carne.equalsIgnoreCase("1")){
            carne = "Filé duplo";
            
        }else if (carne.equalsIgnoreCase("2")){
            carne = "Alcatra";
            
        }else {
            carne = "Picanha";
        }
        
        System.out.println("Cartão Tabajara?"+
                "\n Sim (S)"+
                "\n Não (N)");
        
        cartao = scan.nextLine();
        
        
        System.out.println("Quantos kilogramas de " +carne);
        kg = scan.nextDouble();
        
        

//Processamento

//File duplo
        if (carne.equalsIgnoreCase("file duplo")) {
        }if(kg<=5){
            valorT = 5.8 * kg;
            
        }else {
            valorT = 4.9 * kg;

        }

//Alcatra
        if (carne.equalsIgnoreCase("alcatra")) {
        }if(kg<=5){
            valorT = 6.8 * kg;
            
        }else {
            valorT = 5.9 * kg;

        }

//Picanha
        if (carne.equalsIgnoreCase("picanha")) {
        }if(kg<=5){
            valorT = 7.8 * kg;
            
        }else {
            valorT = 6.9 * kg;
        }
        
//Desconto Tabajara       
        if (cartao.equalsIgnoreCase("S")) {
            desconto = (valorT * 0.1);
            valorD = valorT - desconto;
            
        }else {
            valorD = valorT;
        }

//Saída
        System.out.println("Tipo de carne: " +carne);
        System.out.println("Quantidade de carne: " +kg+ " Kg");
        System.out.println("Valor total: R$" +valorT);
        System.out.println("Desconto: R$" +desconto);
        System.out.println("Valor com cartão Tabajara: R$" +valorD);

        scan.close();
        }
}
