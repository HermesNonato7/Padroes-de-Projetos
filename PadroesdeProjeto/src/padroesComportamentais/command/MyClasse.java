package padroesComportamentais.command;

public class MyClasse implements MyCommand {
    @Override
    public void execute() {
        System.out.println("faz alguma coisa...");
    }

    @Override
    public void undo() {
        System.out.println("desfaz alguma coisa...");
    }
}
