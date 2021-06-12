package exercicio.lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /* 
        
            As maçãs custam 0,30 cada se forem compradas
            menos do que uma d´uzia, e 0,25 se forem compradas 
            pelo menos doze. Escreva um programa que leia o 
            número de maçãs compradas, calcule e escreva o 
            valor total da compra.
        
        */
        
        Scanner scan = new Scanner(System.in);
        float preco = 0f;
        System.out.print("Quantas maçãs você deseja comprar? ");
        int quantidade = scan.nextInt();
        if(quantidade < 12){
            preco = 0.3f * quantidade;
        }else if(quantidade >= 12){
            preco = 0.25f * quantidade;
        }
        System.out.println("Sua compra custou: R$ " + preco);
    }
}
