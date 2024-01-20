package padroesEstruturais.proxy;

import padroesEstruturais.proxy.services.CaixaEletronicoService;
import padroesEstruturais.proxy.services.AgenciaService;
import padroesEstruturais.proxy.services.OperacoesService;

public class App {

	public static void main(String[] args) {
		System.out.println("Operações na Agencia...");
		OperacoesService agencia = new AgenciaService();
		agencia.deposito("001123456-9", 10000.00);
		agencia.saque("001123456-9", 5000.00);
		agencia.transferencia("001123456-9", "00656777-7", 500.00);

		System.out.println();

		System.out.println("Operações no caixa eletrônico...");
		OperacoesService caixaEletronico = new CaixaEletronicoService(agencia);
		caixaEletronico.deposito("001123456-9", 10000.00);
		caixaEletronico.saque("001123456-9", 5000.00);
		caixaEletronico.transferencia("001123456-9", "00656777-7", 500.00);
	}
}
