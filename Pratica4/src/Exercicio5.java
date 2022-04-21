import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		double x;

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor de x: ");
		x = input.nextDouble();
		if (x < -2) {
			System.out.println("Resultado: " + (2 * x + 2));
		} else if (x >= -2 && x < 3) {
			System.out.println("Resultado: 3");
		} else {
			System.out.println("Resultado: " + (-x));
		}

	}

}
