import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		double valor, fatorial = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor a ser calculado: ");
		valor = input.nextDouble();

		if (valor > 0) {
			for (int i = 0; i < valor; i++) {
				fatorial = fatorial * (valor - i);
			}
		} else if (valor == 0) {
			System.out.println("O fatorial de 0! é = 1");
		} else {
			System.out.println("Valor inválido.");
		}
		System.out.println("O fatorial de " + valor + "! é igual a: " + fatorial);
	}

}
