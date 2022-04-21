package com.mycompany.demo.exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dias,valor;
        
        System.out.println("Digite o número de dias: ");
        dias=input.nextDouble();
        
        if(dias<15){valor=(500*dias)+(15*dias);}
        else if(dias==15){valor=(500*dias)+(10*dias);}
        else{valor=(500*dias)+(5*dias);}
        
        System.out.println("O valor a ser pago é: R$"+valor);
    }
}
