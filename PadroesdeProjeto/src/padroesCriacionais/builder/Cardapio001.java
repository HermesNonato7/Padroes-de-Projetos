package padroesCriacionais.builder;

public class Cardapio001 extends CadapioBuilder {

    public void pratoPrincipal() {
        pedido.setPratoPrincipal("Arroz");
    }

    public void acompanhamento() {
        pedido.setAcompanhamento("Feijão");
    }

    public void sobremesa() {
        pedido.setSobremesa("gelatina");
    }

    public void bebida() {
        pedido.setBebida("guaraná");
    }
}
