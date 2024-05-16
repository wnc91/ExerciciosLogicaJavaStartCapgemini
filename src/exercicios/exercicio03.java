/* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto;*/
package exercicios;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		float distancia;
		float combustivel;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a distância percorrida em quilômetros: ");
		distancia = leitor.nextFloat();
		System.out.println("Informe a quantidade de combustível gasto em litros: ");
		combustivel = leitor.nextFloat();
		leitor.close();
		if (distancia <= 0 || combustivel <= 0) {
			System.out.println("Informação insuficiente, algum dos dados informados tem valor nulo ou negativo.");
		} else {
			System.out.println("O consumo médio de combustível é de " + (distancia / combustivel)
					+ " quilômetros por litro de combustível.");
		}
	}
}
