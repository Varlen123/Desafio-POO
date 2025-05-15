package desafio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    public int getcargaHoraria() {
        return cargaHoraria;
    }
    public void setcargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "{" +
                "titulo='" + getTitulo()+ '\'' +
                ", descricao='" +getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
