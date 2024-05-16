/* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir ovalor da
 * variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados;  */
package exercicios;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float a;
		float b;
		
		System.out.println("Informa o valor de A: ");
		a = leitor.nextFloat();
		System.out.println("Informa o valor de B: ");
		b = leitor.nextFloat();
		leitor.close();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("O valor de A agora é: " + a);
		System.out.println("O valor de B agora é: " + b);
	}

}
