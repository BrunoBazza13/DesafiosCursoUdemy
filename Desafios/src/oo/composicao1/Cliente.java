package oo.composicao1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	
	Compra adicionarCompra(Compra compra) {
		
		this.compras.add(compra);
		return compra;
		
	}
	
	
	double obterValorTotal() {
		
		double total = 0;
		
		for(Compra compra: compras) {
			
			total += compra.obterValorTotal();
			
		}
		
		return total;
	}
	
}
