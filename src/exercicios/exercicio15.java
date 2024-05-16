//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
package exercicios;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;

		System.out.println("Informe um número: ");
		numero = leitor.nextInt();
		leitor.close();
		if ((numero > 100) && (numero < 200))
			System.out.println("O número está no intervalo entre 100 e 200!");
		else
			System.out.println("O número NÃO está no intervalo entre 100 e 200!");
	}

}
