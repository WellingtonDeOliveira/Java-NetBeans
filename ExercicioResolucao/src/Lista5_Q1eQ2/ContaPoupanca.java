package Lista5_Q1eQ2;

import java.util.Random;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
    
    private double taxaRen;

    public ContaPoupanca(String senha) {
        super(senha);
        System.out.println("Sua conta poupança foi aberta com sucesso, sua conta inicial tem 250r de saldo e sua senha é: " + senha);
        Random ale = new Random();
        this.taxaRen = ale.nextInt(10) / 100;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Você acaba de sacar: R$ " + valor + " de sua conta poupança");
            this.setSaldo(-valor);
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            System.out.println("Você acaba de depositar: R$ " + valor + " na sua conta poupança");
            this.setSaldo(valor);
        }else{
            System.out.println("Você não pode por valores negativos");
        }
    }
    
    @Override
    public void mostrarEspecial() {
        System.out.println(getTaxaRen());
    }

    @Override
    public void extrado() {
        System.out.println("======================================================");
         System.out.println("Conta Corrente numero:" +getNumber() + "\nSaldo: " + getSaldo() + "\nTaxa de rendimendo: " + this.taxaRen);
    }

    public double getTaxaRen() {
        return taxaRen;
    }

    public void setTaxaRen(double taxaRen) {
        this.taxaRen = taxaRen;
    }

    
}
