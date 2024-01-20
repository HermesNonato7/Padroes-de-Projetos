package padroesComportamentais.memento;

public class Editor {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Memento save() {
        return new EditorEstado(this.texto);
    }

    public void restore(Memento memento) {
        this.texto = memento.getTexto();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
