import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int numero, maior = 0, menor = 0;

		Scanner input = new Scanner(System.in);

		for (double i = 0; i != -1;) {
			System.out.println("Digite um número: \nDigite -1 para encerrar.");
			numero = input.nextInt();
			if (numero == -1) {
				i = numero;
			} else if (maior == 0 && menor == 0) {
				maior = numero;
				menor = numero;
			} else if (numero < menor) {
				menor = numero;
			} else if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
	}

}
