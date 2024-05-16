// Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

package exercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		primeiroNumero = leitor.nextInt();
		System.out.println("Informe o segundo número: ");
		segundoNumero = leitor.nextInt();
		leitor.close();
		System.out.println("A soma dos dois números é: " + (primeiroNumero + segundoNumero));

	}

}
