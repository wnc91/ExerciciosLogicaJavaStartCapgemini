/* Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.Considere fixo o juros
 * da poupança em 0,07% a. m; */

package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float deposito;

		System.out.println("Informe o valor do depósito: ");
		deposito = leitor.nextFloat();
		System.out.println("O valor com rendimento é de: " + (deposito + (deposito * 0.07)));
		leitor.close();
	}
}
