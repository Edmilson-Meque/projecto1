package project.Domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate datalocal;

    public Mentoria() {
    }


    public LocalDate getDatalocal() {
        return datalocal;
    }

    public void setDatalocal(LocalDate datalocal) {
        this.datalocal = datalocal;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", datalocal=" + datalocal +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_Padrao+20;
    }
}
