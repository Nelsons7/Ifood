package main;

import assets.Pedido;
import assets.Carrinho;

public class Principal {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("hamburger", "lanches", 15);
        Pedido pedido2 = new Pedido("pizza", "pizzas", 18);
        Pedido pedido3 = new Pedido("lasanha", "massas", 25);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProdutos(pedido1);
        carrinho.adicionarProdutos(pedido2);
        carrinho.adicionarProdutos(pedido3);

        carrinho.exibirCarrinho();

    }
}