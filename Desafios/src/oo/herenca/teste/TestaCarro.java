package oo.herenca.teste;

import oo.herenca.Carro;
import oo.herenca.Civic;
import oo.herenca.Ferrari;

public class TestaCarro  {

	public static void main(String[] args) {
		
		
		Ferrari ferrari = new Ferrari(300);
	
		//ferrari.ligarTurbo();	
		ferrari.desligarAr();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari);
		
		
		
		Carro civic = new Civic(200);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		
		
	}
	
	
}
