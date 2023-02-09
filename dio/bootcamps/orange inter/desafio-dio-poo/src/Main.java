import com.dio.poo.dominio.Bootcamp;
import com.dio.poo.dominio.Curso;
import com.dio.poo.dominio.Dev;
import com.dio.poo.dominio.Mentoria;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Peter");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + dev.getNome() + "->" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + dev.getNome() + "->" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + dev.getNome() + "->" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("--------------------------------------------------------");

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + dev.getNome() + "->" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + dev.getNome() + "->"+ dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + dev.getNome() + "->"+ dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

    }

}