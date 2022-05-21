import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Philips You Are You");
        bootcamp.setDescricao("Descrição Bootcamp Philips You Are You");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLionel = new Dev();
        devLionel.setNome("Lionel Miranda");
        devLionel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lionel Miranda:" + devLionel.getConteudosInscritos());
        devLionel.progredir();
        devLionel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lionel Miranda:" + devLionel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lionel Miranda:" + devLionel.getConteudosConcluidos());
        System.out.println("XP:" + devLionel.calcularTotalXp());

        System.out.println("-------");

        Dev devPereira = new Dev();
        devPereira.setNome("Pereira");
        devPereira.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pereira:" + devPereira.getConteudosInscritos());
        devPereira.progredir();
        devPereira.progredir();
        devPereira.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pereira:" + devPereira.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pereira:" + devPereira.getConteudosConcluidos());
        System.out.println("XP:" + devPereira.calcularTotalXp());

    }
}
