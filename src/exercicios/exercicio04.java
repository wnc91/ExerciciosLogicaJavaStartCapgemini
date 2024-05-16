/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 *  Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no 
 *  final do mês;
 */
package exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		String nome;
		float salario;
		float totalVendas;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o nome do vendedor: ");
		nome = leitor.nextLine();
		System.out.println("Informe o salário fixo do vendedor: ");
		salario = leitor.nextFloat();
		System.out.println("Informe o total de vendas do vendedor: ");
		totalVendas = leitor.nextFloat();
		leitor.close();
		System.out.println("O nome do vendedor é: " + nome);
		System.out.println("Seu salário fixo é: " + salario);
		System.out.println("Seu salário no final do mês é: " + (salario + (totalVendas * 0.15)));

	}

}
