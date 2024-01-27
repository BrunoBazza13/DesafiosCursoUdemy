package desafios;

import java.util.Scanner;


public class DesafioArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja informar");
		int tamanho = entrada.nextInt();
		
		double notas[] = new double[tamanho];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a %d° nota: ", (i + 1), notas[i]);
			 notas[i] = entrada.nextDouble();
		}
		
		double totalNotas = 0;
		for(double nota: notas) {
			totalNotas += nota;
			
		}
		System.out.println(totalNotas / notas.length);
		entrada.close();
	}
	
}
