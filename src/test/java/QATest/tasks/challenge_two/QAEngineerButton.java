package QATest.tasks.challenge_two;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class QAEngineerButton implements Task {
    @Step("User click on QAEngineers button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Elements.QAENGINEERS_BUTTON)
        );
    }
    public static QAEngineerButton click() {
        return instrumented(QAEngineerButton.class);
    }
}
