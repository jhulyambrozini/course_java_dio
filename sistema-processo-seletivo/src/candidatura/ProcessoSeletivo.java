package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);

        // selecaoCandidatos();

        // imprimirSelecionados();

        String[] candidatos = {"Felipe", "Julia", "Paulo", "Augusto", "Monica"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " numero maximo de tentativas: " + tentativasRealizadas);
        }
    }


    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static  void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Julia", "Paulo", "Augusto", "Monica"};
        System.out.println("Imprimindo a lista de candidatos informando p indice do elemento.");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendito = valorPretendito();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendito);
            if(salarioBase >= salarioPretendito){
                System.out.println("O candidato: " + candidato + " foi selecionado para a vaga");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendito(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendito){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendito){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendito){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}