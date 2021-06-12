package exercicio.lista1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /* 
        
            Escreva um programa que verifique a validade de 
            uma senha fornecida pelo usu´ario. A senha
            v´alida ´e “web”. Devem ser impressas as 
            seguintes mensagens:
            (a) ACESSO PERMITIDO caso a senha seja v´alida.
            (b) ACESSO NEGADO caso a senha seja inv´alida.
        
        */
        
        Scanner scan = new Scanner(System.in);
        String senhaValida = "web";
        System.out.print("Informe a senha de acesso: ");
        String senha = scan.nextLine();
        if(senha.equals(senhaValida)){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
    }
}
