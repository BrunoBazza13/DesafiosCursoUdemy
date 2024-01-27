package oo.herenca;



public class Carro  {

	 double velocidadeAtual;
	 final int VELOCIDADE_MAXIMA;
	private  double delta;
	
	

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima; 

	}

	public void acelerar() {

		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}

	}

	public void frear() {

		if (velocidadeAtual == 0) {
			System.out.println("Carro esta parado não da mais para frear");

		} else {
			velocidadeAtual -= 5;

		}

	}

	public String toString() {

		return "Velocidade atual é " + velocidadeAtual + "Km/h";

	}

}
