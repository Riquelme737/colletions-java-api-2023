package List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itemList.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public Double calcularValorTotal(){
        Double preco_total = 0.0;

        for (Item i : itemList) {
            preco_total = preco_total + i.getPreco() * i.getQuantidade();
        }

        return preco_total;
    }

    public void ixibirItens() {
        for (Item i : itemList) {
            System.out.println(i.getNome() + " - R$ " + i.getPreco() + " (" + i.getQuantidade() + ")");
        }
    }
}
