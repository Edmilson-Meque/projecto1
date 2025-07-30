package project.Domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate datainicial=LocalDate.now();
    private LocalDate datafinal=datainicial.plusDays(45);
    private Set<Dev> devsinscritos=new HashSet<>();
    private Set<Conteudo> conteudo=new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(LocalDate datainicial) {
        this.datainicial = datainicial;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(LocalDate datafinal) {
        this.datafinal = datafinal;
    }

    public Set<Dev> getDevsinscritos() {
        return devsinscritos;
    }

    public void setDevsinscritos(Set<Dev> devsinscritos) {
        this.devsinscritos = devsinscritos;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(datainicial, bootcamp.datainicial) && Objects.equals(datafinal, bootcamp.datafinal) && Objects.equals(devsinscritos, bootcamp.devsinscritos) && Objects.equals(conteudo, bootcamp.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, datainicial, datafinal, devsinscritos, conteudo);
    }
}
;