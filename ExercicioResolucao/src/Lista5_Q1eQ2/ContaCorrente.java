package Lista5_Q1eQ2;

import java.util.Random;
import java.util.Scanner;

public class ContaCorrente implements ContaBancaria {

    private String senha;
    private int number;
    private double saldo;
    private int qtdTran;

    @Override
    public void criarConta(String senha) {
        Random ale = new Random();
        System.out.println("Sua conta corrente foi aberta com sucesso, sua conta inicial tem 200r de saldo e sua senha é: " + senha);
        this.number = ale.nextInt(99999);
        this.saldo = 200;
        this.senha = senha;
        this.qtdTran = 0;
    }

    @Override
    public void sacar(double valor) {
        if (valor < this.saldo) {
            System.out.println("Você acaba de sacar: R$ " + valor + " de sua conta corrente");
            this.saldo -= valor;
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            System.out.println("Você acaba de depositar: R$ " + valor + " na sua conta corrente");
            this.saldo += valor;
        }else{
            System.out.println("Você não pode por valores negativos");
        }
    }

    @Override
    public void alterarSenha(String senha) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Comdirme sua antiga senha antes: ");
        String vSen = scan.nextLine();
        if(vSen.equals(this.senha)){
            System.out.println("Senha alterada com sucesso!");
            setSenha(senha);
        }else{
            System.out.println("Senha digitada não condiz com a anterior");
        }
    }
    
    @Override
    public void mostrarEspecial() {
        System.out.println(getQtdTran());
    }
    
    @Override
    public void extrado() {
        System.out.println("==============================================================");
        System.out.println("Conta Corrente numero:" + this.number + "\nSaldo: " + this.saldo + "\nQuatidade de transferencias realizadas: " + this.qtdTran);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getQtdTran() {
        return qtdTran;
    }

    public void setQtdTran(int qtdTran) {
        this.qtdTran = qtdTran;
    }


}
