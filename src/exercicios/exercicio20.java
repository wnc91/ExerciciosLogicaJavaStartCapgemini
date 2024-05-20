/* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba
 * o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do
 * veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a
 * resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral; */
package exercicios;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		char continuar = 's';
		int anoVeiculo, total2000 = 0, totalGeral = 0;
		float precoVeiculo;
		float desconto;

		while (continuar == 's' || continuar == 'S') {
			System.out.println("Informe o ano do veículo: ");
			anoVeiculo = Integer.parseInt(leitor.next());
			System.out.println("Informe o preço do veículo: ");
			precoVeiculo = leitor.nextFloat();
			leitor.nextLine();
			if (anoVeiculo <= 2000) {
				desconto = precoVeiculo * 0.12f;
				totalGeral++;
				total2000++;
			} else {
				desconto = precoVeiculo * 0.07f;
				totalGeral++;
			}
			System.out.println("O valor do desconto é: " + desconto);
			System.out.println("Valor a ser pago pelo cliente: " + (precoVeiculo - desconto));
			System.out.println("Deseja continuar a consultar? (S - Sim  / N - Não)");
			continuar = leitor.nextLine().charAt(0);
		}
		leitor.close();
		System.out.println("Total de carros até 2000 consultados: " + total2000);
		System.out.println("Total geral de carros consultados: " + totalGeral);
	}
}