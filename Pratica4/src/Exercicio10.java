package com.mycompany.demo.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado = 0, opcao, teste = 0;

        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextDouble();
        System.out.println("Digite o primeiro valor: ");
        num2 = input.nextDouble();
        System.out.println("Digite o número que corresponde a operação desejada:\n1.Somar \n2.Multiplicar \n3.Subtrair \n4.Dividir ");
        opcao = input.nextDouble();

        if (opcao == 1) {
            resultado = num1 + num2;
        }
        if (opcao == 2) {
            resultado = num1 * num2;
        }
        if (opcao == 3) {
            if (num1 == 0 && num2 == 0) {
                resultado = 0;
            } else {
                resultado = num1 - num2;
            }
        }
        if (opcao == 4) {
            if (num2 == 0) {
                System.out.println("Não existe divisão por 0.");
                teste = 1;
            } else {
                resultado = num1 - num2;
            }
        }

        if (teste != 1) {
            System.out.println("O resultado é: ");
        }
    }
}
