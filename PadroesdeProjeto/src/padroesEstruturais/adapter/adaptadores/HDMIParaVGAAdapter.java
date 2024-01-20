package padroesEstruturais.adapter.adaptadores;

import padroesEstruturais.adapter.interfaces.HDMI;
import padroesEstruturais.adapter.interfaces.VGA;

/*
O padrão Adapter: Imagina que um cliente quer acessar um objeto e este objeto não disponibiliza uma interface
que o cliente espera.

Como classes de interfaces incompatíveis podem trabalhar juntas?

Solução: Definir uma interface de uma classe em outra que o cliente necessite.
*/
public class HDMIParaVGAAdapter implements HDMI {
    private VGA vga;

    public HDMIParaVGAAdapter(VGA vga) {
        System.out.println("Conectando o adaptador HDMI/VGA...");
        this.vga = vga;
    }

    @Override
    public void setImagem(String imagem) {
        System.out.println("Convertendo imagem de HDMI para VGA");
        vga.setImagem(imagem);
    }

    @Override
    public void setSom(String som) {
        System.out.println("VGA não suporta som");
    }
}
