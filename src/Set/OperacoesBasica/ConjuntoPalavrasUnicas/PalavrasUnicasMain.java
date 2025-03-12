package Set.OperacoesBasica.ConjuntoPalavrasUnicas;

public class PalavrasUnicasMain {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        System.out.println("Adicionando palavras...");
        palavrasUnicas.adicionarPalavra("Carro");
        palavrasUnicas.adicionarPalavra("Moto");
        palavrasUnicas.adicionarPalavra("Computador");
        palavrasUnicas.adicionarPalavra("Programação");

        palavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra \"Programação\" existe? " + palavrasUnicas.verificarPalavra("Programação"));
        System.out.println("Removendo a palavra \"Mouse\": " + palavrasUnicas.removerPalavra("Mouse"));


        palavrasUnicas.exibirPalavrasUnicas();
    }
}
