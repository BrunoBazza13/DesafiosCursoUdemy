package desafios;

public class DesafioLogico {

	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean deuCerto = trabalho1 && trabalho2;
		boolean deuBom = !trabalho1 || trabalho2;
		boolean deuRuim = trabalho1 ^ trabalho2;
		
		
		System.out.println("Familia vai ao shopping comprar a tv de 50p " + deuCerto);
		
		System.out.println("Familia vai ao shopping comprar a tv de 32p " + deuBom);
		
		
		
	}
}
