package Animal;
public class Veterinario{
    private String id;

    public Veterinario(String nome) {
        this.id = nome;
    }
    public void examinar(Animal ani){
        System.out.println("Animal examinado: " + ani.getSom());
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
