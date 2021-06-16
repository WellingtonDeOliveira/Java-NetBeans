package lista3;
public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String caracteristica, String nome, float comprimento, String cor, String ambiente, float velocidade) {
        super(nome, comprimento, 0, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
    }
    
    public void dadosPeixe() {
        System.out.println("Peixe:  caracteristica= " + this.caracteristica + ", nome= " + getNome() + ", comprimento= " + getComprimento() +
                "cm, patas= " + getPatas() + ", cor= " + getCor() + ", ambiente= " + getAmbiente() + ", velocidade= " + getVelocidade() + "m/s");
    }
    @Override
    public void imprimir(){
        System.out.println("Olá, sou um Peixe");
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
}
