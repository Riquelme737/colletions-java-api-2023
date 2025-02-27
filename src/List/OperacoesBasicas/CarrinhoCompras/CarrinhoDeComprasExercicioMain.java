package List.OperacoesBasicas.CarrinhoCompras;

public class CarrinhoDeComprasExercicioMain {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Adicionando items...");
        carrinhoDeCompras.adicionarItem("1kg de Feijão", 5.99, 1);
        carrinhoDeCompras.adicionarItem("Placa de ovos", 29.99, 1);
        carrinhoDeCompras.adicionarItem("1kg de Arroz", 6.99, 1);
        carrinhoDeCompras.adicionarItem("Café", 14.99, 1);
        carrinhoDeCompras.ixibirItens();

        System.out.printf("Valor Total: R$%.2f\n\n", carrinhoDeCompras.calcularValorTotal());

        System.out.println("Removendo café...");
        carrinhoDeCompras.removerItem("Café");

        carrinhoDeCompras.ixibirItens();
        System.out.printf("Valor Total: R$%.2f\n\n", carrinhoDeCompras.calcularValorTotal());
    }
}
