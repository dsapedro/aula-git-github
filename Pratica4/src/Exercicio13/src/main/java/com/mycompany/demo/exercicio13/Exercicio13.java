package com.mycompany.demo.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dias, apto, valor = 0;

        System.out.println("Digite a quantidade de dias: ");
        dias = input.nextDouble();
        System.out.println("Digite o número referente ao tipo do apartamento: \n1.Simples \n2.Duplo");
        apto = input.nextDouble();

        if (dias < 10 && apto == 1) {
            valor = dias * 100;
        } else if (dias <= 15 && apto == 1) {
            valor = dias * 90;
        } else if (dias > 15 && apto == 1) {
            valor = dias * 80;
        } else if (dias < 10 && apto == 2) {
            valor = dias * 140;
        } else if (dias <= 15 && apto == 2) {
            valor = dias * 120;
        } else {
            valor = dias * 100;
        }

        System.out.println("O valor a ser pago é: R$" + valor);
    }
}
