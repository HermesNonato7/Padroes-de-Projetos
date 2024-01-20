package padroesEstruturais.decorator.decorators;

import padroesEstruturais.decorator.Bebida;

/*
    O padrão Decorator adiciona funcionalidades a objetos de forma dinâmica (em tempo de execução),
     permitindo assim a expansão do objeto de maneira mais flexível.
*/
public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}
