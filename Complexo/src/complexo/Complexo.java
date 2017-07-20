/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexo;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author FilipeBarros
 */
public class Complexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double  soma, subtracao, z1, a = 0,b = 0, z2,c = 0,d = 0,i = 0;
       char operacao = 0;
       
       System.out.println("Entre com a operação dejejada");
       Scanner sc = new Scanner(System.in); 
      
       
       z1 = a + b*i;
       z2 = c + d*i;
       
       switch(operacao) {
           
           case '+': System.out.println("Soma de númros complexos =" + (soma = z1 + z2) );
                    break;
           
           case '-': System.out.println("Subitração dos numeros complexos =" + (subtracao = z1-z2));
                    break;
       }
        
        
    }
    
}
