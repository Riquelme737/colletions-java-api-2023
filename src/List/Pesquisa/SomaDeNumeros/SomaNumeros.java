package List.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosInteirosList;

    public SomaNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteirosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer n : numerosInteirosList) {
            soma += n;
        }
        return soma;
    }

    public void exibirNumeros() {

        analisarSeAListEstaVazia();

        for (Integer n : numerosInteirosList) {
            System.out.println(n);
        }
    }

    public int encontrarMaiorNumero() {

        analisarSeAListEstaVazia();

        int numeroMax = 0;
        for (Integer n : numerosInteirosList) {
            if (n > numeroMax) {
                numeroMax = n;
            }
        }
        return numeroMax;
    }

    public int encontrarMenorNumero() {

        analisarSeAListEstaVazia();

        int numeroMen = numerosInteirosList.get(0);
        for (Integer n : numerosInteirosList) {
            if (n < numeroMen) {
                numeroMen = n;
            }
        }
        return numeroMen;
    }

    public void analisarSeAListEstaVazia() {
        if (numerosInteirosList.isEmpty()) {
            throw new RuntimeException("A lista está vázia!");
        }
    }
}
