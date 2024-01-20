package padroesCriacionais.factory;

import padroesCriacionais.factory.impl.PizzaDao;

/*
    A utilização do padrão Factory é útil para você criar objetos dinamicamente sem conhecer
    a complexidade da implementação, mas somente a sua interface.

    O padrão factory estabelece uma forma de desenvolver objetos que são responsáveis pela criação de outros objetos.
*/
public class DaoFactory {
    public static Dao createPizzaDao() {
        Dao dao = new PizzaDao();
        //faz algo, configura, etc.
        return dao;
    }
}
