/* Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de
 * homens e de mulheres; */
package exercicios;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		char sexo;
		int mulher = 0;
		int homem = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome da pessoa: ");
			nome = leitor.nextLine();
			System.out.println("Informe o sexo da pessoa (H - Homem  /  M - Mulher) : ");
			sexo = leitor.nextLine().charAt(0);
			if (sexo == 'h' || sexo == 'H') {
				System.out.println(nome + " é um HOMEM!");
				homem++;
			} else {
				System.out.println(nome + " é uma MULHER!");
				mulher++;
			}
		}
		leitor.close();
		System.out.println("Total de homens: " + homem);
		System.out.println("Total de mulheres: " + mulher);
	}
}
