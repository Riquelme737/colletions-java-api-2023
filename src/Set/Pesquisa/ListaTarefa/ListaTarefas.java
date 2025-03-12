package Set.Pesquisa.ListaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    private void analisaSeOSetEstaVazio() {
        if (tarefaSet.isEmpty()) {
            throw new RuntimeException("O set está vázio.");
        }
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaSet.remove(descricao);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public Integer contarTarefas() {
        return tarefaSet.size();
    }

    public void obterTarefasConcluidas() {
        analisaSeOSetEstaVazio();

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isFoiConcluida()) {
                System.out.println(tarefa);
            }
        }

    }

    public void obterTarefasPendentes() {

        analisaSeOSetEstaVazio();

        for (Tarefa tarefa : tarefaSet) {
            if (!tarefa.isFoiConcluida()) {
                System.out.println("Tarefas Pendentes: " + tarefa);
            }
        }

    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        analisaSeOSetEstaVazio();

        Tarefa tarefaConcluida = null;

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setFoiConcluida(true);
                tarefaConcluida = tarefa;
            }
        }

        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        analisaSeOSetEstaVazio();

        Tarefa tarefaPendente = null;

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setFoiConcluida(false);
                tarefaPendente = tarefa;
            }
        }

        return tarefaPendente;
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }


}
