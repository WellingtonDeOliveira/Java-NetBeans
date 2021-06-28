package Lista5_Q1eQ2;

import java.util.Random;
import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    private int qtdTran;

    public ContaCorrente(String senha) {
        super(senha);
          System.out.println("Sua conta corrente foi aberta com sucesso, sua conta inicial tem 200r de saldo e sua senha é: " + senha);
        this.qtdTran = 0;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor < this.getSaldo()) {
            System.out.println("Você acaba de sacar: R$ " + valor + " de sua conta corrente");
            this.setSaldo(-valor);
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            System.out.println("Você acaba de depositar: R$ " + valor + " na sua conta corrente");
            this.setSaldo(valor);
        }else{
            System.out.println("Você não pode por valores negativos");
        }
    }
    
    @Override
    public void mostrarEspecial() {
        System.out.println(getQtdTran());
    }
    
    @Override
    public void extrado() {
        System.out.println("==============================================================");
        System.out.println("Conta Corrente numero:" + this.getNumber() + "\nSaldo: " + this.getSaldo() + "\nQuatidade de transferencias realizadas: " + this.qtdTran);
    }

    public int getQtdTran() {
        return qtdTran;
    }

    public void setQtdTran(int qtdTran) {
        this.qtdTran = qtdTran;
    }


}
