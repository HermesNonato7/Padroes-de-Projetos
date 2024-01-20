package padroesComportamentais.observer;

public class Passageiro implements ParteInteressada {
    private String nome;
    private Boolean chegou;

    public Passageiro(String nome) {
        this.nome = nome;
        chegou = false;
    }

    @Override
    public void notificar(EventoChegada evento) {
        chegou = evento.getChegou();
    }

    @Override
    public void run() {
        while(chegou == false){
            System.out.println(nome + " está no celular jogando...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " diz: Agora que cheguei poderei fazer outra coisa...");
    }
}