import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	double salario, novoSalario;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o sal�rio do funcion�rio: ");
	salario = input.nextDouble();
	
	novoSalario = salario * 1.25;
	System.out.println("O novo sal�rio �: "+ novoSalario);

	}

}
