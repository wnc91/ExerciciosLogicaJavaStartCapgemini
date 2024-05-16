/* O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados
 * (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo
 * que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e
 * informe o custo ao consumidor do mesmo; */
package exercicios;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double custo;
		
		System.out.println("Informe o valor de custo de fábrica do carro: ");
		custo = leitor.nextFloat();
		leitor.close();
		custo = custo + (custo * 0.45);
		custo = custo + (custo * 0.28);
		System.out.println("O custo ao consumidor será de: R$" + custo);
	}
}
