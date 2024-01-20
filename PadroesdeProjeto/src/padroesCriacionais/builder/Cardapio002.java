package padroesCriacionais.builder;

public class Cardapio002 extends CadapioBuilder {

    public void pratoPrincipal() {
        pedido.setPratoPrincipal("Macarrão");
    }

    public void acompanhamento() {
        pedido.setAcompanhamento("Salada");
    }

    public void sobremesa() {
        pedido.setSobremesa("pudim de leite");
    }

    public void bebida() {
        pedido.setBebida("sem bebida");
    }
}
