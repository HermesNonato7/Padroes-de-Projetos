package padroesCriacionais.builder;

public class App {
    public static void main (String [] args) {
        Cardapio001 cardapio001 = new Cardapio001();
        MontadorPedido montadorPedido = new MontadorPedido(cardapio001);
        montadorPedido.montarPedido();
        System.out.println(montadorPedido.getPedido());

        Cardapio002 cardapio002 = new Cardapio002();
        montadorPedido = new MontadorPedido(cardapio002);
        montadorPedido.montarPedido();
        System.out.println(montadorPedido.getPedido());
    }
}
