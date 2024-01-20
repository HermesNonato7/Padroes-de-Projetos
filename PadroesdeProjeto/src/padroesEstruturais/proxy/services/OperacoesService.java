package padroesEstruturais.proxy.services;

public interface OperacoesService {
	void deposito(String conta, Double valor);
	void saque(String conta, Double valor);
	void transferencia(String contaOrigem, String contaDestino, Double valor);
}
