/*
 Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um 
algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: 

Para homens: (72.7*h) - 58 

Para mulheres: (62.1*h) - 44.7 

(h = altura) 

Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.

 */
package Ex01;

import javax.swing.JOptionPane;

public class Ex13 {
        public static void main(String[] args) {
            
            //Variável
            double h;
            double peso;
            double ideal;
            String sexo;
            
            h = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: "));
            
            peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso: "));
            
            sexo = JOptionPane.showInputDialog("Insira seu sexo (M) para masculino e (F) para feminino");
            
            if(sexo.equalsIgnoreCase("M")){
                
                ideal = (72.7*h) - 58;
                
                JOptionPane.showMessageDialog(null, "Seu peso ideal é " +ideal);
                
            }else if (sexo.equalsIgnoreCase("F")) {
                
                ideal = (62.1*h) - 44.7;
                
                JOptionPane.showMessageDialog(null, "Seu peso ideal é " +ideal);
                
            }else{ 
                JOptionPane.showMessageDialog(null,"Insira um sexo válido, M ou F");
                return;
            }    
            
            if (peso > ideal) {
            JOptionPane.showMessageDialog(null, "Você está acima do peso ideal.");
            
            } else if (peso < ideal) {
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso ideal.");
            
            } else {
            JOptionPane.showMessageDialog(null, "Você está no peso ideal.");
        }
    }
}


            
            
           
                
               
           

