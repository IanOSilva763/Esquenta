public class Filme {
    private Ator ator;
    private Diretor diretor;
    private Integer nota;
    private Integer anolancamento;
    private String nome;

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(Integer anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
