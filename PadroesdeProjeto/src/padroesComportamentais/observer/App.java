package padroesComportamentais.observer;

public class App {
    public static void main(String[] args) {
        ParteInteressada passageiro1 = new Passageiro("Gustavo");
        ParteInteressada passageiro2 = new Passageiro("Fernanda");
        ParteInteressada passageiro3 = new Passageiro("Isabela");
        AgenteNotificador motorista = new AgenteNotificador();

        motorista.addObservador(passageiro1);
        motorista.addObservador(passageiro2);
        motorista.addObservador(passageiro3);

        motorista.start();// inicio da viagem

        //cada passageiro vai fazer algo enquanto a viagem não termina
        new Thread(passageiro1).start();
        new Thread(passageiro2).start();
        new Thread(passageiro3).start();
    }
}