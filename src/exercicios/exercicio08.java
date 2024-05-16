/* Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
 * deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário; */
package exercicios;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float dolar;
		float cotacao;
		
		System.out.println("Informe o valor em dólares: ");
		dolar = leitor.nextFloat();
		System.out.println("Informe o valor da cotação: ");
		cotacao = leitor.nextFloat();
		System.out.println("O valor convertido em Reais é: " + (dolar * cotacao));
		leitor.close();
	}

}
