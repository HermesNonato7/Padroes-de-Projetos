package padroesEstruturais.proxy.services;

public class AgenciaService implements OperacoesService {

	@Override
	public void deposito(String conta, Double valor) {
		System.out.println("Depósito efetuado no valor de " + valor);
	}

	@Override
	public void saque(String conta, Double valor) {
		System.out.println("Saque efetuado no valor de " + valor);
	}

	@Override
	public void transferencia(String contaOrigem, String contaDestino, Double valor) {
		System.out.printf("Tranferência de %.2f efetuada com sucesso!%n", valor);
	}
}
