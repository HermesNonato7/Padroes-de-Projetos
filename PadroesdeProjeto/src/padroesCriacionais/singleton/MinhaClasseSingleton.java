package padroesCriacionais.singleton;

/*
    A utilização do padrão Singleton é útil quando você precisa TER GARANTIDO a criação de uma
    única instância de uma determinada classe para utilizar de forma global no seu projeto.

    Ao utilizar o Singleton temos mais controle sobre o acesso às propriedades e métodos de uma classe,
    e também reduzimos o consumo de memória desnecessário por utilizar várias instâncias
    desta classe.

    Obs.: Ao usar um Singleton você está acoplando o código a uma implementação estática e específica e ferindo
    o princípio do S.O.L.I.D. - > "Dependency Inversion Principle" -> Dependa de abstrações e não de
    implementações. Use o padrão com cautela!
*/
public class MinhaClasseSingleton {
    private static MinhaClasseSingleton meuObjetoUnico = new MinhaClasseSingleton();

    //O construtor deve ser private
    private MinhaClasseSingleton() {
        //faz algo...
    }

    public static MinhaClasseSingleton getInstance() {
        return meuObjetoUnico;
    }

    public void metodoA () {
        //faz algo...
    }

    public void metodoB () {
        //faz algo...
    }
}
