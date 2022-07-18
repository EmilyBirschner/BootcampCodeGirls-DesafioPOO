package dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    @Override
    public double caucularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo= " + getTitulo() +
                ", descrição= " + getDescricao() +
                ", carga horaria= " + cargaHoraria +
                "}";
    }

}
