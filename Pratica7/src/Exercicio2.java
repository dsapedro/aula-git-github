import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n1 = input.nextInt();
		System.out.print("Digite um número: ");
		n2 = input.nextInt();
		for (int i = n1; i <= n2; i++)
			System.out.println(i);
	}
}
