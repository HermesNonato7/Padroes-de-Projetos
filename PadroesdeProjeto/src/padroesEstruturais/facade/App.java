package padroesEstruturais.facade;

import padroesEstruturais.facade.services.ServicoFacade;

public class App {
    public static void main(String[] args) {
        ServicoFacade servicoFacade = new ServicoFacade();
        servicoFacade.executaServicoD();
    }
}