package lista2;
public class Exercicio1 {
    public static void main(String[] args) {
        /*
            Escreva um programa para calcular o valor de S, dado por:
            S= 1/1 - 2/4 + 3/9 - 4/16 + ... - 10/100
        */
        float S = 0f, auxiliar = 0f;
        for(int i =1; i<=10; i++){
            auxiliar = (float) i/(i*i);
            if(i % 2 == 0){
                S -= auxiliar;
            }else{
                S += auxiliar;
            }
        }
        System.out.println(S);
    }
    
}