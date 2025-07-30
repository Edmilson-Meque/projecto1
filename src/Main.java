import project.Domain.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso= new Curso();
        curso.setTitulo("Basketball");
        curso.setDescricao("Bolinha");
        curso.setCargahoraria(20);
       // System.out.println(curso);
        //System.out.println(curso.getCargahoraria());

        Curso curso2= new Curso();
        curso2.setTitulo("Futebol");
        curso2.setDescricao("Mundial");
        curso2.setCargahoraria(64);
       // System.out.println(curso2);

        Mentoria mentoria=new Mentoria();
        mentoria.setDescricao("Horas");
        mentoria.setTitulo("Dia de Hoje");
        mentoria.setDatalocal(LocalDate.now());

       // System.out.println(mentoria);
        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Java Dev");
        bootcamp.setDescricao("Descricao Bootcamp , java Developer");
        bootcamp.getConteudo().add(curso);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev west=new Dev();
        west.setNome("Edmilson");
        west.inscreverBoot( bootcamp);
        System.out.println("Conteudos inscritos"+west.getConteudosinscritos());
        west.programed();
        System.out.println("Conteudos concluidos"+west.getConteudosclocuidos());


        Dev we=new Dev();
        we.setNome("Mingo");
        we.inscreverBoot( bootcamp);

        System.out.println("Conteudos inscritos"+we.getConteudosinscritos());
        we.programed();
        System.out.println("Conteudos concluidos"+west.getConteudosclocuidos());





    }
}