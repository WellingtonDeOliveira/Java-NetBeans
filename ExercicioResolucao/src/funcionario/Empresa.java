package funcionario;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista =new ArrayList<Funcionario>();
        // Estanciando os funcionarios
        Gerente g1 = new Gerente("Roberto", 5500, "A mais de 10 anos na empresa", 2000, 0);
        Gerente g2 = new Gerente("Claudia", 5600, "Maior vendedora", 3000, 2);
        Mercenario m1 = new Mercenario("killsaber", 15000, "Um tiro uma morte", 0, 3);
        
        //Chamando o metodo de comisao
        System.out.println(g1.comisao());
        System.out.println(g2.comisao());
        System.out.println(m1.comisao());
        
        // Adicionado na lista
        lista.add(g1);
        lista.add(g2);
        lista.add(m1);
        
        //Exibindo Lista
        for(int i=0; i < lista.size(); i++){
            System.out.println("");
            System.out.println(lista.get(i).toString());
        }
    }
    
}
