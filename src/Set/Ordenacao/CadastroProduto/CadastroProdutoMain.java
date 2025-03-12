package Set.Ordenacao.CadastroProduto;

public class CadastroProdutoMain {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProduto);

        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }
}
