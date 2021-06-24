package Animal;
public class Animal {
    private String nome;
    private int idade;
    private String som;
    private String locomocao;

    public Animal(String nome, int idade, String som, String locomocao) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.locomocao = locomocao;
    }
    

    // Teste
    public void comer(){
        String ani = "vazio";
        System.out.println(ani);
    }
    // Sobrescrita
    @Override
    public String toString() {
        return "Animal: " + "nome= " + nome + ", idade= " + idade + ", som= " + som + ", locomocao= " + locomocao + '.';
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public String getLocomocao() {
        return locomocao;
    }
    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }
}
