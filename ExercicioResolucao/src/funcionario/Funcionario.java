package funcionario;
public class Funcionario {
    private String nome;
    private double salario;
    private String pontoForte;
    private double vendas;
    private int faltas;

    public Funcionario(String nome, double salario, String pontoForte, double vendas, int faltas) {
        this.nome = nome;
        this.salario = salario;
        this.pontoForte = pontoForte;
        this.vendas = vendas;
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        if(vendas >= 1500 && faltas == 0){
            double comisao = this.salario * 0.10;
            return "Funcionario:" + "nome= " + nome + ", salario= " + salario + ", comisao= " + comisao +"\npontoForte= " + pontoForte + '.';
        }else{
            return "Funcionario:" + "nome= " + nome + ", salario= " + salario + ", comisao= SEM COMISÃO\npontoForte= " + pontoForte + '.'; 
        }
    }
    
    public double comisao(){
        double comisao = 0;
        if(vendas >= 1500 && faltas == 0){
            comisao = this.salario * 0.10;
            setSalario(this.getSalario() + comisao);
            return comisao;
        }else{
            return 0;
        }
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPontoForte() {
        return pontoForte;
    }

    public void setPontoForte(String pontoForte) {
        this.pontoForte = pontoForte;
    }
    
    
}
