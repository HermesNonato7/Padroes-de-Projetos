package padroesComportamentais.strategy.strategies;

public class SubtractionOperation implements OperationStrategy {

	@Override
	public int calculate(int numero1, int numero2) {
		return numero1 - numero2;
	}

}
