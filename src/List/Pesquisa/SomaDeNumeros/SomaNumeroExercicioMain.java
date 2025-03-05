package List.Pesquisa.SomaDeNumeros;

public class SomaNumeroExercicioMain {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(5000);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(100);

        somaNumeros.exibirNumeros();
        System.out.println("Número Max: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Número Min: " +somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.calcularSoma());
    }
}
