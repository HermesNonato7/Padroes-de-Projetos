package padroesEstruturais.mediator.model;

import padroesEstruturais.mediator.mediator.Mediator;

public abstract class User {
    final protected String name;
    final protected Language language;
    final protected Mediator mediator;

    public User(String name, Mediator mediator, Language language) {
        this.name = name;
        this.mediator = mediator;
        this.language = language;
    }

    public String getName() {
        return name;
    }
    public Language getLanguage() {
        return language;
    }

    public void sendMessage(String message) {
        this.sendMessage(message, null);
    }

    public void sendMessage(String message, User to) {
        String receiverName = to != null ? to.getName() : "Todos";
        System.out.println(String.format("'%s' envia mensagem '%s' para '%s'", name, message, receiverName));
        mediator.sendMessage(message, to, this);
    }

    public void receiveMessage(String message, User from) {
        System.out.println(String.format("'%s' recebeu amansagem '%s' de '%s'", name, message, from.getName()));
    }
}

