import java.time.LocalDate;

import desafio.*;;

public class Main {
    public static void main(String[] args) {     
    
    Curso curso = new Curso();

    curso.setTitulo("curso de java");
    curso.setDescricao("descrição do curso de java");
    curso.setcargaHoraria(8);

    Curso curso2 = new Curso();

    curso2.setTitulo("python");
    curso2.setDescricao("descrição curso de python");
    curso2.setcargaHoraria(4);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição da mentoria de java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso);
    System.out.println(curso2);
    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devVarlen = new Dev();
        devVarlen.setNome("Varlen");
        devVarlen.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Varlen:" + devVarlen.getConteudosInscritos());
        devVarlen.progredir();
        devVarlen.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Varlen:" + devVarlen.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Varlen:" + devVarlen.getConteudosConcluidos());
        System.out.println("XP:" + devVarlen.calcularTotalXp());
    }
}