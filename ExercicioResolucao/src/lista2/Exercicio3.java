package lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero de termos: ");
        int n = scan.nextInt(), posicao = 0;
        System.out.print("Digite o valor de A: ");
        float a = scan.nextFloat();
        float s = 0f;
        for(int i = 2; i <= n; i++){
            s += (float) 1/i;
            if(s>a && posicao <= 0){
                posicao = i;
            }
        }
        if(s>a){
                System.out.println("S superou o valor de " + a + " na posição: " + posicao);
            }else {
                System.out.println("S não consegiu superar o valor de A!");
            }
        /*
            RESPOSTA: Meu programa roda normalmente, mas por S não conseguir superar A, ele cai no else
            e printa que o S não consegiu passar A.
        */
    }
}
