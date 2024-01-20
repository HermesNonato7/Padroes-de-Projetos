package padroesEstruturais.mediator.mediator;

import padroesEstruturais.mediator.model.User;
import java.util.HashMap;
import java.util.Map;
/*
   Como posso reduzir o acoplamento entre objetos que precisam se comunicar?

   Como posso deixar a interação entre objetos mais dinâmica?

   Solução: utilizar uma estrutura de mediador para encapsular a forma em que os objetos se comunicarão.

   Os objetos não precisam nem se conhecer, toda a interação será realizada pelo mediator.

   O padrão sugere definir um objeto que encapsula como um conjunto de objetos interagem.

   Mediator promove acoplamento fraco ao manter objetos que não se referem um ao outro explicitasmente, permitindo
   variar sua interação independentemente.
*/
public abstract class Mediator {
    protected Map<String, User> users = new HashMap<String, User>();

    public void addUser(User user) {
        System.out.println(String.format("'%s' está na sala", user.getName()));
        users.put(user.getName(), user);
    }

    public void removeUser(User user) {
        System.out.println(String.format("'%s' saiu", user.getName()));
        users.remove(user.getName());
    }

    public void sendMessage(String message, User to, User from) {
        if (to == null) {
            for (User user : users.values()) {
                if (user.getName() == from.getName())
                    continue;
                user.receiveMessage(getMessage(message, user, from), from);
            }
        } else {
            to.receiveMessage(getMessage(message, to, from), from);
        }
    }

    protected abstract String getMessage(String message, User to, User from);
}

