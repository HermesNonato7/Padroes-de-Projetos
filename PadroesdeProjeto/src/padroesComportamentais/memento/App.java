package padroesComportamentais.memento;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();
        editor.setTexto("Eu");
        caretaker.add(editor.save());
        editor.setTexto("Eu estou");
        caretaker.add(editor.save());
        editor.setTexto("Eu estou aprendendo padrões");
        caretaker.add(editor.save());
        System.out.println(caretaker.getHistoryList());
        System.out.println("Última alteração -> " + editor);
        editor.restore(caretaker.get(0));
        System.out.println("Primeira alteração -> " + editor);
        editor.restore(caretaker.get(1));
        System.out.println("Segunda alteração -> " + editor);
    }
}