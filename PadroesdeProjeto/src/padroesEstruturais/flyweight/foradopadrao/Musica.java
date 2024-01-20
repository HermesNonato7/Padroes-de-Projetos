package padroesEstruturais.flyweight.foradopadrao;

public class Musica {
    //Atributos intríssecos
    private String nome;
    private String artista;
    private Integer duracaoEmSegundos;
    //Atributo extrinseco
    private Integer quantidadeMusicaTocada;

    public Musica(String nome, String artista, Integer duracaoEmSegundos) {
        this.nome = nome;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.quantidadeMusicaTocada = 0;
    }

    public void contaMusica() {
        quantidadeMusicaTocada++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(Integer duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public Integer getQuantidadeMusicaTocada() {
        return quantidadeMusicaTocada;
    }
}