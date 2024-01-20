package padroesComportamentais.command;

public class App {
    public static void main(String[] args) {
        MyCommand myCommand = new MyClasse();
        myCommand.execute();
        myCommand.undo();
    }
}