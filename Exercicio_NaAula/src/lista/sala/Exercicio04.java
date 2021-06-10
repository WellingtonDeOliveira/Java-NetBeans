package lista.sala;

import java.util.Scanner;

public class Exercicio04 {
     public static void main(String[] args) {
         /*
            Escreva um programa que lê uma quantidade de n´umeros N. Crie um vetor de inteiros X com
            tamanho N. Popule o vetor X, com valores digitados pelo usu´ario. Por fim, imprima o menor
            valor e a posição dele no vetor.
         */
         Scanner scan = new Scanner(System.in);
         System.out.print("Digite o tamanho do vetor: ");
         int n = scan.nextInt();
         int aux, pos =0;
         int vetor[] = new int[n];
         for(int i = 0; i < vetor.length; i++){
             System.out.print("Digite o " + (i+1) + "° : ");
             vetor[i] = scan.nextInt();

         }
         aux = vetor[0];
         for(int i = 0; i < vetor.length; i++){
             if(aux > vetor[i]){
                 aux = vetor[i];
                 pos = i;
             }
         }
         System.out.println("O menor valor Digitado foi: " + aux);
         System.out.println("Encontra-se na posição : [" + pos + "]");
     }
}
