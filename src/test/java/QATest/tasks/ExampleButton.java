package QATest.tasks;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ExampleButton implements Task {

    @Step("User clicks on the example button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Elements.EXAMPLE_BUTTON)
        );
    }

    public static ExampleButton click() {
        return instrumented(ExampleButton.class);
    }
}
