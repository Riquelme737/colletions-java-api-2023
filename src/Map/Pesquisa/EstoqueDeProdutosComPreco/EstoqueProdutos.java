package Map.Pesquisa.EstoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private final Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

   public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
   }

   public void exibirProdutos() {
        System.out.println(produtoMap);
   }

   public double calcularValorTotalEstoque() {
       double valorTotal = 0;

       if (!produtoMap.isEmpty()) {
           for (Produto p : produtoMap.values()) {
               valorTotal += p.preco() * p.quantidade();
           }
       }

       return valorTotal;
   }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.preco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }
}
