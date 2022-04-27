import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		ContaCorrente minhaConta = new ContaCorrente();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o número da conta: ");
		minhaConta.setConta(input.nextInt());
		
		System.out.print("Informe o número da agência: ");
		minhaConta.setAgencia(input.nextInt());
		
		System.out.print("Informe o valor para deposito: ");
		minhaConta.depositar(input.nextDouble());
		
		System.out.print("Informe o valor para saque: ");
		minhaConta.sacar(input.nextDouble());
		
		minhaConta.exibe();

	}

}
