package padroesCriacionais.prototype;

import java.util.HashMap;
import java.util.Map;

/*
    A utilização do padrão Prototype é útil quando queremos clonar um objeto.
    Ou seja, quando a aplicação precisa criar cópias exatas de algum objeto em tempo de execução
    este padrão é altamente recomendado.

    O padrão Prototype permite que você use um conjunto de objetos pré construídos,
    configurados de diversas formas, como protótipos (modelos).

    Ao invés de instanciar uma subclasse que coincide com alguma configuração,
    o cliente pode simplesmente procurar por um protótipo apropriado e cloná-lo e desta forma você
    consegue criar um novo objeto aproveitando o estado previamente existente do outro objeto.
 */
public class Prototipo {
    private Map<String, Animacao> modelo;

    public Prototipo() {
        modelo = new HashMap<>();
        lerModelo();
    }

    private void lerModelo() {
        modelo.put("modelo", new Animacao("        *          "));
    }

    public Animacao getModelo() {
        return modelo.get("modelo");
    }
}
