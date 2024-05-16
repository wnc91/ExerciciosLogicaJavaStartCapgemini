/* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome
 * do aluno e a sua média (aritmética); */
package exercicios;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		String nome;
		float nota1;
		float nota2;
		float nota3;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o nome do aluno: ");
		nome = leitor.nextLine();
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = leitor.nextFloat();
		System.out.println("Informe a segunda nota do aluno: ");
		nota2 = leitor.nextFloat();
		System.out.println("Informe a terceira nota do aluno: ");
		nota3 = leitor.nextFloat();
		leitor.close();
		System.out.println("O nome do aluno é: " + nome);
		System.out.println("Sua média é: " + ((nota1 + nota2 + nota3) / 3));
	}

}
