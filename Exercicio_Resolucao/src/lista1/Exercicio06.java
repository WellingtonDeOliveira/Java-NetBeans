package lista1;

import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
            Faça um programa que preencha uma matriz M de dimensões 20x10 com n´umeros inteiros (utilize
            n´umeros aleat´orios) e some cada uma das colunas, armazenando o resultado da soma de cada
            coluna em um vetor v. Após, verifique se existe algum n´umero primo dentro do vetor. Se sim,
            imprima o n´umero e a posiçõo.
            (a) Dica: Pesquise sobre a classe Random para gerar n´umeros aleatórios.
        */
        int vetor[] = new int[20];
        int matriz[][] = new int[20][10];
        Random aleatorio = new Random();
        for(int i = 0; i < 20; i++){
            matriz[i][0] = aleatorio.nextInt(9);
            for(int j = 0; j < 10; j++){
                matriz[i][j] = aleatorio.nextInt(9);
                vetor[i] += matriz[i][j];
            }
        }
        int div;
        for(int i = 0; i < 20; i++){
            div = 0;
            for(int u = 1; u < vetor[i]; u++){
                if((vetor[i] % u )  == 0){
                        div += 1;
                    }
                }
                if(div == 1){
                    System.out.print(vetor[i] + " ");
                    System.out.println("Número primo na posição [" + i + "]");
                }
            }
    }
}
