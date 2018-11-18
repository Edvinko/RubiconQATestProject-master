package QATest.tasks.challenge_one;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LanguageDropdown implements Task {
    @Step("User click and choose element from language dropdown menu")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Elements.LANGUAGE_DROPDOWN)
        );
    }
    public static LanguageDropdown click() {
        return instrumented(LanguageDropdown.class);
    }
}
