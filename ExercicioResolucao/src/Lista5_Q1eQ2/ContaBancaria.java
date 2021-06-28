package Lista5_Q1eQ2;

import java.util.Random;
import java.util.Scanner;

public abstract class ContaBancaria {
    private String senha;
    private int number;
    private double saldo;
    
    
    public ContaBancaria(String senha){
        Random ale = new Random();
        this.number = ale.nextInt(99999);
        this.saldo = 250;
        this.senha = senha;
        
    }
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
    
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void extrado();
    public abstract void mostrarEspecial();

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
    
}
