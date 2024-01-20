package padroesEstruturais.flyweight;

import padroesEstruturais.flyweight.service.MusicaService;

public class App {
    public static void main(String[] args) {
        MusicaService player = new MusicaService();
        player.ouvirMusica("Marcos", "Sultans Of Swing;Dire Straits;500");
        player.ouvirMusica("Marcos", "Sultans Of Swing;Dire Straits;500");
        player.ouvirMusica("Marcos", "Sultans Of Swing;Dire Straits;500");
        player.ouvirMusica("Marcos", "Hotel California;Hotel California;200");
        player.ouvirMusica("Gustavo", "Sultans Of Swing;Dire Straits;500");
        player.ouvirMusica("Gustavo", "Hotel California;Hotel California;200");

        player.relatorio();
    }
}
