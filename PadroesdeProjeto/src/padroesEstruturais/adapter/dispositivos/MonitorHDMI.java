package padroesEstruturais.adapter.dispositivos;

import padroesEstruturais.adapter.interfaces.HDMI;

public class MonitorHDMI implements HDMI {
    @Override
    public void setImagem(String imagem) {
        System.out.println("Imagem ok");
    }

    @Override
    public void setSom(String som) {
        System.out.println("Som ok");
    }
}
