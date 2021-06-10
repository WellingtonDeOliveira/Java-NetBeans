package exercicio.lista1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /* 
        
            As maçãs custam 0,30 cada se forem compradas
            menos do que uma d´uzia, 0,25 se forem compradas
            entre 12 e 30 e 0,20 se forem acima de 30 unidades.
            Escreva um programa que leia o n´umero de maçãs 
            compradas, calcule e escreva o valor total da compra
        
        */
        
        Scanner scan = new Scanner(System.in);
        float preco;
        System.out.print("Quantas maçãs você deseja comprar? ");
        int quantidade = scan.nextInt();
        if(quantidade < 12){
            preco = 0.3f * quantidade;
        }else if(quantidade >= 12 && quantidade < 30){
            preco = 0.25f * quantidade;
        }else {
            preco = 0.2f * quantidade;
        }
        System.out.println("Sua compra custou: R$ " + preco);
    }    
}
