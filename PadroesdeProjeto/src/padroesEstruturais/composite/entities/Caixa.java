package padroesEstruturais.composite.entities;

public class Caixa implements Item {
    private Double valor;

    public Caixa(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double valor() {
        return valor;
    }
}
