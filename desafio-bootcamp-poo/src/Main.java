import java.time.LocalDate;

import bootcamp.dominio.Bootcamp;
import bootcamp.dominio.Curso;
import bootcamp.dominio.Dev;
import bootcamp.dominio.Mentorias;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java") ;
        curso1.setDescricao("Curso de introdução a java"); 
        curso1.cargaHoraria = 12;
        Curso curso2 = new Curso();
        curso2.setTitulo("Estrutura d edados") ;
        curso2.setDescricao("Curso de estrutura de dados com java"); 
        curso2.cargaHoraria = 5;

        System.out.println(curso1);

        Mentorias mentoria1 = new Mentorias();

        mentoria1.setDescricao("descrição Mentoria de java");
        mentoria1.setTitulo("Mentoria java"); 
        mentoria1.data = LocalDate.now();

        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.name = "Java developer";
        bootcamp1.descricao = "Bootcamp de java developer";
        bootcamp1.conteudos.add(curso1);
        bootcamp1.conteudos.add(curso2);
        bootcamp1.conteudos.add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.nome = "Camila";
        devCamila.inscreverBootcamp(bootcamp1);
        devCamila.progredir();

        System.out.println("Conteudos inscritos Camila" + devCamila.conteudosConcluidos);
        System.out.println("Conteudos concluidos Camila" + devCamila.conteudosIncritos);
        System.out.println("=======================");

        Dev devJoao = new Dev();
        devJoao.nome = "Joao";
        devJoao.inscreverBootcamp(bootcamp1);
        devJoao.progredir();

        System.out.println("=======================");

        System.out.println("Conteudos concluidos Joao" + devCamila.conteudosConcluidos);
        System.out.println("Conteudos inscritos Joao" + devJoao.conteudosIncritos);
        System.out.println("=======================");

    }
}
