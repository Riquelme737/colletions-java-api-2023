package Map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    private boolean mapEstaVazio () {
        boolean vazio = false;
        if (contatos.isEmpty()) {
            vazio = true;
        }
        return vazio;
    }

    public boolean adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
        return true;
    }

    public boolean removerContato(String nome) {
        if (mapEstaVazio()) {
            contatos.remove(nome);
            return true;
        } else {
            return false;
        }
    }

    public void exibirContato() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorPesquisa = null;
        return numeroPorPesquisa;

    }
}
