import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int codigo;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o c�digo do item:");
		codigo = input.nextInt();

		if (codigo == 1) {
			System.out.println("Sapato: R$99,99");
		} else if (codigo == 2) {
			System.out.println("Bolsa: R$103,89");
		} else if (codigo == 3) {
			System.out.println("Camisa: R$49,98");
		} else if (codigo == 4) {
			System.out.println("Cal�a: R$89,72");
		} else if (codigo == 5) {
			System.out.println("Blusa: R$97,35");
		}
	}

}
