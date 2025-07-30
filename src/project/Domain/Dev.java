package project.Domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosinscritos=new LinkedHashSet<>();
    private Set<Conteudo> conteudosclocuidos=new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosinscritos() {
        return conteudosinscritos;
    }

    public void setConteudosinscritos(Set<Conteudo> conteudosinscritos) {
        this.conteudosinscritos = conteudosinscritos;
    }

    public Set<Conteudo> getConteudosclocuidos() {
        return conteudosclocuidos;
    }

    public void setConteudosclocuidos(Set<Conteudo> conteudosclocuidos) {
        this.conteudosclocuidos = conteudosclocuidos;
    }

    public void inscreverBoot(Bootcamp bootcamp){
        this.conteudosinscritos.addAll(bootcamp.getConteudo());
        bootcamp.getDevsinscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo=this.conteudosinscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosclocuidos.add(conteudo.get());
            this.conteudosinscritos.remove(conteudo.get());
        } else {

            System.err.println("Vc nao esta matriculado em nenhum conteudo");
        }
    }
    public double calcularXP(){
        return this.conteudosclocuidos
                .stream().
                mapToDouble(Conteudo::calcularXP)
                .sum();


    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosinscritos, dev.conteudosinscritos) && Objects.equals(conteudosclocuidos, dev.conteudosclocuidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosinscritos, conteudosclocuidos);
    }
}
