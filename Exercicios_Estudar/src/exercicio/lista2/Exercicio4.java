package exercicio.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
            Escreva um trecho Java que leia 10 valores double do teclado e armazene-os em uma matriz de
            dimensões 2x5.
        */
        Scanner scan = new Scanner(System.in);
        double matriz[][] = new double[2][5];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print("Digite o valor na posição [" + i +"][" + j + "]:");
                matriz[i][j] = scan.nextDouble();
            }
        }
         for(int j = 0; j<matriz[0].length; j++){
             System.out.println("[" + matriz[0][j] + "] [" + matriz[1][j] + "]");
         }
    }
}
