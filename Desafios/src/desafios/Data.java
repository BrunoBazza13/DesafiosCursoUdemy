package desafios;

public class Data {

	int dia;
	int mes;
	int ano;

	
	Data(){
		
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//this tbm serve como metodo assim chamando o construtor apartir de outro construtor
		
	}
	
	
	Data(int dia, int mes, int ano){
		
		// this serve para referenciar um atributo externo fora do metodo // e serve para referenciar um  obj atual
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	
	String obterDataForatada() {

		String dataFormatada = String.format("%d/%d/%d", dia, mes, ano); // este metodo tem flexibiidade em diversas operações

		return dataFormatada;

	}

	void imprimeDataFormatada() {
		
		System.out.printf("%d/%d/%d", dia, mes, ano);  // este metodo eesta amarrado a imprimir o resultado no terminal do sistema
		
	}
	
	
	
}
