package padroesEstruturais.flyweight.musicaFlyweigth;

public class MusicaFlyweight {
    private final String nome;
    private final String artista;
    private final Integer duracaoEmSegundos;

    public MusicaFlyweight(String nome, String artista, Integer duracaoEmSegundos) {
        this.nome = nome;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public Integer getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    @Override
    public String toString() {
        return "MusicaFlyweight{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", duracaoEmSegundos=" + duracaoEmSegundos +
                '}';
    }
}
