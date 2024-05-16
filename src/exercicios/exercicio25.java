/* Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem
 * dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes; */
package exercicios;

import java.util.Scanner;

public class exercicio25 {

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
			System.out.println("O número " + numero2 + " é maior que o número " + numero1 + " , os números são diferentes!");
		} else if (numero1 == numero2) {
			System.out.println("Os números são iguais!");
		} else {
			System.out.println("O número " + numero1 + " é maior que o número " + numero2 + " , os números são diferentes!");
		}

	}

}
