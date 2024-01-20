package padroesComportamentais.templateMethod;

public class App {
    public static void main(String[] args) {
        MinhaClasseModelo minhaClasseModelo = new MinhaClasseConcreta();
        minhaClasseModelo.metodoFinal();
        minhaClasseModelo.metodoA();
        minhaClasseModelo.metodoBModelo();
    }
}