import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	double cotacao, valorEmDolar, valorEmReais;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite a cota��o do d�lar em reais: ");
	cotacao = input.nextDouble();
	
	System.out.println("Digite quanto possui em d�lar: ");
	valorEmDolar = input.nextDouble();
	
	valorEmReais = cotacao * valorEmDolar;
	System.out.println("A convers�o para reais � igual a: "+ valorEmReais);
	
	}

}
