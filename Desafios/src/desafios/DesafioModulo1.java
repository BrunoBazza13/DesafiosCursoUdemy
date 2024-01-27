package desafios;

import java.util.Scanner;

public class DesafioModulo1 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o 1° numero  ");
		double num1 = entrada.nextDouble();
		
		

		System.out.println("Digite o 2° numero  ");
		double num2 = entrada.nextDouble();
		
		
		double soma = num1 + num2;
		
		double subtracao = num1 - num2;
		
		double multiplicacao = num1 * num2;
		
		double divisao = num1 / num2;
		
		double modulo = num1 % num2;
		
		System.out.println("Escolha a operação: +, -, /, *");
		String op = entrada.next();
	
		
		double resultado =  "+".equals(op) ? soma : 0;
		resultado =  "-".equals(op) ? subtracao : resultado;
		resultado =  "*".equals(op) ? multiplicacao : resultado;
		resultado =  "/".equals(op) ? divisao : resultado;
		resultado =  "%".equals(op) ? modulo : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		
		
		
	}
	
}
