package code.task;

import code.classes.Carrinho;
import code.entidade.Cliente;
import code.entidade.Produto;

public class Teste {
	
	public static void criarCliente() {
		
		Carrinho carrinho = new Carrinho(10);
		
		carrinho.inserirProdutosCarrinho(new Produto("Nescau Branco", "Achocolatado de Baunilha em pó", 1, 10.99));
		carrinho.inserirProdutosCarrinho(new Produto("Café 3 corações", "Café em pó", 1, 19.99));
		carrinho.inserirProdutosCarrinho(new Produto("Kelloggs Corn flakes", "Cereal de milho", 1, 29.99));
		carrinho.inserirProdutosCarrinho(new Produto("Aveia em Flocos Quaker", "Aveia", 3, 8.99));
		carrinho.inserirProdutosCarrinho(new Produto("Leite Condensado Moça", "Leite condensado", 3, 8.90));
		carrinho.inserirProdutosCarrinho(new Produto("Energético Red Bull Energy Drink", "Bebida Energética", 24, 29.73));
		carrinho.inserirProdutosCarrinho(new Produto("Fermento em Pó Droetker", "Fermento", 1, 2.99));
		carrinho.inserirProdutosCarrinho(new Produto("Macarrão Penne Rigate Grano Duro Barilla", "Macarrão", 1, 15.99));
		carrinho.inserirProdutosCarrinho(new Produto("Castanha do Pará", "Castanha do Pará", 1, 22.25));
		carrinho.inserirProdutosCarrinho(new Produto("Castanha de Cajú", "Castanha de Cajú", 1, 23.90));
		
		Cliente cliente = new Cliente("Gabriel", carrinho);
		cliente.getCarrinho().imprimirCarrinho();
		cliente.getCarrinho().removerProdutoEspecificoCarrinho("Fermento em Pó Droetker");
		cliente.getCarrinho().LimparCarrinho(10);
		cliente.getCarrinho().imprimirCarrinho();
		cliente.getCarrinho().CarrinhoVazio();
	}
}
