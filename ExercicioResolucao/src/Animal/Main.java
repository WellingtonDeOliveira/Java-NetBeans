package Animal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> jaula =new ArrayList<Animal>();
        // Estanciando objetos
        Cachorro ch1 = new Cachorro("Cachorro", 10);
        Cavalo cv1 = new Cavalo("Cavalo", 15);
        Preguica pr1 = new Preguica("Preguiça", 5);
        
        //Examinado animais
        Veterinario v1 = new Veterinario("123");
        /*v1.examinar(ch1);
        v1.examinar(cv1);
        v1.examinar(pr1);
        */
        // adicionando na lista
        jaula.add(ch1);
        jaula.add(cv1);
        jaula.add(pr1);
        jaula.add(ch1);
        jaula.add(cv1);
        
        for(int i = 0; i < jaula.size(); i++){
            v1.examinar(jaula.get(i));
        }
    }
}
