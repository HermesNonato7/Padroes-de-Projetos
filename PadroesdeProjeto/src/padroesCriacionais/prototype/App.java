package padroesCriacionais.prototype;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Animacao> quadros = new ArrayList<>();

    public static void animar() throws InterruptedException {
        for(Animacao quadro : quadros) {
            quadro.imprime();
            Thread.sleep(50);
        }
    }

    public static Animacao addEsquerda(Animacao animacaoAtual) throws CloneNotSupportedException {
        Animacao animacao = (Animacao) animacaoAtual.clone();
        animacao.moverEsquerda();
        quadros.add(animacao);
        return animacao;
    }

    public static Animacao addDireita(Animacao animacaoAtual) throws CloneNotSupportedException {
        Animacao animacao = (Animacao) animacaoAtual.clone();
        animacao.moverDireita();
        quadros.add(animacao);
        return animacao;
    }

    public static void main(String [] args) throws CloneNotSupportedException, InterruptedException {
        Prototipo prototipo = new Prototipo();

        Animacao animacao = prototipo.getModelo();

        quadros.add(animacao);
        animacao = addEsquerda(animacao);
        animacao = addEsquerda(animacao);
        animacao = addEsquerda(animacao);
        animacao = addEsquerda(animacao);
        animacao = addEsquerda(animacao);
        animacao = addEsquerda(animacao);
        animacao = addEsquerda(animacao);

        animacao = addDireita(animacao);
        animacao = addDireita(animacao);
        animacao = addDireita(animacao);
        animacao = addDireita(animacao);
        animacao = addDireita(animacao);
        animacao = addDireita(animacao);
        animacao = addDireita(animacao);

        animar();
    }
}
