package padroesEstruturais.decorator.decorators;

import padroesEstruturais.decorator.Bebida;

public class BebidaDupla extends BebidaDecorator {

    public BebidaDupla(Bebida bebida) {
        super(bebida);
    }

    @Override
    public void montaBebida() {
        bebida.montaBebida();
        bebida.montaBebida();
    }

    @Override
    public Double getPreco() {
        return bebida.getPreco() * 1.5;
    }
}
