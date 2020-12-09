package assets;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private double total;
    private List<Pedido> produtos = new ArrayList<Pedido>();

    public void adicionarProdutos(Pedido pedido) {
        produtos.add(pedido);
        total += pedido.getPreco();
    }

    public void exibirCarrinho() {
        System.out.println("PRODUTOS DO CARRINHO");

        for (Pedido produto : produtos) {
            System.out.println(produto.getNome() + " -> " + "(" + " Categoria " + produto.getCategoria() + " )"
                    + " -> R$ " + produto.getPreco());
        }

        System.out.println(" Valor total de Pedidos: R$ " + total);

    }

    // get
    public double getTotal() {
        return total;
    }
}