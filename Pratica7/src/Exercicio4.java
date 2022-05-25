import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int contador = 0;
		double idade = 0, soma = 0, media;

		Scanner input = new Scanner(System.in);

		for (double i = 0; i != -1;) {
			System.out.println("Digite uma idade: \nDigite -1 para encerrar.");
			idade = input.nextDouble();
			if (idade == -1) {
				i = idade;
			} else {
				soma = idade + soma;
				contador++;
			}

		}
		media = soma / contador;
		System.out.println("A média das idades é: " + media);
	}

}
