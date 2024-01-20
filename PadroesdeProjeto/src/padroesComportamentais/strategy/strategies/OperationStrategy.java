package padroesComportamentais.strategy.strategies;
/*
  Problema: Como uma classe pode utilizar um algoritmo definido dinamicamente?
            Como posso selecionar e trocar uma lógica em tempo de execução?

  Solução: Encapsular os algoritmos possíveis para o mesmo problema em uma estrutura de strategy.
           O cliente irá delegar a execução para estas estratégias ao invés de possuir toda a lógica internamente.

  Padrão Strategy: Definir uma família de algoritmos, encapsular cada um e fazê-los intercambiáveis.
                   Strategy permite que algoritmos mudem independentemente entre clientes que os utilizam.
*/
public interface OperationStrategy {
	int calculate(int numero1, int numero2);
}
