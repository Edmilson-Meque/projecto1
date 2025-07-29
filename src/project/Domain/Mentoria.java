package project.Domain;

import java.time.LocalDate;

public class Mentoria {
   private String titulo;
    private String descricao;
   private LocalDate cargahoraria;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(LocalDate cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
