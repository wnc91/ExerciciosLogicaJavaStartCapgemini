/* Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir
 * o serviço militar obrigatório. Informe os totais; */
package exercicios;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		char continuar = 's';
		String nome;
		char sexo;
		int idade;
		char saude;
		int aptos = 0, inaptos = 0;

		while (continuar == 's' || continuar == 'S') {
			System.out.println("Informe o nome: ");
			nome = leitor.nextLine();
			System.out.println("Informe o sexo: (H - Homem  /  M - Mulher)");
			sexo = leitor.nextLine().charAt(0);
			System.out.println("Informe a idade: ");
			idade = leitor.nextInt();
			leitor.nextLine();
			System.out.println("Informe a condição de saúde: (B - Bom  /  R - Ruim)");
			saude = leitor.nextLine().charAt(0);
			if ((sexo == 'H' || sexo == 'h') && (idade >= 18) && (saude == 'b' || saude == 'B')) {
				System.out.println(nome + " está APTO para o serviço militar obrigatório!");
				aptos++;
			} else {
				System.out.println(nome + " está INAPTO(A) para o serviço militar obrigatório!");
				inaptos++;
			}
			System.out.println("Deseja continuar a consultar? (S - Sim  / N - Não)");
			continuar = leitor.nextLine().charAt(0);
		}
		leitor.close();
		System.out.println("Total consultado:");
		System.out.println("Aptos: " + aptos);
		System.out.println("Inaptos(as): " + inaptos);
	}

}
