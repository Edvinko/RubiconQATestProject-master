package QATest.questions;

import QATest.ui.Elements;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;

public class RubiconLogo implements Question<Boolean> {

    private Actor actor;

    public RubiconLogo(Actor actor) {
        this.actor = actor;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RubiconLogoPresent();
    }

    public boolean RubiconLogoPresent() {
        List<WebElementFacade> rubiconLogoPresent = Elements.RUBICON_LOGO(actor);
        return rubiconLogoPresent.get(0).isDisplayed();
    }
}
