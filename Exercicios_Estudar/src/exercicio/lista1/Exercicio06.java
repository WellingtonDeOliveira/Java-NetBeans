package exercicio.lista1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /* 
        
            Elabore um algoritmo que leia dois valores do usu´ario
            e a operação que ele deseja executar 
            (Operações: soma, subtraçãoo, divisão, multiplicação). 
            Execute a opera¸c˜ao desejada e imprima na tela.
        
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        System.out.print("Digite a operação que deseja fazer\n "
                        + "Soma [+]\n Subtração [-]\n Multiplicação [*]\n Divisão [/] \n -> ");
        String  operacao = scan.next();
        switch (operacao) {
            case "+":
                System.out.println("O valor da soma é: " + (valor1 + valor2));
                break;
            case "-":
                System.out.println("O valor da subtração é: " + (valor1 - valor2));
                break;
            case "*":
                System.out.println("O valor da multiplicação é: " + (valor1 * valor2));
                break;
            case "/":
                System.out.println("O valor da divisão é: " + (valor1 / valor2));
                break;
            default:
                System.out.println("Operação digitada inválida!");
                break;
        }
    }
}
