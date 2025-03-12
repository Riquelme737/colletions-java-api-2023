package Set.OperacoesBasica.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicas.add(palavra);
    }

    public boolean removerPalavra(String palavra) {
        return conjuntoPalavrasUnicas.remove(palavra);
    }

   public void exibirPalavrasUnicas() {
        for (String s : conjuntoPalavrasUnicas) {
            System.out.println(s);
        }
   }

   public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicas.contains(palavra);
   }
}
