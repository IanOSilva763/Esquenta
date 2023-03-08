import java.util.ArrayList;
import java.util.Collection;

public class Ator extends Pessoa {
    private Collection<Filme> filmes = new ArrayList<>();
    private String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
