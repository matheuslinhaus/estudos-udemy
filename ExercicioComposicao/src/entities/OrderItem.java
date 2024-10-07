package entities;

public class OrderItem {
	
	private Integer quantidade;
	private Double preco;
	private Product produto;
	
	
	public OrderItem() {
	}

	public OrderItem(Integer quantidade, Double preco, Product produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}	
	
	public Double subTotal() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto.getNome() + ", $" + produto.getPreco() + ", Quantidade: " + quantidade + ", Subtotal: $" + subTotal() + "\n");
		return sb.toString();
	}
}