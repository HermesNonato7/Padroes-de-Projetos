package padroesCriacionais.builder;

public class MontadorPedido {
    private CadapioBuilder cadapioBuilder;

    public MontadorPedido(CadapioBuilder cadapioBuilder) {
        this.cadapioBuilder = cadapioBuilder;
    }

    public void montarPedido() {
        cadapioBuilder.pratoPrincipal();
        cadapioBuilder.acompanhamento();
        cadapioBuilder.bebida();
        cadapioBuilder.sobremesa();
    }

    public Pedido getPedido() {
        return cadapioBuilder.getPedido();
    }
}
