package exercicio.lista2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
     public static void main(String[] args) {
         /*
            Crie um programa que popule um array a com 10 inteiros e um valor inteiro x e imprima a
            quantidade de vezes que x aparece no array a.
         */
         Scanner scan = new Scanner(System.in);
         Random pop = new Random();
         int a[] = new int[11], x, qtd = 1;
         System.out.print("Digite um valor para x: ");
         x = scan.nextInt();
         a[10] = x;
         for(int i = 0; i<10; i++){
             a[i] = pop.nextInt(20);
             if(x == a[i]){
                qtd += 1; 
             }
         }
         for(int i = 0; i<=10; i++){
             System.out.print(a[i] +" ");
         }
         System.out.println("\nQuantidade de vezes que " + x + " aparece: " + qtd);
     }
}
