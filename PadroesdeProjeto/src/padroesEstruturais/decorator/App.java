package padroesEstruturais.decorator;

import padroesEstruturais.decorator.decorators.BebidaDupla;
import padroesEstruturais.decorator.decorators.Leite;

public class App {
    public static void pedido(String nome, Bebida bebida) {
        System.out.println("Pedido-> " + nome);
        bebida.montaBebida();
        System.out.println("Valor: " + bebida.getPreco());
        System.out.println();
    }

    public static void main(String[] args) {
        pedido("Chá", new Cha());
        pedido("Café Expresso", new CafeExpresso());
        pedido("Café com leite", new Leite(new CafeExpresso()));
        pedido("Leite com café duplo", new Leite(new BebidaDupla(new CafeExpresso())));

        pedido("3 doses de leite + chá", new Leite(new Leite(new Leite(new Cha()))));
    }
}