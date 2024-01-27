package oo.encapsulamento;

public class Pessoa {

	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {

		if (idade >= 0 && idade <= 1000)
			this.idade = idade;
	}

		
	
}
