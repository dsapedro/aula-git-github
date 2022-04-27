import java.util.Scanner;

public class Exercicio1 {
	/** Método principal */
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a altura do retângulo: ");
		ret.setAltura(input.nextFloat());

		System.out.print("Informe a largura do retângulo: ");
		ret.setLargura(input.nextFloat());

		ret.exibe();
	}

}
