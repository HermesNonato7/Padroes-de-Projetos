package padroesCriacionais.prototype;

public class Animacao implements Cloneable {
    String objeto;

    public Animacao(String objeto) {
        this.objeto = objeto;
    }

    public void imprime() {
        System.out.println("");
        System.out.println(objeto);
    }

    public void moverEsquerda() {
        objeto = objeto.substring(1);
    }

    public void moverDireita() {
        objeto = " " + objeto;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
