package exercicioaula;
public class Automovel {
    private String marca;
    private String cor;
    private int velocidade;
    
    
    public void ligar(){
        System.out.println("Carro " + marca + " ligado, velocidade atual: " + velocidade);
    }
    public void buzinar(){
        System.out.println("Carro " + marca + " Buzinando!!");
    }
    public Automovel(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }
    public Automovel(String marca, String cor, int velocidade) {
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
