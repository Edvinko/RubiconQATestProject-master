package QATest.tasks.challenge_two;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HoverOverMeDropdown implements Task {
    @Step("User hover on dropdown")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Elements.HOVER_OVER_ME_DROPPDOWN)
        );
    }

    public static HoverOverMeDropdown click() {
        return instrumented(HoverOverMeDropdown.class);
    }
}
