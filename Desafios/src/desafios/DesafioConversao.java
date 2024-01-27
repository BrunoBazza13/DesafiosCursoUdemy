package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double valor1, valor2, valor3, soma, media;
		
		
		System.out.print("Digite o primeiro salario: ");
		String num1 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite o segundo salario: ");
		String num2 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite o terceio salario: ");
		String num3 = entrada.nextLine().replace(",", ".");

		 valor1 = Double.parseDouble(num1);
		 valor2 = Double.parseDouble(num2);
		 valor3 = Double.parseDouble(num3);
		
		 soma = valor1 + valor2 + valor3;
		
		 media = soma / 3;
		
		
		System.out.println("A soma dos salarios é: " + soma);
		System.out.println("A media dos salarios é " +media);
		

	}

}
