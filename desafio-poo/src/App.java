import aparelhos.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.ligar("Ana");
        iPhone.atender();
        iPhone.iniciarCorreioDeVoz();

        System.out.println("======================");

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("Casas para alugar");
        iPhone.AtualizarPagina("Casas para alugar");

        System.out.println("======================");

        iPhone.selecionarMusica("I Need You");
        iPhone.pausarMusica("I Need You");
        iPhone.tocarMusica("I Need You");
    }
}
