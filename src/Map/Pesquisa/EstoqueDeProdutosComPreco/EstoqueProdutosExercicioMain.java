package Map.Pesquisa.EstoqueDeProdutosComPreco;

public class EstoqueProdutosExercicioMain {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1, "PRODUTO A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2, "PRODUTO B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3, "PRODUTO C", 2, 15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total de estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
