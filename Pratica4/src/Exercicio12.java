package com.mycompany.demo.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double idade, sexo;

        System.out.println("Digite a idade: ");
        idade = input.nextDouble();
        System.out.println("Digite o número referente ao sexo: \n1.Masculino \n2.Feminino");
        sexo = input.nextDouble();

        if (idade <= 15 && sexo == 1) {
            System.out.println("O valor a ser pago é: R$60,00");
        } else if (idade <= 18 && sexo == 1) {
            System.out.println("O valor a ser pago é: R$75,00");
        } else if (idade <= 30 && sexo == 1) {
            System.out.println("O valor a ser pago é: R$90,00");
        } else if (idade <= 40 && sexo == 1) {
            System.out.println("O valor a ser pago é: R$85,00");
        } else if (idade > 40 && sexo == 1) {
            System.out.println("O valor a ser pago é: R$80,00");
        } else if (idade <= 18 && sexo == 2) {
            System.out.println("O valor a ser pago é: R$60,000");
        } else if (idade <= 25 && sexo == 2) {
            System.out.println("O valor a ser pago é: R$90,00");
        } else if (idade <= 40 && sexo == 2) {
            System.out.println("O valor a ser pago é: R$85,00");
        } else {
            System.out.println("O valor a ser pago é: R$80,00");
        }
    }
}
