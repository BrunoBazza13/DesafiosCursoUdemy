package oo.abstrato;

public abstract class Animal {

	
	public String respirar() {
		return "Usando oxigenio";
		
	}

	public abstract String mover();  // metodo que pode ser herdado e sobreescrito por classes filhas 
	
	
	
}
