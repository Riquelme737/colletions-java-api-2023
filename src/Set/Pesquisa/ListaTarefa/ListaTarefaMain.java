package Set.Pesquisa.ListaTarefa;

public class ListaTarefaMain {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Atualmente há " + listaTarefas.contarTarefas() + " tarefa(s) na sua lista.");

        System.out.println("Adicionando tarefas...");
        listaTarefas.adicionarTarefa("Estudar sobre colletions");
        listaTarefas.adicionarTarefa("Estudar sobre Catolicismo");
        listaTarefas.adicionarTarefa("Jogar Xadrez");

        listaTarefas.exibirTarefas();
        System.out.println("Atualmente há " + listaTarefas.contarTarefas() + " tarefa(s) na sua lista.");

        System.out.println("=================================");
        listaTarefas.obterTarefasPendentes();
        System.out.println("===================================");
        System.out.println("Adicionando \"Estudar sobre Colletions\" como concluida(a).");
        listaTarefas.marcarTarefaConcluida("Estudar sobre Colletions");

        System.out.println("Adicionando \"Jogar Xadrez\" como concluida(o).");
        listaTarefas.marcarTarefaConcluida("Jogar Xadrez");

        listaTarefas.obterTarefasConcluidas();

    }
}
