package exercicio.lista1;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        
            Façaa um programa, utilizando for, que peça para
            o usúario inserir um número N e mostre na tela
            todos os números ímpares até N.
        
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = scan.nextInt();
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
