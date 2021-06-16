package lista3;
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String alimento, String nome, float comprimento, int patas, String cor, String ambiente, float velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        System.out.println("Mamifero: Alimento= "+ this.alimento + ", nome= " + getNome() + ", comprimento= " + getComprimento() +
                "cm, patas= " + getPatas() + ", cor= " + getCor() + ", ambiente= " + getAmbiente() + ", velocidade= " + getVelocidade() + "m/s");
    }
    @Override
    public void imprimir(){
        System.out.println("Olá, sou um Mamifero");
    }
    
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
