import java.util.Scanner;

public class Exercicio0503 {

	public static void main(String[] args) {
		double diagonalMaior, diagonalMenor, area;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o valor da diagonal maior do losango: ");
			diagonalMaior = input.nextDouble();

			System.out.println("Digite o valor da diagonal menor do losango: ");
			diagonalMenor = input.nextDouble();

			area = diagonalMaior * diagonalMenor / 2;
			System.out.println("�rea do losango: " + area);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}
}
