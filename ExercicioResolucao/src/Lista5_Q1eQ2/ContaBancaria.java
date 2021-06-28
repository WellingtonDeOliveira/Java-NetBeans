package Lista5_Q1eQ2;
public interface ContaBancaria {
    public abstract void criarConta(String senha);
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void extrado();
    public abstract void alterarSenha(String senha);
    public abstract void mostrarEspecial();
}
