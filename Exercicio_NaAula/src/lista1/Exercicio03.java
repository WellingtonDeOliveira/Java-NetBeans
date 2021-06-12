package lista1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
            Leia um valor inteiro X e imprima os 5 números ímpares consecutivos
            de X incluindo o X se for o caso.
            (a) Exemplo: X = 9
            (b) Saída: 9,11,13,15,17,19
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scan.nextInt();
         for(int i = valor; i <= (valor + 10); i++){
             if(i % 2 != 0){
                 System.out.print(i + " ");
             }
         }
         System.out.println(" ");
    }
}
