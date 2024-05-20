//. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);
package exercicios;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float numero;
		int dentroIntervalo = 0;
		int foraIntervalo = 0;

		for (int i = 0; i < 80; i++) {
			System.out.println("Informe um número: ");
			numero = leitor.nextFloat();
			if (numero >= 10 && numero <= 150)
				dentroIntervalo++;
			else
				foraIntervalo++;
		}
		leitor.close();
		System.out.println("Números informados DENTRO do intervalo de 10 à 150: " + dentroIntervalo);
		System.out.println("Números informados FORA do intervalo de 10 à 150: " + foraIntervalo);
	}
}