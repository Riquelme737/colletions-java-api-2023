package Set.Pesquisa.AgendaContatos;

public class AgendaContatosMain {
    public static void main(String[] args) {

        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContatos();

        contatos.adicionarContato("Riquelme", 1111111);
        contatos.adicionarContato("Riquelme", 0000000);
        contatos.adicionarContato("Riquelme Santos", 2222222);
        contatos.adicionarContato("Vanusa", 3333333);
        contatos.adicionarContato("Djalma", 4444444);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("Riquelme"));

        System.out.println("Contato atualizado: " + contatos.atualizarNumeroContato("Vanusa", 5555555));
    }
}
