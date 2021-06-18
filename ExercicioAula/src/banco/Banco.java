package banco;
import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        funcionario.setSalario(5000.0);
//        
//        System.out.println(funcionario.getBonificacao());
        
////        
        ControleDeBonificações controle = new ControleDeBonificações();
//
        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);
//
        Funcionario secretaria = new Funcionario();
        secretaria.setSalario(1000.0);
        controle.registra(secretaria);
////;
//        System.out.println(controle.getTotalDeBonificacoes());
        
//        
        ArrayList<Funcionario> func = new ArrayList<Funcionario>();
        func.add(secretaria);
        func.get(0).setNome("Augusto");
        func.add(funcionario1);
//        
        for(int i =0; i < 5; i++){
            func.add(new Funcionario());
        }
//        
        for(int i=0; i < func.size(); i++){
            System.out.println(func.get(i).getNome());
        }
//        ;
        
        
    }
}
