package padroesEstruturais.composite.entities;

import java.util.List;

public class Container implements Item {
    //Aqui pode ser armazenado tanto o container, fardo ou caixa;
    private List<Item> itens;

    public Container(List<Item> itens) {
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

