package lista3;
public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("folha", "Camelo", 150, 4, "Amarelo", "Terra", 2.0f);
        Peixe dorado = new Peixe("Ele nada", "Dorado", 10, "Laranja", "Agua", 10.0f);
        Animal barata = new Animal("Barata", 3, 8, "Marrom", "Esgoto", 0.2f);
        
        camelo.dadosMamifero();
        camelo.imprimir();
        dorado.dadosPeixe();
        dorado.imprimir();
        barata.dados();
        barata.imprimir();
    }
}
