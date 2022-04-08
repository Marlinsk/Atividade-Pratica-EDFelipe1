package code.entidade;

import code.classes.Carrinho;

public class Cliente {
	
	private String nome;
    private Carrinho carrinho;
	
    public Cliente(String nome, Carrinho carrinho) {
		super();
		this.nome = nome;
		this.carrinho = carrinho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
}
