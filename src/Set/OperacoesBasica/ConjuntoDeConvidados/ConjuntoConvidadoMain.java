package Set.OperacoesBasica.ConjuntoDeConvidados;

public class ConjuntoConvidadoMain {
    public static void main(String[] args) {

        ConjuntoConvidado convidados = new ConjuntoConvidado();

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do Set.");

        convidados.adicionarConvidado("Convidado 1", 1001);
        convidados.adicionarConvidado("Convidado 2", 1002);
        convidados.adicionarConvidado("Convidado 3", 1002);
        convidados.adicionarConvidado("Convidado 4", 1004);

        convidados.exibirConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do Set.");

        convidados.removerConvidadoPorCodigoConvite(1004);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do Set.");
        convidados.exibirConvidados();
    }
}
