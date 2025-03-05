package List.Ordernacao.OrdenecaoPessoas;

public class OrdenacaoPessoaExercicioMain {
    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Neuza", 70, 1.50);
        ordenacaoPessoas.adicionarPessoa("Riquelme", 19, 1.76);
        ordenacaoPessoas.adicionarPessoa("Vanusa", 48, 1.50);
        ordenacaoPessoas.adicionarPessoa("Djalma", 26, 1.90);

        System.out.println(ordenacaoPessoas);

        System.out.println(ordenacaoPessoas.ordernarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
