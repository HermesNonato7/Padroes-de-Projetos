package padroesEstruturais.flyweight.model;

import padroesEstruturais.flyweight.musicaFlyweigth.MusicaFlyweight;

/*
    Como posso trabalhar com uma grande quantidade de objetos na memória de uma forma mais eficiente?

    O Padrão Flyweight é voltado para você ter um tipo de cache a partir da separação de
    valores intrísecos (valores que não mudam) dos
	valores extrinsecos (valores que mudam de acordo com o contexto).

	Utilize o padrão Flyweight apenas quando o seu programa deve suportar um grande número de objetos
	com o objetivo de otimizar o uso de memória.

	O benefício de aplicar o padrão depende muito de como e onde ele é usado.

	Ele é mais útil quando uma aplicação precisa gerar um grande número de objetos similares.
*/
public class Musica {
    private MusicaFlyweight musicaFlyweight;
    private Integer quantidadeMusicaTocada;

    public Musica(MusicaFlyweight musicaFlyweight) {
        this.musicaFlyweight = musicaFlyweight;
        quantidadeMusicaTocada = 0;
    }

    public void contaMusica() {
        quantidadeMusicaTocada++;
    }

    public MusicaFlyweight getMusicaFlyweight() {
        return musicaFlyweight;
    }

    public void setMusicaFlyweight(MusicaFlyweight musicaFlyweight) {
        this.musicaFlyweight = musicaFlyweight;
    }

    public Integer getQuantidadeMusicaTocada() {
        return quantidadeMusicaTocada;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "musicaFlyweight=" + musicaFlyweight +
                ", quantidadeMusicaTocada=" + quantidadeMusicaTocada +
                '}';
    }
}
