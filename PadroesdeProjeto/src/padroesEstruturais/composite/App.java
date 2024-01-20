package padroesEstruturais.composite;

import padroesEstruturais.composite.entities.Caixa;
import padroesEstruturais.composite.entities.Container;
import padroesEstruturais.composite.entities.Fardo;
import padroesEstruturais.composite.entities.Item;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Item leiteDesnatado1 = new Caixa(1.00);
        Item leiteDesnatado2 = new Caixa(1.00);
        Item leiteDesnatado3 = new Caixa(1.00);

        Item leiteIntegral1 = new Caixa(2.00);
        Item leiteIntegral2 = new Caixa(2.00);
        Item leiteIntegral3 = new Caixa(2.00);

        Fardo fardoDesnatado = new Fardo(Arrays.asList(leiteDesnatado1, leiteDesnatado2, leiteDesnatado3));
        Fardo fardoIntegral = new Fardo(Arrays.asList(leiteIntegral1, leiteIntegral2, leiteIntegral3));

        Container container = new Container(Arrays.asList(fardoDesnatado, fardoIntegral));

        System.out.println("Valor da caixa longa vida desnatado: " + leiteDesnatado1.valor());
        System.out.println("Valor da caixa longa vida integral: " + leiteIntegral1.valor());
        System.out.println();
        System.out.println("Valor do fardo desnatado: " + fardoDesnatado.valor());
        System.out.println("Valor do fardo integral: " + fardoIntegral.valor());
        System.out.println();
        System.out.println("Valor do container: " + container.valor());
    }
}
