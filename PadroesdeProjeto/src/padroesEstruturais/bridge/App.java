package padroesEstruturais.bridge;

import padroesEstruturais.bridge.converters.CSVConverter;
import padroesEstruturais.bridge.converters.Converter;
import padroesEstruturais.bridge.converters.JsonConverter;
import padroesEstruturais.bridge.entities.Conta;
import padroesEstruturais.bridge.entities.ContaCorrente;
import padroesEstruturais.bridge.entities.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        Conta contaCorrente = new ContaCorrente("001", "123", 8000d, "Marcos");
        Conta contaPoupanca = new ContaPoupanca("002", "456", 9000d, "Rodrigo");

        System.out.println(csvConverter.getFormated(contaCorrente));
        System.out.println(jsonConverter.getFormated(contaCorrente));
        System.out.println(csvConverter.getFormated(contaPoupanca));
        System.out.println(jsonConverter.getFormated(contaPoupanca));
    }
}
