package padroesEstruturais.bridge.converters;

import padroesEstruturais.bridge.entities.Conta;

import java.util.Locale;

public class CSVConverter implements Converter {
	@Override
	public String getFormated(Conta conta) {
		return String.format(Locale.US, "%s,%s,%s,%s",
				conta.getNomeCliente(),
				conta.getAgencia(),
				conta.getConta(),
				conta.getSaldo());
	}
}
