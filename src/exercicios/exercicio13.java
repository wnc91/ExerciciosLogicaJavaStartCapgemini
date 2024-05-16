//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
package exercicios;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um número: ");
		numero = leitor.nextInt();
		leitor.close();
		if (numero > 10) System.out.println("O número é maior do que 10!");
	}
}
