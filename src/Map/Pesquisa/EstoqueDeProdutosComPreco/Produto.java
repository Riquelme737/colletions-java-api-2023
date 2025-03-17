package Map.Pesquisa.EstoqueDeProdutosComPreco;

public record Produto(String nome, int quantidade, Double preco) {

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
