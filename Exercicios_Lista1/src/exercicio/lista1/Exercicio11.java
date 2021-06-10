package exercicio.lista1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        
            Faça um programa, utilizando for e while, que peça ao usúario
            um número e mostre a sua tabuada, enquanto o usu´ario quiser.
            (a) Ao digitar 0 encerra o programa
        
        */
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("Digite um valor (para encerrar a execução digite 0): ");
            n = scan.nextInt();
            if(n != 0){
                System.out.println("==============");
                System.out.println(" Tabuada do: " + n);
                for(int i = 1; i <= 10; i++){
                    System.out.println(" " + n + " x " + i + " = " + (n*i));
                }
                System.out.println("==============");
            }
        }while(n != 0);
    }
}
