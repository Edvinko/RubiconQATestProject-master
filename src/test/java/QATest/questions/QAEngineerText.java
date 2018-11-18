package QATest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;
import org.openqa.selenium.By;

@Subject("the text of the qaengineers button")
public class QAEngineerText implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(By.xpath("/html/body/section/div/button")).getText();

        //return Text.of(Elements.QAENGINEERS_BUTTON).viewedBy(actor).asString();
    }
}
