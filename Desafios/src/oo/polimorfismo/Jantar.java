package oo.polimorfismo;

public class Jantar {

	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingredente1 = new Arroz(0.2);
		
		Feijao ingrediente2 =  new Feijao(0.1);
		
		Comida ingrediente3 =  new Comida(0.1);
		
		convidado.comer(ingredente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		
		System.out.println(convidado.getPeso());
		
		
	}
	
	
}
