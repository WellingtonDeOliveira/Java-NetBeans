package lista.sala;
public class Exercicio05 {
    public static void main(String[] args) {
        /*
            A Sequência de Fibonacci é uma sucessão de n´umeros. Esta sucessão obedece um padrão onde
            cada elemento subsequente é o resultado da soma dos dois elementos anteriores.
            Ela pode ser definida pela seguinte f´ormula: Fn = Fn−1 + Fn−2
            Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
            Escreva um programa para imprimir a s´erie de FIBONACCI até o 10º termo.
        */
        int pause = 0;
        int next = 0;
        int ant = 1;
        // desculpa por ter printado os dois primeiros termos dessa maneira.
        System.out.print("0 1 ");
        for(int i = 0; i < 8; i++){
            next = pause + ant;
            pause = ant;
            ant = next;
            System.out.print(next + " ");
        }
    }
}
