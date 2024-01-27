package desafios;

import java.util.Scanner;

public class DesafioModulo3Janatar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		DesafioModulo3Pessoa pessoa = new DesafioModulo3Pessoa("Bruno", 70.00);
		
		
		
		DesafioModdulo3Comida comida = new DesafioModdulo3Comida("Feijoada", 0.500);
		
		pessoa.comer(comida); 
		
		System.out.printf("%s pesava: %.2f", pessoa.nome, pessoa.peso);
		
		System.out.printf("\n Depois de comer %s ficou pesando: %.2f", comida.nome, pessoa.peso);
	}
	
}
