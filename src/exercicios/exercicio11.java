/* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um
 * acréscimo de acordo com um percentual informado pelo usuário; */
package exercicios;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float preco;
		float acrescimo;
		
		System.out.println("Informe o valor de custo do produto: ");
		preco = leitor.nextFloat();
		System.out.println("Informe o percentual de acréscimo: ");
		acrescimo = leitor.nextFloat();
		if (acrescimo < 0) System.out.println("Percentual de acréscimo inválido.");
		else System.out.println("O valor de venda do produto será de: R$" + (preco + (preco * (acrescimo / 100))));
		leitor.close();
	}
}
