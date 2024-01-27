package desafios;

import java.util.Scanner;

public class DesafioIfElseIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana");
		String nomeSemana = entrada.next();

		if ("Domingo".equalsIgnoreCase(nomeSemana)) {
			System.out.println("1");

		} else if ("segunda".equalsIgnoreCase(nomeSemana)) {
			System.out.println("2");

		} else if ("terça".equalsIgnoreCase(nomeSemana)) {
			System.out.println("3");

		} else if ("quarta".equalsIgnoreCase(nomeSemana)) {
			System.out.println("4");

		} else if ("quinta".equalsIgnoreCase(nomeSemana)) {
			System.out.println("5");

		} else if ("sexata".equalsIgnoreCase(nomeSemana)) {
			System.out.println("6");

		} else if ("sabado".equalsIgnoreCase(nomeSemana)) {

		} else {
			System.out.println("Dia invalido");
		}

		

	}

}
