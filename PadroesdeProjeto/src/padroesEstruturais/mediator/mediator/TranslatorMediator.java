package padroesEstruturais.mediator.mediator;

import padroesEstruturais.mediator.model.User;
import padroesEstruturais.mediator.services.Translator;

public class TranslatorMediator extends Mediator {

    private Translator translator = new Translator();

    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
