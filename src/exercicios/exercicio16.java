/* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética),
 * informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9); */
package exercicios;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		float nota;

		System.out.println("Informe o nome do aluno: ");
		nome = leitor.nextLine();
		System.out.println("Informe a primeira nota do aluno: ");
		nota = leitor.nextFloat();
		System.out.println("Informe a segunda nota do aluno: ");
		nota += leitor.nextFloat();
		System.out.println("Informe a terceira nota do aluno: ");
		nota += leitor.nextFloat();
		leitor.close();
		nota = nota / 3;
		if (nota >= 7)
			System.out.println("O aluno " + nome + " está APROVADO!");
		else if (nota <= 5)
			System.out.println("O aluno " + nome + " está REPROVADO!");
		else
			System.out.println("O aluno " + nome + " está em RECUPERAÇÃO!");
	}
}
