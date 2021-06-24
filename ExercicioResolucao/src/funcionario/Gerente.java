package funcionario;
public class Gerente extends Funcionario{

    public Gerente(String nome, double salario, String pontoForte, double vendas, int faltas) {
        super(nome, salario, pontoForte, vendas, faltas);
    }
    
    @Override
    public String toString() {
        if(this.getVendas() >= 1500 && this.getFaltas() == 0){
            double comisao = this.getSalario() * 0.10;
            return "Funcionario:" + "nome= " + this.getNome() + ", salario= " + this.getSalario() + ", comisao= " + comisao +"\npontoForte= " + this.getPontoForte() + '.';
        }else{
            return "Funcionario:" + "nome= " + this.getNome() + ", salario= " + this.getSalario() + ", comisao= SEM COMISÃO\npontoForte= " + this.getPontoForte() + '.'; 
        }
    }
    
    @Override
    public double comisao(){
        double comisao = 0;
        if(this.getVendas() >= 1500 && this.getFaltas() == 0){
            comisao = this.getSalario() * 0.10;
            this.setSalario(this.getSalario() + comisao);
            return comisao;
        }else{
            return 0;
        }
    }
}
