package br.com.improving.carrinho;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.improving.carrinho.Item;
import br.com.improving.carrinho.Produto;
import br.com.improving.carrinho.CarrinhoCompras;

public class main {

  public static void main(String[] args) {
	// Criando produtos
	Produto produto1 = new Produto(12546054579L, "Arroz");
	Produto produto2 = new Produto(12546054580L, "Feijão");
	Produto produto3 = new Produto(12546054581L, "Macarrão");
	Produto produto4 = new Produto(12546054582L, "MAMÃO PAPAIA");
	Produto produto5 = new Produto(12546054583L, "Farofa");

	// Criando uma instância de CarrinhoComprasFactory
	CarrinhoComprasFactory factory = new CarrinhoComprasFactory();

	// Criando carrinhos para diferentes clientes
	CarrinhoCompras carrinho1 = factory.criar("cliente1");
	CarrinhoCompras carrinho2 = factory.criar("cliente2");
	CarrinhoCompras carrinho3 = factory.criar("cliente2");

	// Adicionando itens aos carrinhos
	carrinho1.adicionarItem(produto1, new BigDecimal(2.50), 10);
	carrinho1.adicionarItem(produto2, new BigDecimal(3.50), 15);
	carrinho2.adicionarItem(produto3, new BigDecimal(4.50), 20);
	carrinho2.adicionarItem(produto4, new BigDecimal(5.50), 1);
	carrinho2.adicionarItem(produto5, new BigDecimal(3.75), 5);
	carrinho3.adicionarItem(produto5, new BigDecimal(3.75), 5);

	// Exibindo os itens dos carrinhos
	System.out.println("Itens do carrinho 1: ");
	for (Item item : carrinho1.getItens()) {
	  System.out.println(item);
	}

	System.out.println("Itens do carrinho 2: ");
	for (Item item : carrinho2.getItens()) {
	  System.out.println(item);
	}

	// Imprimindo o valor total dos carrinhos
	System.out.printf("Valor total do carrinho 1: R$ %.2f\n", carrinho1.getValorTotal());
	System.out.printf("Valor total do carrinho 2: R$ %.2f\n", carrinho2.getValorTotal());
	System.out.printf("Valor total do carrinho 3: R$ %.2f\n", carrinho3.getValorTotal());

	System.out.println("Ticket médio: " + factory.getValorTicketMedio());

	System.out.println("RETORNANDO O CARRINHO QEU JÁ TEM CLIENTE");
	Produto produto6 = new Produto(12546054579L, "Açaí");
	Produto produto7 = new Produto(12546054580L, "Lasanha");
	Produto produto8 = new Produto(12546054580L, "Frango");

	// Criando carrinhos para diferentes clientes
	CarrinhoCompras carrinho4 = factory.criar("cliente3");
	CarrinhoCompras carrinho5 = factory.criar("cliente3");
	CarrinhoCompras carrinho6 = factory.criar("cliente4");

	// Adicionando itens aos carrinhos
	carrinho4.adicionarItem(produto6, new BigDecimal(2.50), 10);
	carrinho5.adicionarItem(produto7, new BigDecimal(3.50), 15);
	carrinho6.adicionarItem(produto8, new BigDecimal(4.50), 20);
  }
}
