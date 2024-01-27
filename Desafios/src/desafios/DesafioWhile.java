package desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double total = 0;
		int contador = 0;
		double nota = 0;

		System.out.println("Digite a nota do aluno");
		while (nota != -1) {

			nota = entrada.nextDouble();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				contador++;

			} else if (nota != -1) {
				System.out.println("Nota invalida tente novame1nte");

			}

		}

		double media = total / contador;

		System.out.println("quantidas de notas validas: " + contador);
		System.out.println("total das notas: " + total);
		System.out.println("media das notas: " + media);
	}

}
