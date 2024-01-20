package padroesEstruturais.adapter.dispositivos;

import padroesEstruturais.adapter.interfaces.HDMI;

public class Computador {
    private HDMI porta;

    public void conectaPorta(HDMI hdmi) {
        System.out.println("Conectando na porta HDMI...");
        this.porta = hdmi;
    }

    public void enviaImagemESom(String imagem, String som) {
        if(porta == null) {
            System.out.println("Conectar o cabo HDMI!");
        }
        else {
            porta.setImagem(imagem);
            porta.setSom(som);
        }
    }
}
