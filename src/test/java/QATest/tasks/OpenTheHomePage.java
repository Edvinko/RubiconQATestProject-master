package QATest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import QATest.ui.ChallengesHomePage;

public class OpenTheHomePage implements Task {

    ChallengesHomePage challengesHomePage;

    @Step("Open the application (example test as default)")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(challengesHomePage)
        );
    }
}
