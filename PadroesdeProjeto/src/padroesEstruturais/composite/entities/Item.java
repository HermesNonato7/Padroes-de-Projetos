package padroesEstruturais.composite.entities;


/*
    Padrão Composite: Compor objetos em estruturas de árvore para representar hierarquias parte/todo.

	Para ficar mais claro uma estrutura de árvore seria um objeto dentro de outro objeto dentro de objeto e por aí vai...

	Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composição de objetos.

	Pode ser uma solução para estruturas complexas que podem ser tratadas de maneira uniforme,
	isso significa que é possível chamar o mesmo método seja na estrutura ou com um objeto só.

	Objetos composite são objetos que tem filhos também podemos chamar de nó
	e objetos que não tem filhos são chamados de folha (leaf).
 */
public interface Item {
    Double valor();
}
