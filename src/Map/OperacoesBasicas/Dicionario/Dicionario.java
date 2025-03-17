package Map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavra;

    public Dicionario() {
        this.palavra = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.palavra.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!this.palavra.isEmpty()) {
            this.palavra.remove(palavra);
        }
    }

    public void exibirPalavra(){
        System.out.println(this.palavra);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraDesejada = null;
        if (!this.palavra.isEmpty()) {
            palavraDesejada = this.palavra.get(palavra);
        }
        return palavraDesejada;
    }
}
