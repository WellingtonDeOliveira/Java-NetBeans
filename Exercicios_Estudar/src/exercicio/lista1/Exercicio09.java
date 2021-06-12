package exercicio.lista1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        
            Escreva um programa que leia um valor inteiro N (N <=10) 
            e escrever a tabuada de 1 a 10 de N
        
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor entre 1 a 10: ");
        int n = scan.nextInt();
        if(n >= 1 && n<= 10){
            System.out.println("==============");
            System.out.println(" Tabuada do: " + n);
            for(int i = 1; i <= 10; i++){
                System.out.println(" " + n + " x " + i + " = " + (n*i));
            }
            System.out.println("==============");
        }else{
            System.out.println("Valor digitado inválido");
        }
    }
}
