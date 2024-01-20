package padroesEstruturais.composite.entities;

import java.util.List;

public class Fardo implements Item {
    //Aqui pode ser armazenado tanto o fardo quando a caixa;
    private List<Item> itens;

    public Fardo(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public Double valor() {
        double valor = 0.0;
        for(Item item : itens) {
            valor += item.valor();
        }
        return valor;
    }
}
