package padroesEstruturais.decorator;

public class Cha implements Bebida {

    @Override
    public void montaBebida() {
        System.out.println("Adicionado 50 ml de chá");
    }

    @Override
    public Double getPreco() {
        return 0.50;
    }
}
