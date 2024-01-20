package padroesEstruturais.mediator.model;

import padroesEstruturais.mediator.mediator.Mediator;

public final class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, mediator, Language.PORTUGUESE);
    }

}
