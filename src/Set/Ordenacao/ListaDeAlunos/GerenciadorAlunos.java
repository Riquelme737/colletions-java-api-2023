package Set.Ordenacao.ListaDeAlunos;

import Set.Ordenacao.CadastroProduto.Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public boolean adicionarAluno(String nome, long matricula, double nota) {
        return alunos.add(new Aluno(nome, matricula, nota));
    }

    public boolean removerAluno(long matricula) {
        return alunos.remove(matricula);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunos);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunos);
        return alunoPorNota;
    }
}
