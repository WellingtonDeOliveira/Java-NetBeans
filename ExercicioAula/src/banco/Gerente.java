/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Hericson
 */
public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionariosGerenciados;
    
    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
}
