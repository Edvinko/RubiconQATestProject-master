package QATest.tasks.challenge_one;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkbox implements Task {

    @Step("User click on the challenge one checkbox")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Elements.CHECKBOX)
        );
    }

    public static Checkbox click() {
            return instrumented(Checkbox.class);
    }
}
