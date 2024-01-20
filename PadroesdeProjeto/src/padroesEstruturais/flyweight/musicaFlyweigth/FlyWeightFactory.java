package padroesEstruturais.flyweight.musicaFlyweigth;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static FlyWeightFactory instance = new FlyWeightFactory();
    private static Map<String, MusicaFlyweight> musicaFlyRepository;

    private FlyWeightFactory() {
        musicaFlyRepository = new HashMap<>();
    }

    public static FlyWeightFactory getInstance() {
        return instance;
    }

    public MusicaFlyweight getMusica(String descricao) {
        MusicaFlyweight musicaFlyweight = musicaFlyRepository.get(descricao);
        if(musicaFlyweight == null) {
            System.out.println("Criado nova nova Flyweight para " + descricao);
            musicaFlyweight = getMusicaEmString(descricao);
            musicaFlyRepository.put(descricao, musicaFlyweight);
        }
        return musicaFlyweight;
    }

    private MusicaFlyweight getMusicaEmString(String desc) {
        String[] musicaData = desc.split(";");
        return new MusicaFlyweight(musicaData[0], musicaData[1], new Integer(musicaData[2]));
    }

    public Integer getTamanho() {
        return musicaFlyRepository.size();
    }
}
