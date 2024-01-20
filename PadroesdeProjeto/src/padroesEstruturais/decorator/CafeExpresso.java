package padroesEstruturais.decorator;

public class CafeExpresso implements Bebida {

    @Override
    public void montaBebida() {
        System.out.println("Adicionado 50 ml de expresso");
    }

    @Override
    public Double getPreco() {
        return 2.00;
    }
}
