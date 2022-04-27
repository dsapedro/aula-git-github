
public class ContaCorrente {
	private int conta, agencia;
	private double saldo;

	public ContaCorrente() {
		conta = 0;
		agencia = 0;
		saldo = 0;
	}

	public void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Valor inválido para saque.");
		} else {
			saldo = saldo - valor;
		}
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return (saldo);
	}

	public float getConta() {
		return (conta);
	}

	public void setConta(int setconta) {
		conta = setconta;
	}

	public float getAgencia() {
		return (agencia);
	}

	public void setAgencia(int setagencia) {
		conta = setagencia;
	}

	public void exibe() {
		System.out.println("Conta : " + getConta() + "\nAgência: " + getAgencia() + "\nSaldo: " + saldo);
	}
}
