package padroesEstruturais.bridge.converters;

import padroesEstruturais.bridge.entities.Conta;

public class JsonConverter implements Converter {
	@Override
	public String getFormated(Conta conta) {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n")
			.append("\t\"nomeCliente\": \"").append(conta.getNomeCliente()).append("\",\n")
			.append("\t\"agencia\": \"").append(conta.getAgencia()).append("\",\n")
			.append("\t\"conta\": \"").append(conta.getConta()).append("\",\n")
			.append("\t\"saldo\": \"").append(conta.getSaldo()).append("\"\n")
		.append("}");

		return builder.toString();
	}
}
