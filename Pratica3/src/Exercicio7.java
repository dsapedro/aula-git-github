import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
	double salarioMinimo, salarioFuncionario, quantidade;
	
	Scanner input = new Scanner(System.in);

	System.out.println("Digite o valor do sal�rio M�nimo: ");
	salarioMinimo = input.nextDouble();
	
	System.out.println("Digite o valor do sal�rio do Funcion�rio: ");
	salarioFuncionario = input.nextDouble();
	
	quantidade = salarioFuncionario / salarioMinimo;
	System.out.println("Este funcion�rio recebe "+quantidade+" sal�rios m�nimos.");
	
	}

}
