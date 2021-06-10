package lista.sala;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
            Leia um valor inteiro que será o tempo em segundos, depois converta esse tempo para horas,
            minutos e segundos. A saída do seu programa dever´a ser formatada como: x horas, y minutos, z
            segundos
            (a) Exemplo: 4000 segundos:
            (b) Sa´ıda: 1 Hora, 6 minutos, 40 segundos
            (c) Dica: Utilize o operador de resto da divisão
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de segundos: ");
        int segundos = scan.nextInt();
        int x = 0, y = 0, z = 0, aux = 0; 
        if(segundos >= 3600){
            x = segundos / 3600;
            aux = segundos % 3600;
            y = aux / 60;
            aux = aux % 60;
            z = aux;
        }else if(segundos < 3600 && segundos >= 60){
            x = 0;
            y = segundos / 60;
            aux = segundos % 60;
            z = aux;
        }else{
            x = 0;
            y = 0;
            aux = segundos % 60;
            z = aux;
        }
            System.out.print( x +"hrs " + y + "min " + z + "seg");
    }
}
