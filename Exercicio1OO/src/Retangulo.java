
public class Retangulo {
	private float altura, largura;
	/**
	 * Construtora da Classe. */
	public Retangulo() {

		altura = 0;
		largura = 0;

	}
	/** M�todo de acesso que retorna altura. */
	public float getAltura() {
		return (altura);

	}
	/** M�todo de acesso que atribui altura. */
	public void setAltura(float alt) {

		altura = alt;

	}
	/** M�todo de acesso que retorna a Largura. */
	public float getLargura() {
		return (largura);

	}
	/** M�todo acessor que atribui a Largura. */
	public void setLargura(float larg) {

		largura = larg;

	}
	/** M�todo que calcula a �rea. */
	public float calculaArea() {

		return altura * largura;

	}
	/** M�todo que calcula o perimetro. */
	public float calculaPerimetro() {

		return 2 * altura + 2 * largura;

	}
	/** M�todo que exibe os dados do ret�ngulo. */
	public void exibe() {
		System.out.println("A altura �: "+ getAltura()+
				"\nA Largura �: "+ getLargura()+
				"\nA �rea �: "+calculaArea()+
				"\nO Per�metro: "+calculaPerimetro());
		
	}
}
