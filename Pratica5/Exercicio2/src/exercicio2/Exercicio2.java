package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        double matricula, nota1, nota2, nota3, media, soma;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a matricula do aluno: ");
        matricula = input.nextDouble();
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        while (matricula > 0) {
            soma = nota1 + nota2 + nota3;
            media = soma / 3;
            if (media >= 70) {
                System.out.println("O aluno " + matricula + " foi aprovado!");
            }
            if (media >= 60 && media < 70) {
                System.out.println("O aluno " + matricula + " está em recuperação!");
            }
            if (media < 60) {
                System.out.println("O aluno " + matricula + " foi reprovado!");
            }
            System.out.println("Digite a matricula do aluno: ");
            matricula = input.nextDouble();
            System.out.println("Digite a primeira nota: ");
            nota1 = input.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = input.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = input.nextDouble();

        }

    }

}
