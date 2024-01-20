package padroesEstruturais.decorator.decorators;

import padroesEstruturais.decorator.Bebida;

public class Leite extends BebidaDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public void montaBebida() {
        bebida.montaBebida();
        System.out.println("Adicionado 60 ml de leite");
    }

    @Override
    public Double getPreco() {
        return bebida.getPreco() + 2.5;
    }
}
