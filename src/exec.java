public class exec {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.setNome("Avatar");
        f1.setAnolancamento(2009);
        f1.setNota(8);

        Genero ficcaoCientifica = new Genero();
        ficcaoCientifica.setNome("Ficção Científica");
        Filme f1 = new Filme(ficcaoCientifica);

        f1.setGenero(ficcaoCientifica);

        System.out.println(f1);
        System.out.println(f1.getNome());
        System.out.println(f1.getGenero().getNome());
    }
}
