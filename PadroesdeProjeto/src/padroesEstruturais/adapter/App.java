package padroesEstruturais.adapter;

import padroesEstruturais.adapter.adaptadores.HDMIParaVGAAdapter;
import padroesEstruturais.adapter.dispositivos.Computador;
import padroesEstruturais.adapter.dispositivos.MonitorHDMI;
import padroesEstruturais.adapter.dispositivos.MonitorVGA;

public class App {
    public static void main(String [] args) {
        Computador computador = new Computador();
        MonitorVGA monitorVGA = new MonitorVGA();
        MonitorHDMI monitorHDMI = new MonitorHDMI();
        computador.conectaPorta(monitorHDMI);
        computador.enviaImagemESom("imagem","som");
        System.out.println();
        computador.conectaPorta(new HDMIParaVGAAdapter(monitorVGA));
        computador.enviaImagemESom("imagem","som");
    }
}
