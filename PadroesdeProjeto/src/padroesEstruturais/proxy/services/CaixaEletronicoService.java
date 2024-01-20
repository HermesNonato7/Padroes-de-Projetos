package padroesEstruturais.proxy.services;
/*
Como posso controlar o acesso a algum objeto?

Como posso adicionar funcionalidades durante o acesso a algum objeto?

Solução: utilizar uma estrutura de proxy para atuar como se fosse um outro objeto.

O padrão Proxy tem como objetivo proporcionar um espaço reservado para que outro objeto controle o acesso a ele.

Tipos de proxy:
	Remote proxy: Utilizado para encapsular os recursos de rede de forma que os objetos desconhecem o método de comunicação;
	Virtual proxy: Utilizado para fazer um carregamento tardio de um determinado recurso;
	Protection proxy: Utilizado para ser uma camada de segurança;
	Smart proxy: Utilizado quando é desejado adicionar ou limitar funcionalidades;


*/
public class CaixaEletronicoService implements OperacoesService {
	private OperacoesService bancoService;

	public CaixaEletronicoService(OperacoesService bancoService) {
		this.bancoService = bancoService;
	}

	@Override
	public void deposito(String conta, Double valor) {
		this.bancoService.deposito(conta, valor);
	}

	@Override
	public void saque(String conta, Double valor) {
		if(valor >= 500) {
			System.out.println("Saque máximo permitido 500,00! Para saques maiores favor ir na agência mais próxima.");
			return;
		}
		this.bancoService.saque(conta, valor);
	}

	@Override
	public void transferencia(String contaOrigem, String contaDestino, Double valor) {
		System.out.println("Transferência não autorizada, favor ir na agência mais próxima.");
	}
}
