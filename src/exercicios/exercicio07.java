/* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:F=(9*C+160) / 5,
 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;  */
package exercicios;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float c;
		
		System.out.println("Informe a temperatura em Celsius: ");
		c = leitor.nextFloat();
		leitor.close();
		System.out.println("A temperatura em Fahrnheit é: " + ((9*c+160) / 5));
	}
}
