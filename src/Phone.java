public class Phone {
    public static void main(String[] args) throws Exception {
        Navegador navegador = new Navegador();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        Telefone telefone = new Telefone();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.selecionarMusica("Música 1");

        telefone.ligar("Contato 1");
        telefone.atender();
        telefone.correioVoz();
    }
}
