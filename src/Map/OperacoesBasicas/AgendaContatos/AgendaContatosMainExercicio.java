package Map.OperacoesBasicas.AgendaContatos;

public class AgendaContatosMainExercicio {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.adicionarContato("Riquelme", 123456);
       agendaContatos.adicionarContato("Riquelme", 5665);
       agendaContatos.adicionarContato("Riquelme Santos", 1111111);
       agendaContatos.adicionarContato("Riquelme JAVA", 654321);
       agendaContatos.adicionarContato("Vanusa", 1111111);
       agendaContatos.adicionarContato("Riquelme", 7777777);

       agendaContatos.exibirContato();
    }
}
