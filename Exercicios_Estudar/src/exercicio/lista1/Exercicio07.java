package exercicio.lista1;

import java.util.Scanner;

public class Exercicio07 {
        public static void main(String[] args) {
            
            /* 

                Escreva um programa para ler o ano de nascimento 
                de uma pessoa e escrever uma mensagem que
                diga se ela poderá ou não votar este ano
                (a) Não é necessário considerar o mês em que ela nasceu.
                (b) Utilize Ternário

            */
        
            //Considerando que o ano atual na simulação é de votação:
            int anoAtual = 2021;
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o ano em que você nasceu: ");
            int anoDeNascimento = scan.nextInt();
            System.out.println((anoAtual - anoDeNascimento) <= 17 ? "Voto não obrigatório" : "Voto obrigatório");
            
       }
}
