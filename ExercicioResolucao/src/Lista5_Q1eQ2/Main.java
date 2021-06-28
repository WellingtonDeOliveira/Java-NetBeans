package Lista5_Q1eQ2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Quantas contas você deseja cadastrar: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String tipo;
        ContaBancaria conta[] = new ContaBancaria[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Digite (cc) Conta Corrente ou (cp) Conta Poupança: ");
            tipo = scan.next();
            if (tipo.equals("cc")) {
                conta[i] = new ContaCorrente("123");
            } else {
                conta[i] = new ContaPoupanca("321");
            }
        }
        for (int i = 0; i < x; i++) {
            if (conta[i].getClass().getSimpleName().equals("ContaPoupanca")) {
                conta[i].mostrarEspecial();
            }
        }
        for (int i = 0; i < x; i++) {
            conta[i].depositar(800);
            conta[i].sacar(438);
            conta[i].extrado();
        }
        for (int i = 0; i < x; i++) {
            conta[i].mostrarEspecial();
        }
    }
}
