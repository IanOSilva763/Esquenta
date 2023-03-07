import java.util.ArrayList;
import java.util.Collection;

public class Diretor extends Pessoa {
    private Collection<Filme> filmes = new ArrayList<Filme>();
    private Integer quantidade_premios;

    public Integer getQuantidade_premios() {
        return quantidade_premios;
    }

    public void setQuantidade_premios(Integer quantidade_premios) {
        this.quantidade_premios = quantidade_premios;
    }

    public Collection<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Collection<Filme> filmes) {
        this.filmes = filmes;
    }
}
