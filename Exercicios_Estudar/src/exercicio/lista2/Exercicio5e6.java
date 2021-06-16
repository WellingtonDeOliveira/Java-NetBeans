package exercicio.lista2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5e6 {
    public static void main(String[] args) {
        /*
            5) Escreva um programa que popula uma matriz bidimensional de inteiros com dimensões escolhidas
                pelo usuário. Após a matriz populada verifique o maior valor da matriz.
        
            6) Utilize a matriz da questão anterior e retorne a soma de todos os elementos da matriz.
        */
        Scanner scan = new Scanner(System.in);
        Random pop = new Random();
        int x, y;
        System.out.print("Digite o tamanho de x [x][y]: ");
        x = scan.nextInt();
        System.out.print("Digite o tamanho de y [" + x + "][y]: ");
        y = scan.nextInt();
        int matriz[][] = new int[x][y], aux = 0, soma = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = pop.nextInt(99);
                soma += matriz[i][j];
                if(aux < matriz[i][j]){
                    aux = matriz[i][j];
                }
            }
        }
        System.out.println("Exercicio 5) Maior valor populado: " + aux);
        System.out.println("Exercicio 6) Soma de todos os elementos: " + soma);
    }
}
