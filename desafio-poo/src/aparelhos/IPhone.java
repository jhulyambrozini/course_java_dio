package aparelhos;

import contracts.IPod;
import contracts.InternetExplorer;
import contracts.Phone;

public class IPhone implements IPod, Phone, InternetExplorer {

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo pagina: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void AtualizarPagina(String pagina) {
      System.out.println("Atualizando pagina: " + pagina);
    }

    @Override
    public void ligar(String nome) {
       System.out.println("Ligando para: " + nome);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
       System.out.println("Iniciando o correio de voz");
    }

    @Override
    public void pausarMusica(String musica) {
       System.out.println("Pausando musica: " + musica);
    }

    @Override
    public void tocarMusica(String musica) {
       System.out.println("Tocando musica: " + musica);
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionando musica: " + musica);
       
    }
    
}
