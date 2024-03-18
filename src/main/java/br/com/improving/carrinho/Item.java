package br.com.improving.carrinho;

import br.com.improving.carrinho.exceptions.ValorInvalidoException;

import java.math.BigDecimal;

/**
 * Classe que representa um item no carrinho de compras.
 */
public class Item {

    private Produto produto;
    private BigDecimal valorUnitario;
    private int quantidade;

    /**
     * Construtor da classe Item.
     * 
     * @param produto
     * @param valorUnitario
     * @param quantidade
     */
    public Item(Produto produto, BigDecimal valorUnitario, int quantidade) {
		this.produto = produto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
    }

    /**
     * Retorna o produto.
     *
     * @return Produto
     */
    public Produto getProduto() {
		return this.produto;
    }

    /**
     * Retorna o valor unitário do item.
     *
     * @return BigDecimal
     */
    public BigDecimal getValorUnitario() {
    	return this.valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		if (valorUnitario.compareTo(BigDecimal.ZERO) <= 0) {
			throw new RuntimeException("Valores negativos não são permitidos");
		}
		this.valorUnitario = valorUnitario;

	}
    /**
     * Retorna a quantidade dos item.
     *
     * @return int
     */
    public int getQuantidade() {
		return this.quantidade;
    }

	public void setQuantidade(int quantidade) {
	  if (quantidade < 0) {
		  throw new ValorInvalidoException("A quantidade não pode ser negativa");
	  }
	  this.quantidade = quantidade;
	}
    /**
     * Retorna o valor total do item.
     *
     * @return BigDecimal
     */
    public BigDecimal getValorTotal() {
		return getValorUnitario().multiply(new BigDecimal(getQuantidade()));
    }


	@Override
	public String toString() {
		return "{" +
				"produto: {Código produto: " + produto.getCodigo() + ", Descrição Produto: " + produto.getDescricao() + "}, " +
				" valorUnitario: " + valorUnitario +
				", ValorTotal: R$ " + getValorTotal() +
				", quantidade: " + quantidade +
				"}\n";
	}


}
