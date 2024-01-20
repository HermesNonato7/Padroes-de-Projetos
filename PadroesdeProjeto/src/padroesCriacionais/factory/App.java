package padroesCriacionais.factory;

public class App {
    public static void main (String [] args) {
        Dao dao = DaoFactory.createPizzaDao();
        dao.insert("");
    }
}
