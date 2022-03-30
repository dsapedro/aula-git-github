import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int peso, altura, imc;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o peso: ");
		peso = input.nextInt();
		System.out.println("Digite o altura: ");
		altura = input.nextInt();

		imc = peso / (altura * altura);

		if (imc < 20) {
			System.out.println("Abaixo do peso");
		} else if (imc <= 20 && imc < 25) {
			System.out.println("Normal");
		} else if (imc <= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		} else if (imc <= 30 && imc < 40) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade M�rbida");
		}
	}

}
