import java.util.Scanner;

public class Exercicio1 {
	/** M�todo principal */
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a altura do ret�ngulo: ");
		ret.setAltura(input.nextFloat());

		System.out.print("Informe a largura do ret�ngulo: ");
		ret.setLargura(input.nextFloat());

		ret.exibe();
	}

}
