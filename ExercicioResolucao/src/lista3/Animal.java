package lista3;
public class Animal {
    private String nome;
    private float comprimento;
    int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void dados() {
         System.out.println("Animal:  nome= " + getNome() + ", comprimento= " + getComprimento() +
                "cm, patas= " + getPatas() + ", cor= " + getCor() + ", ambiente= " + getAmbiente() + ", velocidade= " + getVelocidade() + "m/s");
    }
    
    public void imprimir(){
        System.out.println("Olá, sou um animal");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
