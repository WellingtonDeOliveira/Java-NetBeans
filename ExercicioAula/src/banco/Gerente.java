
package banco;

public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionariosGerenciados;
    
    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
}
