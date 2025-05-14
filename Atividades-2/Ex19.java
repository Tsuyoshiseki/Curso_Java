/*
Faça um Programa que leia um número inteiro menor que 1000 е imprima a 
quantidade de centenas, dezenas e unidades do mesmo. 

Observando os termos no plural a colocação do "e", da vírgula entre outros. 

Exemplo: 
326 = 3 centenas, 2 dezenas e 6 unidades 
121 dezena e 2 unidades 

Testar com: 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 
11, 1, 7 e 16
 */
package Ex02;

import java.util.Scanner;

public class Ex19 {
        public static void main(String[] args) {
//Variável
        int numero;
        int centena;
        String c,d,u;
        int dezena;
        int unidade;
        Scanner scan = new Scanner(System.in);

//Entrada
        System.out.println("Insira um número menor que 1000");
        numero = scan.nextInt();

//Processamento
          centena = numero/100;
          dezena = (numero%100)/10;
          unidade = numero%10;

//Saída
        if(centena==1){
            c = " centena, ";
        }else {
            c = " centenas, ";  
        }
        
        if(dezena==1){
            d = " dezena, ";
        }else {
            d = " dezenas, ";  
        }
        
        if(unidade==1){
            u = " unidade.";
        }else {
            u = " unidades.";  
        }
        
        System.out.println(numero + " = " + centena + c + dezena + d + unidade + u);

}
}
