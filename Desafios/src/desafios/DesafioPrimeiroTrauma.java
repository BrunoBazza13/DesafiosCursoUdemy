package desafios;

public class DesafioPrimeiroTrauma {

	static int a = 3;// membro de classe pode acessar outro membro de classe 
	int b = 4;// membro de instancia
	
	public static void main(String[] args) {// membro de classe pois é static 
		
		DesafioPrimeiroTrauma pT = new DesafioPrimeiroTrauma();// Por conta do valor nao ser static e estar fora da main precisa instanciar 
														       // para ter acesso ao valor
		System.out.println(pT.b); 
		
		System.out.println(a);
		
		
	}
	
	
	
	
}
