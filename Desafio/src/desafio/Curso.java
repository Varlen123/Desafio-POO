package desafio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaMoradia;
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
    public int getCargaMoradia() {
        return cargaMoradia;
    }
    public void setCargaMoradia(int cargaMoradia) {
        this.cargaMoradia = cargaMoradia;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaMoradia=" + cargaMoradia +
                '}';
    }
}
