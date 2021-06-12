package exercicio.lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        
            Escreva um algoritmo que calcule a m´edia dos n´umeros
            digitados pelo usu´ario, se eles forem pares.
            Termine a leitura se o usu´ario digitar zero (0).
        
        */
        Scanner scan = new Scanner(System.in);
        int teste = 1;
        float total = 0f;
        int vezes = 0;
        while(teste != 0){
            System.out.print("Digite um numero (Digite 0 para finalizar a leitura de dados): ");
            teste = scan.nextInt();
            if(teste % 2 == 0 && teste != 0){
                total += teste;
                vezes+= 1;
            }
        }
        float media = (total / vezes);
        System.out.println("A media dos números PARES digitados: " + media);
    }
}
