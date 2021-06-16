package exercicio.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
            Leia um conjunto de alunos, cada um com o nome e a nota. Em seguida, exiba o nome dos alunos
            que possuem a nota maior do que a média da turma
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int tamanho = scan.nextInt();
        String nome[] = new String[tamanho];
        float nota[] = new float[tamanho], soma = 0, media;
        for(int i = 0; i<tamanho; i++){
            System.out.print("Digite o nome do aluno " + (i+1) +": ");
            nome[i] = scan.next();
            System.out.print("Digite a nota do aluno " + nome[i] + ": ");
            nota[i] = scan.nextFloat();
            soma += nota[i];
        }
        media = soma / tamanho;
        System.out.println("Media da turma: " + media);
        for(int i = 0; i<tamanho; i++){
            if(nota[i] > media){
                System.out.println("Aluno(a): " + nome[i] + " acima da media, nota: " + nota[i]);
            }
        }
    }
}
