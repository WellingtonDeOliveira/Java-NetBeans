package lista2;

import java.util.Scanner;

public class Exercicio4 {
        public static void main(String[] args) {
            /*
                Fatorial. Escreva um programa para calcular o fatorial de um número inteiro positivo.
            */
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite um valor inteiro: ");
            int fatorial = scan.nextInt(), auxiliar = 1;
            while(fatorial < 0){
                System.out.print("Digite um valor inteiro, positivo: ");
                fatorial = scan.nextInt();
            }
            for(int i = 1; i <= fatorial; i++){
                auxiliar *= i;
            }
            System.out.println("O fatorial de " + fatorial + " é: " + auxiliar);
        }
}
