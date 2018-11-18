package QATest.features;

import QATest.challenge.Challenges;
import QATest.questions.ExampleButtonText;
import QATest.questions.NumOfCupsPerDay;
import QATest.questions.QAEngineerText;
import QATest.tasks.*;
import QATest.tasks.challenge_one.Checkbox;
import QATest.tasks.challenge_one.ClickMeButton;
import QATest.tasks.challenge_one.LanguageDropdown;
import QATest.questions.RubiconLogo;
import QATest.tasks.challenge_two.HoverOverMeDropdown;
import QATest.tasks.challenge_two.QAEngineerButton;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class ChallengeTest {

    Actor user = Actor.named("User");

    @Managed(uniqueSession = true)
    public WebDriver browser;

    @Steps
    OpenTheHomePage openTheHomePage;

    @Before
    public void canBrowseTheWeb() {
        user.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void exampleTest() {

        givenThat(user).wasAbleTo(openTheHomePage);

        when(user).attemptsTo(ExampleButton.click());

        then(user).should(eventually(seeThat(new ExampleButtonText(), equalTo("Clicked."))));
    }

    @Test
    public void ChallangeOne() {

        givenThat(user).wasAbleTo(openTheHomePage);

        when(user).attemptsTo(NavigateTo.challenges(Challenges.challengeone));
        when(user).attemptsTo(Checkbox.click());
        when(user).attemptsTo(LanguageDropdown.click());
        when(user).attemptsTo(ClickMeButton.click());

        then(user).should(eventually(seeThat(new RubiconLogo(user), equalTo(true))));
    }

    @Test
    public void ChallengeTwo() {

        givenThat(user).wasAbleTo(openTheHomePage);

        when(user).attemptsTo(NavigateTo.challenges(Challenges.challengetwo));
        when(user).attemptsTo(HoverOverMeDropdown.click());
        when(user).attemptsTo(QAEngineerButton.click());

        then(user).should(eventually(seeThat(new QAEngineerText(), equalTo("QA Engineer"))));
    }

    @Test
    public void ChallengeThree() {

        givenThat(user).wasAbleTo(openTheHomePage);

        when(user).attemptsTo(NavigateTo.challenges(Challenges.challengethree));

        then(user).should(eventually(seeThat(new NumOfCupsPerDay(1), equalTo("30"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(2), equalTo("12"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(3), equalTo("37"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(4), equalTo("17"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(5), equalTo("18"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(6), equalTo("40"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(7), equalTo("47"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(8), equalTo("43"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(9), equalTo("32"))));
        then(user).should(eventually(seeThat(new NumOfCupsPerDay(10), equalTo("6"))));
    }
}