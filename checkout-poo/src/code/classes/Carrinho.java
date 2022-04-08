package code.classes;

import code.entidade.Produto;

public class Carrinho {
	
	public Produto[] listaProdutos;
	public int primeiroItem = 0;
	public int ultimoItem = 0;
	
	public Carrinho(int quantidade){
        this.primeiroItem = 0;
        this.ultimoItem = this.primeiroItem;
        listaProdutos = new Produto[quantidade];
    }
	
	public void inserirProdutosCarrinho(Produto produto) {
		if (this.ultimoItem >= this.listaProdutos.length) {
			System.out.println("CARRINHO CHEIO....NÃO É POSSÍVEL ADICIONAR MAIS PRODUTO NO CARRINHO.");
		} else {
			this.listaProdutos[this.ultimoItem] = produto;
			this.ultimoItem = this.ultimoItem + 1;
			System.out.println("PRODUTO INSERIDO COM SUCESSO NO CARRINHO!");
		}
	}
	
	public void LimparCarrinho(int quantidade){
        this.primeiroItem = 0;
        this.ultimoItem = 0;
        listaProdutos = new Produto[quantidade];
    }
	
	public void removerProdutoEspecificoCarrinho(String nome) {
		Produto[] aux = null;
        for (int i = 0; i < listaProdutos.length - 1; i++) {
        	if (listaProdutos[i].getNome().equals(nome)) {
        		aux = new Produto[listaProdutos.length - 1];
        		for(int index = 0; index < i; index++) {
        			aux[index] = listaProdutos[index];
        		}
        		for(int j = i; j < listaProdutos.length - 1; j++){
        			aux[j] = listaProdutos[j+1];
                }
        		System.out.println("\nPRODUTO " + "[" + nome + "]" + " EXCLUÍDO COM SUCESSO!");
        		break;
        	}
        }
        
        System.out.println("\nLISTA ATUALIZADA NO CARRINHO: ");
        for(int i = 0; i < aux.length; i++) {
        	System.out.println(aux[i].toString());
        }
	}
	
	public void imprimirCarrinho() {
		System.out.println("\nPRODUTOS LISTADOS NO CARRINHO: ");
		for(int i = 0; i < ultimoItem; i++) {
			System.out.println(listaProdutos[i].toString());
		}
	}
	
	public boolean CarrinhoVazio(){
        return primeiroItem == ultimoItem;
    }
}
