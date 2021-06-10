package lista.sala;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
             Leia 3 valores do tipo double, imprima o maior valor e a m´edia.
        */
        Scanner scan = new Scanner(System.in);
        double vetor[] = new double[3];
        double maior = 0;
        double total = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i+1) + "° valor: ");
            vetor[i] = scan.nextDouble();
            total += vetor[i];
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println("O maior valor digitado é: " + maior);
        System.out.println("A media dos valores digitados é: " + (total / vetor.length));
    }
}
