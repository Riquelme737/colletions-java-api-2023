package Map.OperacoesBasicas.Dicionario;

public class DicionarioMainExercicio {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Empatia", "Capacidade de se colocar no lugar de outra pessoa.");
        dicionario.adicionarPalavra("Perseverança", "Qualidade da pessoa persistente, de quem não desiste jamais: conseguiu o trabalho pelo seu excesso de perseverança");
        dicionario.adicionarPalavra("Não", "Modo de negar; negação, recusa");

        dicionario.exibirPalavra();
        System.out.println(dicionario.pesquisarPorPalavra("Empatia"));
    }
}
