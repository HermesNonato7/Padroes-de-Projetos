package padroesComportamentais.observer;
/*
    Padrão Observer (Conhecido também como event handler, Listener): é responsável por observar e notificar
    a mudança de estado entre objetos distintos através de uma dependência um-para-muitos.
*/
public interface ParteInteressada extends Runnable {
    void notificar(EventoChegada evento);
}
