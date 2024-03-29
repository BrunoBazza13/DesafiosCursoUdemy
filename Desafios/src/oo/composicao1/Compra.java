package oo.composicao1;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	void adicionarItem(Produto produto, int quantdade) {
		this.itens.add(new Item(produto, quantdade)); 

	}

	void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	
	double obterValorTotal() {

		double total = 0;

		for (Item item : itens) {

			total += item.quantidade * item.produto.preco;

		}

		return total;
	}

}
