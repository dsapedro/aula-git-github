import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double lado1, lado2, lado3;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor do primeiro lado: ");
		lado1 = input.nextDouble();
		System.out.println("Digite o valor do segundo lado: ");
		lado2 = input.nextDouble();
		System.out.println("Digite o valor do terceiro lado: ");
		lado3 = input.nextDouble();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero.");
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("Triângulo Isóceles.");
		} else {
			System.out.println("Triângulo Escaleno.");
		}

	}

}
