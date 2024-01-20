package padroesComportamentais.observer;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class AgenteNotificador extends Thread {
    private List<ParteInteressada> observadores = new ArrayList<>();

    public void addObservador(ParteInteressada observador) {
        observadores.add(observador);
    }

    @Override
    public void run() {
        Instant presente = Instant.now();
        Instant futuro =  presente.plusSeconds(5);
        System.out.println("Início da viagem.");

        System.out.println("As partes interessada serão notificadas logo que chegar no destino...");
        while(presente.isBefore(futuro)) {
            presente = Instant.now();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fim da viagem.");

        EventoChegada evento = new EventoChegada(true);
        System.out.println("Motorista notifica a todos que chegou no destino.");

        //Notifica os observadores
        for(ParteInteressada observador: this.observadores) {
            observador.notificar(evento);
        }
    }
}
