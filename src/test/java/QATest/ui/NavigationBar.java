package QATest.ui;

import QATest.challenge.Challenges;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBar {

    public static Target challenge(Challenges challenges) {
        return Target.the(challenges.name() + " challenges")
                .locatedBy("/html/body/nav/li[{0}]/a")
                .of(String.valueOf(challenges.ordinal() + 1));
    }
}
