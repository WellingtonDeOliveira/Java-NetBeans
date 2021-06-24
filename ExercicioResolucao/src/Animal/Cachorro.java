package Animal;
public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Au Au", "Correr");
    }
    // Sobrecarga
    public void comer(){
        String ani = "Comendo um Osso";
        System.out.println(ani);
    }
}
