package QATest.tasks.challenge_one;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickMeButton implements Task {
    @Step("User click on Click Me button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Elements.CLICK_ME_BUTTON)
        );
    }

    public static ClickMeButton click() {
        return instrumented(ClickMeButton.class);
    }
}
