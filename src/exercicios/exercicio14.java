//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
package exercicios;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Informe o primeiro número: ");
		numero1 = leitor.nextInt();
		System.out.println("Informe o segundo número: ");
		numero2 = leitor.nextInt();
		leitor.close();
		if (numero1 < numero2) {
			System.out.println("O número " + numero2 + " é maior que o número " + numero1);
		} else if (numero1 == numero2) {
			System.out.println("Os números são iguais, por favor, informe números distintos.");
		} else {
			System.out.println("O número " + numero1 + " é maior que o número " + numero2);
		}
	}
}
