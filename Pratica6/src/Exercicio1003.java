import java.util.Scanner;

public class Exercicio1003 {

	public static void main(String[] args) {
		double raio, comprimento, area, volume;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o valor do raio: ");
			raio = input.nextDouble();

			comprimento = 2 * Math.PI * raio;
			area = Math.PI * Math.pow(raio, 2);
			volume = Math.PI * Math.pow(raio, 3) * 3 / 4;

			System.out.println("O comprimento da esfera �: " + comprimento);
			System.out.println("A �rea da esfera �: " + area);
			System.out.println("O volume da esfera �: " + volume);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}
}
