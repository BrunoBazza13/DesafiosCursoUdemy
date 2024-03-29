package oo.herenca;

import oo.herenca.teste.Esportivo;
import oo.herenca.teste.Luxo;

public class Ferrari extends Carro implements Esportivo, Luxo {

	boolean ligarTurbo;
	 boolean ligarAr;
	
	
	 public Ferrari() {
		this(340);
	}
	
	 public Ferrari(int velocidadeMaxima) {
			super(velocidadeMaxima);
			setDelta(15);
		}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;	
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
		
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
		
	}
		
	@Override
	public double getDelta() {

		if(ligarTurbo && !ligarAr) {
			return 35;
			
		}else if(ligarTurbo && ligarAr) {
			return 30;
			
		}else if(!ligarTurbo && !ligarAr){
			return 20;
			
		}else {
			return 15;
			
		}
		
	}
	
	
	
//	void acelerar() {
//		
//		this.velocidadeAtual += 15;
//		
//	}
	
	
	
	
}
