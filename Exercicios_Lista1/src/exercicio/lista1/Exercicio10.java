package exercicio.lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        
            Faça um programa, utilizando for, que peça para o usúario
            inserir um número N e mostre na tela todos os n´umeros
            primos até N .
            (a) N´umeros Primos são aqueles divisíveis apenas por 1 e por eles mesmos
        
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor:  ");
        int num = scan.nextInt();
        int div;
        for(int i = 1; i <= num; i++){
            div = 0;
            for(int u = 1 ; u <= num; u++){
                if((i % u )  == 0){
                        div = div + 1;
                    }
                }
                if(div == 2){
                    System.out.print(i + " ");
                }
            }
            System.out.println(" ");
    }
}
