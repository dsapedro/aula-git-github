import java.util.Scanner;

public class Exercicio0403 {

	public static void main(String[] args) {
		double salario, novoSalario;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o sal�rio do funcion�rio: ");
			salario = input.nextDouble();

			novoSalario = salario * 1.25;
			System.out.println("O novo sal�rio �: " + novoSalario);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));
	}
}
