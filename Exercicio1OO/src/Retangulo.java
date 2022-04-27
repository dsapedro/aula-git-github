
public class Retangulo {
	private float altura, largura;
	/**
	 * Construtora da Classe. */
	public Retangulo() {

		altura = 0;
		largura = 0;

	}
	/** Método de acesso que retorna altura. */
	public float getAltura() {
		return (altura);

	}
	/** Método de acesso que atribui altura. */
	public void setAltura(float alt) {

		altura = alt;

	}
	/** Método de acesso que retorna a Largura. */
	public float getLargura() {
		return (largura);

	}
	/** Método acessor que atribui a Largura. */
	public void setLargura(float larg) {

		largura = larg;

	}
	/** Método que calcula a área. */
	public float calculaArea() {

		return altura * largura;

	}
	/** Método que calcula o perimetro. */
	public float calculaPerimetro() {

		return 2 * altura + 2 * largura;

	}
	/** Método que exibe os dados do retângulo. */
	public void exibe() {
		System.out.println("A altura é: "+ getAltura()+
				"\nA Largura é: "+ getLargura()+
				"\nA Área é: "+calculaArea()+
				"\nO Perímetro: "+calculaPerimetro());
		
	}
}
