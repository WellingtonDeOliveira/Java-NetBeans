package exercicio.lista1;

import java.util.Scanner;

public class Exercicio02 {
     public static void main(String[] args) {
         /* 
        
            Escreva um programa em Java que recebe 
            um inteiro e diga se ´e par ou ´ımpar.
        
        */
         
         Scanner scan = new Scanner(System.in);
         System.out.print("Digite um valor: ");
         int inteiro = scan.nextInt();
         if((inteiro % 2) == 0){
             System.out.println("Valor digitado é PAR");
         }else{
             System.out.println("Valor digitado é IMPAR");
         }
     }
}
