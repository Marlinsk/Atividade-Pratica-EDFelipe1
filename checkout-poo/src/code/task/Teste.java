package code.task;

import code.classes.Carrinho;
import code.entidade.Cliente;
import code.entidade.Produto;

public class Teste {
	
	public static void criarCliente() {
		
		Carrinho carrinho = new Carrinho(10);
		
		carrinho.inserirProdutosCarrinho(new Produto("Nescau Branco", "Achocolatado de Baunilha em p�", 1, 10.99));
		carrinho.inserirProdutosCarrinho(new Produto("Caf� 3 cora��es", "Caf� em p�", 1, 19.99));
		carrinho.inserirProdutosCarrinho(new Produto("Kelloggs Corn flakes", "Cereal de milho", 1, 29.99));
		carrinho.inserirProdutosCarrinho(new Produto("Aveia em Flocos Quaker", "Aveia", 3, 8.99));
		carrinho.inserirProdutosCarrinho(new Produto("Leite Condensado Mo�a", "Leite condensado", 3, 8.90));
		carrinho.inserirProdutosCarrinho(new Produto("Energ�tico Red Bull Energy Drink", "Bebida Energ�tica", 24, 29.73));
		carrinho.inserirProdutosCarrinho(new Produto("Fermento em P� Droetker", "Fermento", 1, 2.99));
		carrinho.inserirProdutosCarrinho(new Produto("Macarr�o Penne Rigate Grano Duro Barilla", "Macarr�o", 1, 15.99));
		carrinho.inserirProdutosCarrinho(new Produto("Castanha do Par�", "Castanha do Par�", 1, 22.25));
		carrinho.inserirProdutosCarrinho(new Produto("Castanha de Caj�", "Castanha de Caj�", 1, 23.90));
		
		Cliente cliente = new Cliente("Gabriel", carrinho);
		cliente.getCarrinho().imprimirCarrinho();
		cliente.getCarrinho().removerProdutoEspecificoCarrinho("Fermento em P� Droetker");
		cliente.getCarrinho().LimparCarrinho(10);
		cliente.getCarrinho().imprimirCarrinho();
		cliente.getCarrinho().CarrinhoVazio();
	}
}
