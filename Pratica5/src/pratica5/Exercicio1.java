package pratica5;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        double notaFinal, faltas, notaMaior = 0, reprovado = 0, maiorNota = 0, menorNota = 0, soma = 0, cont = 0, media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota Final do aulo: ");
        notaFinal = input.nextDouble();
        

        while (notaFinal > 0) {
            System.out.println("Digite o número de faltas: ");
        faltas = input.nextDouble();
            if (notaFinal >= 90) {
                notaMaior++;
            }
            if (notaFinal < 70 || faltas >= 20) {
                reprovado++;
            }
            if (notaFinal > maiorNota) {
                maiorNota = notaFinal;
            }
            if (notaFinal < menorNota) {
                menorNota = notaFinal;
            }
            soma = notaFinal + soma;
            cont++;
            System.out.println("Digite a nota Final do aulo: ");
            notaFinal = input.nextDouble();
            
        }
        media = soma / cont;

        System.out.println(notaMaior + " tiveram nota maior que 90.\n" + reprovado + " foram reprovados.\n" + maiorNota + " a maior nota foi." + menorNota + " a menor nota foi.\n" + media + " a media é");

    }

}
