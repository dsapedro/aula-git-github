import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextInt();

		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 0 && media < 3) {
			System.out.println("REPROVADO");
		} else if (media >= 7 && media <= 10) {
			System.out.println("APROVADO");
		} else {
			System.out.println("EXAME");
		}

	}

}
