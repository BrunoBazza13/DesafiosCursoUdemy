package oo.composicao1;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Bruno bazza");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("computador", 1000.00, 2);
		compra1.adicionarItem(new Produto("Caderno", 10), 2); 
		
		cliente.adicionarCompra(compra1);
		
		System.out.println(cliente.obterValorTotal());
		
	}
	
}
