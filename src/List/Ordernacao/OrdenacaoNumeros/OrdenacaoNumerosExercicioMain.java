package List.Ordernacao.OrdenacaoNumeros;

public class OrdenacaoNumerosExercicioMain {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.addNumero(3);
        ordenacaoNumeros.addNumero(0);
        ordenacaoNumeros.addNumero(88);
        ordenacaoNumeros.addNumero(102);
        ordenacaoNumeros.addNumero(22);
        ordenacaoNumeros.addNumero(17);

        ordenacaoNumeros.exibirLista();

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        ordenacaoNumeros.exibirLista();

        System.out.println(ordenacaoNumeros.ordernarDescendente());
        ordenacaoNumeros.exibirLista();


    }
}
