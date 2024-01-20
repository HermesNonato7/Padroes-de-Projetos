package padroesCriacionais.builder;

public abstract class CadapioBuilder {
    protected Pedido pedido;

    public CadapioBuilder() {
        pedido = new Pedido();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public abstract void pratoPrincipal();
    public abstract void acompanhamento();
    public abstract void sobremesa();
    public abstract void bebida();
}
