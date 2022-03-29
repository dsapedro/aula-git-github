import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int nota1, nota2, media;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextInt();

		media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}

	}

}
