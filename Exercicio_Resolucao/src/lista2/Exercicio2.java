package lista2;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
            Um cinema possui capacidade de 100 lugares e está sempre com ocupação total. Certo dia, cada
            espectador respondeu a um questionário, no qual constava: sua idade; sua opinião a respeito do
            filme, conforme os dados abaixo:
                                                            A = Ótimo
                                                            B = Bom
                                                            C = Regular
                                                            D = Ruim
                                                            E = Péssimo
            Elabore um programa que lê este dados e calcula:
            (a) A quantidade de respostas ótimo;
            (b) A diferença entre respostas bom e regular
            (c) A média de idade das pessoas que responderam ruim
            (d) A Porcentagem de respostas péssimo e a maior idade que escolheu essa opção
            (e) A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu
                 ruim
        */
        Random aleatorio = new Random();
        int nota[] = new int[100], idade[] = new int[100], qtdA = 0, qtdB =0, qtdC =0, qtdD =0, qtdE = 0, soma = 0, maiorE = 0, maiorA = 0, maiorD = 0;
        String notas[] = new String[100];
        for(int i = 0; i < 100; i++){
            nota[i] = aleatorio.nextInt(5);
            idade[i] = aleatorio.nextInt(70);
            if(idade[i] <= 13){
                idade[i] += 20;
            }
            if(nota[i] == 3){
                soma += idade[i];
            }
            if(nota[i] == 3 && maiorD < idade[i]){
                maiorD = idade[i];
            }
            if(nota[i] == 0 && maiorA < idade[i]){
                maiorA = idade[i];
            }
            if(nota[i] == 4 && maiorE < idade[i]){
                maiorE = idade[i];
            }
            switch(nota[i]){
                case 0 -> notas[i] = "A";
                case 1 -> notas[i] = "B";
                case 2 -> notas[i] = "C";
                case 3 -> notas[i] = "D";
                case 4 -> notas[i] = "E";
            }
            switch (notas[i]) {
                case "A" -> qtdA += 1;
                case "B" -> qtdB += 1;
                case "C" -> qtdC += 1;
                case "D" -> qtdD += 1;
                case "E" -> qtdE += 1;
                }
        }
        System.out.println("(a) Quantidade de respostas Ótimas: " + qtdA);
        int dif = (qtdB > qtdC) ? qtdB - qtdC : qtdC - qtdB;
        System.out.println("(b) Diferença das respostas Bom e Regular: " + dif);
        System.out.println("(c) Média de idade das que deram notas Ruins: " + (soma/qtdD));
        System.out.println("(d) Porcentagem da respota pessima: " + qtdE + "%  e maior idade da mesma: " + maiorE);
        int dif2 = (maiorA > maiorD) ? maiorA - maiorD : maiorD - maiorA;
        System.out.println("(e) Maior idade A: " + maiorA + " maior idade D: " + maiorD + " diferença: " + dif2);
    }
}
