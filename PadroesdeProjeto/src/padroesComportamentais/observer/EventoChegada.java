package padroesComportamentais.observer;

public class EventoChegada {
    private final Boolean chegou;

    public EventoChegada(Boolean chegou) {
        this.chegou = chegou;
    }

    public Boolean getChegou() {
        return chegou;
    }
}
