package exercicio.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
            Leia um conjunto de valores inteiros e em seguida, exiba-os na 
            ordem inversa do que foram digitados
        */
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.print("Digite um valor: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println("");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
    }
}
