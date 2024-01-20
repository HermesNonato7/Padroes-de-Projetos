package padroesCriacionais.singleton;

public class App {
    public static void main(String[] args) {
        MinhaClasseSingleton minhaClasseSingleton = MinhaClasseSingleton.getInstance();
        minhaClasseSingleton.metodoA();
    }
}
