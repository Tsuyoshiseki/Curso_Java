/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 

As perguntas são: 

a. "Telefonou para a vítima?" 
b. "Esteve no local do crime?" 
c. "Mora perto da vítima?" 
d. "Devia para a vítima?" 
e. "Já trabalhou com a vítima?" 

O programa deve no final emitir uma classificação sobre a participação da 
pessoa no crime. 

Se a pessoa responder positivamente a 2 questões ela deve ser classificada 
como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 

Caso contrário, ele será classificado como "Inocente".
 */
package Ex02;

import java.util.Scanner;

public class Ex25 {
        public static void main(String[] args) {
//Variável
        String vf;
        int v = 0;
        int f = 0;
        Scanner scan = new Scanner(System.in);


//Entrada
        System.out.println("Telefonou para a vítima?");
        vf = scan.nextLine();
        
        if (vf.equalsIgnoreCase("V")) {
            v++;
        }else{
            f++;
        }
        
        System.out.println("Esteve no local do crime?");
        vf = scan.nextLine();
        
        if (vf.equalsIgnoreCase("V")) {
            v++;
        }else{
            f++;
        }
        
        System.out.println("Mora perto da vítima?");
        vf = scan.nextLine();
        
        if (vf.equalsIgnoreCase("V")) {
            v++;
        }else{
            f++;
        }
        
         System.out.println("Devia para a vítima?");
        vf = scan.nextLine();
        
        if (vf.equalsIgnoreCase("V")) {
            v++;
        }else{
            f++;
        }
        
        System.out.println("Já trabalhou com a vítima?" );
        vf = scan.nextLine();
        
        if (vf.equalsIgnoreCase("V")) {
            v++;
        }else{
            f++;
        }
//Processamento
        
        if(v==2){
            System.out.println("Classificação: Suspeita");
            
        }else if (v==3 || v==4){
            System.out.println("Classificação: Cúmplice");

        }else if (v==5){
            System.out.println("Classificação: Assasina");
            
        }else {
            System.out.println("Classificação: inocente");
            
        }
          

        System.out.println("Total de respostas incriminatorias: " +v);
        System.out.println("Total de respostas inocente(s): " +f);

//Saída
                  scan.close();
        }
}
