import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		double vo, t, vt, ht, g = 0;
		int planeta;
		Scanner input = new Scanner(System.in);

		System.out.println("Indique o número do planeta desejado: 1.Mercúrio, 2.Vênus, "
				+ "3.Terra, 4.Marte, 5.Júpter, 6.Saturno, 7.Urano, 8.Netuno ou 9.Plutão.");
		planeta = input.nextInt();
		System.out.println("Indique a velocidade desejada: ");
		vo = input.nextDouble();
		System.out.println("Indique o instante desejado: ");
		t = input.nextDouble();

		if (planeta == 1) {
			g = 3.7;
		} else if (planeta == 2) {
			g = 8.8;
		} else if (planeta == 3) {
			g = 9.8;
		} else if (planeta == 4) {
			g = 3.8;
		} else if (planeta == 5) {
			g = 26.4;
		} else if (planeta == 6) {
			g = 11.5;
		} else if (planeta == 7) {
			g = 9.3;
		} else if (planeta == 8) {
			g = 12.2;
		} else if (planeta == 9) {
			g = 0.6;
		}

		vt = vo - (g * t);
		ht = (vo * t) - ((g * t * t) / 2);

		System.out.println("A velocidade é: " + vt + "A altura é: " + ht);

	}

}
