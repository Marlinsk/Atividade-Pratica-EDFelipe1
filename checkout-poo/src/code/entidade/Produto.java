package code.entidade;

public class Produto {
	
	String nome;
	String descricao;
	int quantidadeProduto;
	double precoUnitario;
	
	public Produto(String nome, String descricao, int quantidade, double precoUnitario) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadeProduto = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return nome + " [" + "descrição do produto= " + descricao + ", quantidade do produto= " + quantidadeProduto
				+ ", preço unitário= " + precoUnitario + "]";
	}
}
