public class Filme {
    private Genero genero;
    private Ator ator;
    private Diretor diretor;
    private Integer nota;
    private Integer anolancamento;
    private String nome;

    public Integer getNota() {
        return nota;
    }
    public Filme(Genero genero) {
        this.genero = genero;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
}
