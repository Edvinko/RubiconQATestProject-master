package QATest.tasks;

import QATest.challenge.Challenges;
import QATest.ui.ChallengesHomePage;
import QATest.ui.NavigationBar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class NavigateTo implements Task {

    private final Challenges challenges;

    private ChallengesHomePage challengesHomePage;

    public NavigateTo(Challenges challenges) {
        this.challenges = challenges;
    }

    @Override
    @Step
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(challengesHomePage),
                Click.on(NavigationBar.challenge(challenges))
        );
    }
    public static Performable challenges(Challenges challenges) {
        return Instrumented.instanceOf(NavigateTo.class).withProperties(challenges);
    }
}
