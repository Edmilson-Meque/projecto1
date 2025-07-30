package project.Domain;

public abstract class Conteudo {
    // o static mostra que posso usar o XP ou acesssar fora a classe;
 protected static final double XP_Padrao = 10;
  private String titulo;
  private String descricao;

  public abstract double calcularXP();


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
}
