package padroesEstruturais.flyweight.service;

import padroesEstruturais.flyweight.model.Musica;
import padroesEstruturais.flyweight.musicaFlyweigth.FlyWeightFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicaService {
    private Map<String, Map<String, Musica>> memoria;

    public MusicaService() {
        memoria = new HashMap<>();
    }

    public void ouvirMusica(String usuario, String nomeMusica) {
        Map<String, Musica> usuarioPlayList = memoria.get(usuario);
        if(usuarioPlayList == null) {
            usuarioPlayList = new HashMap<>();
            memoria.put(usuario, usuarioPlayList);
        }

        Musica musica = usuarioPlayList.get(nomeMusica);
        if(musica == null) {
            musica = new Musica(FlyWeightFactory.getInstance().getMusica(nomeMusica));
            usuarioPlayList.put(nomeMusica, musica);
        }
        System.out.println(String.format("%s está escutando '%s'", usuario, musica.getMusicaFlyweight().getNome()));
        musica.contaMusica();
    }

    public void relatorio() {
        Set<String> usuarios = memoria.keySet();
        for(String usuario : usuarios) {
            int contador = 0;
            System.out.println("---------");
            System.out.println(usuario + " ouviu:");
            Collection<Musica> musicas = memoria.get(usuario).values();
            for(Musica music: musicas) {
                System.out.println(String.format("%s/%s %d vez(es)",
                        music.getMusicaFlyweight().getArtista(),
                        music.getMusicaFlyweight().getNome(),
                        music.getQuantidadeMusicaTocada()));
                contador += (music.getQuantidadeMusicaTocada() * music.getMusicaFlyweight().getDuracaoEmSegundos());
            }
            System.out.println(String.format("%s ouviu música por %d segundos", usuario, contador));
        }
        System.out.println("Total de músicas na memória: " + FlyWeightFactory.getInstance().getTamanho());
    }
}
