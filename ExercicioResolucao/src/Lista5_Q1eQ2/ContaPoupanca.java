package Lista5_Q1eQ2;

import java.util.Random;
import java.util.Scanner;

public class ContaPoupanca implements ContaBancaria{
    private String senha;
    private int number;
    private double saldo;
    private double taxaRen;

    @Override
    public void criarConta(String senha) {
        Random ale = new Random();
        System.out.println("Sua conta poupança foi aberta com sucesso, sua conta inicial tem 250r de saldo e sua senha é: " + senha);
        this.number = ale.nextInt(99999);
        this.saldo = 250;
        this.senha = senha;
        this.taxaRen = ale.nextInt(10) / 100;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Você acaba de sacar: R$ " + valor + " de sua conta poupança");
            this.saldo -= valor;
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            System.out.println("Você acaba de depositar: R$ " + valor + " na sua conta poupança");
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
        System.out.println(getTaxaRen());
    }

    @Override
    public void extrado() {
        System.out.println("======================================================");
         System.out.println("Conta Corrente numero:" + this.number + "\nSaldo: " + this.saldo + "\nTaxa de rendimendo: " + this.taxaRen);
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

    public double getTaxaRen() {
        return taxaRen;
    }

    public void setTaxaRen(double taxaRen) {
        this.taxaRen = taxaRen;
    }

    
}
