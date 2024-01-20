package padroesEstruturais.facade.services;

/*
    Como posso simplificar o acesso a um sistema complexo utilizando uma interface simples?

	Como posso reduzir a complexidade interna de um sistema para o cliente (um outro sistema)?

	Solução: Definir uma fachada de provisiona uma interface única para um conjunto de interfaces de um sistema.

	O Padrão Facade (faixada) simplifica o acesso a um sistema ou subsistema ele nos permite desconectar
	a implementação do cliente de qualquer subsistema.

	Desta forma, se quisermos acrescentar novas funcionalidades no subsistema só teremos que alterar a Facade
	ao invés de alterar diversos pontos do sistema.

*/
public class ServicoFacade {
    public void executaServicoA() {
        new ServicoComplexoA().executa();
    }

    public void executaServicoB() {
        new ServicoComplexoB().executa();
    }

    public void executaServicoC() {
        new ServicoComplexoC().executa();
    }

    public void executaServicoD() {
        new ServicoComplexoA().executa();
        new ServicoComplexoB().executa();
        new ServicoComplexoC().executa();
    }
}
