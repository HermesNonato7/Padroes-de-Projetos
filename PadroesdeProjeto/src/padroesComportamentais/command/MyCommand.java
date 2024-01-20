package padroesComportamentais.command;

/*
    Padrão Command: Encapsular uma requisição como um objeto, permitindo que clientes parametrizem diferentes requisições,
    filas ou requisições de log, e suportar operações reversíveis.

    Vantagens em usar o padrão Command:

	O padrão Command desacopla o objeto que invoca a operação daquele que sabe como executá-la;
	O padrão Command reduz o acoplamento (dependência) entre o objeto que chama a operação e o objeto que executa a operação;
*/
public interface MyCommand {
    void execute();
    void undo();
}
