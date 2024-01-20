package padroesComportamentais.memento;

public class EditorEstado implements Memento {
    private String texto;

    public EditorEstado(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "EditorEstado{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
