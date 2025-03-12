package Set.Pesquisa.ListaTarefa;

public class Tarefa {

    private String descricao;
    private boolean foiConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.foiConcluida = foiConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFoiConcluida() {
        return foiConcluida;
    }

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    @Override
    public String toString() {
        return "%s - Foi Concluida? %s".formatted(descricao, foiConcluida);
    }


}
