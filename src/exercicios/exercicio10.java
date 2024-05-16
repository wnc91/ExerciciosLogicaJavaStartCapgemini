/* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um algoritmo que receba um valor de
 * uma compra e mostre o valor das prestações;
 */
package exercicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float compra;
		
		System.out.println("Informe o valor da compra: ");
		compra = leitor.nextFloat();
		if(compra <= 0) System.out.println("O valor informado é inválido.");
		else System.out.println("O valor das parcelas será de: R$" + (compra / 5));
		leitor.close();
	}
}
