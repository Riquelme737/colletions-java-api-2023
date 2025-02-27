package List.OperacoesBasicas.ListaDeTarefas;

public class ListaTarefaExercicioMain {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.print("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas() + "\n");

        System.out.println("Adicionando Tarefas...");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 4");

        listaTarefa.obterDescricoesTarefas();
        System.out.print("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("\nRemovendo as tarefas duplicadas...");
        listaTarefa.removerTarefa("Tarefa 4");

        listaTarefa.obterDescricoesTarefas();
        System.out.print("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

    }
}
