package exercicio.lista1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /* 
        
            Escreva um programa para ler 2 valores inteiros 
            (considere que não serão informados valores iguais)
            e demonstre o maior deles.
        
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        
        if(valor1 > valor2){
            System.out.println("Primeiro valor é o maior, " + valor1);
        }else{
            System.out.println("Segundo valor é o maior, " + valor2);
        }
    }
    
}
