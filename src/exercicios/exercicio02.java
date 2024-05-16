/*Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação
 e a divisão dos dois números lidos;*/
package exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		float primeiroNumero;
		float segundoNumero;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		primeiroNumero = leitor.nextFloat();
		System.out.println("Informe o segundo número: ");
		segundoNumero = leitor.nextFloat();
		leitor.close();
		System.out.println("A soma dos dois números é: " + (primeiroNumero + segundoNumero));
		System.out.println("A subtração dos dois números é: " + (primeiroNumero - segundoNumero));
		System.out.println("A multiplicação dos dois números é: " + (primeiroNumero * segundoNumero));
		if (primeiroNumero == 0 || segundoNumero == 0) {
			System.out.println("Não é possível realizar divisão pelo algarismo 0.");
		} else {
			System.out.println("A divisão dos dois números é: " + (primeiroNumero / segundoNumero));
		}
	}
}
