package List.Ordernacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void addNumero(int numero) {
        integerList.add(numero);
    }

    private void analiseSeAListEstaVazia() {
        if (integerList.isEmpty()) {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirLista() {
        for (Integer n : integerList) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemAscedente = new ArrayList<>(integerList);
        analiseSeAListEstaVazia();
        Collections.sort(ordemAscedente);
        return ordemAscedente;
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> ordemDescendente = new ArrayList<>(integerList);
        analiseSeAListEstaVazia();
        Collections.sort(ordemDescendente, Collections.reverseOrder());
        return ordemDescendente;
    }
}
