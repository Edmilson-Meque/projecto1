import project.Domain.Curso;
import project.Domain.Mentoria;

import java.time.Instant;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso= new Curso();
        curso.setTitulo("Basketball");
        curso.setDescricao("Bolinha");
        curso.setCargahoraria(20);
        System.out.println(curso);
        System.out.println(curso.getCargahoraria());

        Curso curso2= new Curso();
        curso2.setTitulo("Futebol");
        curso2.setDescricao("Mundial");
        curso2.setCargahoraria(64);
        System.out.println(curso2);
        System.out.println("======================================================================");


        Mentoria mentoria=new Mentoria();
        mentoria.setDescricao("Horas");
        mentoria.setTitulo("Hoje");
        mentoria.setCargahoraria(LocalDate.now());

        System.out.println(mentoria);

    }
}