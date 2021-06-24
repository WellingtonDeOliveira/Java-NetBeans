package funcionario;
public class Mercenario extends Funcionario{
    private int trabalhoFeito;

    public Mercenario(String nome, double salario, String pontoForte, double vendas, int trabalhoFeito) {
        super(nome, salario, pontoForte, vendas, 0);
        this.trabalhoFeito = trabalhoFeito;
    }
    
     @Override
    public String toString() {
        if(this.getTrabalhoFeito() >= 1){
            double comisao = this.getSalario() * 0.10;
            return "Funcionario:" + "nome= " + this.getNome() + ", salario= " + this.getSalario() + ", comisao= " + comisao +"\npontoForte= " + this.getPontoForte() + '.';
        }else{
            return "Funcionario:" + "nome= " + this.getNome() + ", salario= " + this.getSalario() + ", comisao= SEM COMISÃO\npontoForte= " + this.getPontoForte() + '.'; 
        }
    }
        
    // Sobrecarga
    public double comisao(){
        double comisao = 0;
        if(this.getTrabalhoFeito() >= 1 ){
            comisao = this.getSalario() * 0.10;
            this.setSalario(this.getSalario() + comisao);
            return comisao;
        }else{
            return 0;
        }
    }

    public int getTrabalhoFeito() {
        return trabalhoFeito;
    }

    public void setTrabalhoFeito(int trabalhoFeito) {
        this.trabalhoFeito = trabalhoFeito;
    }
    
}
