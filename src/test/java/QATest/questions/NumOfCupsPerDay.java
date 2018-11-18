package QATest.questions;

import QATest.ui.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NumOfCupsPerDay implements Question<String> {

    private int dayOrdinal;

    public NumOfCupsPerDay(int dayOrdinal) {
        this.dayOrdinal = dayOrdinal;
    }

    @Override
    public String answeredBy(Actor actor) {
        return numOfCupsPerDay(actor);
    }

    private String numOfCupsPerDay(Actor actor) {
        switch(dayOrdinal) {
            case 1: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_ONE).viewedBy(actor).asString();
            case 2: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_TWO).viewedBy(actor).asString();
            case 3: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_THREE).viewedBy(actor).asString();
            case 4: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_FOUR).viewedBy(actor).asString();
            case 5: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_FIVE).viewedBy(actor).asString();
            case 6: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_SIX).viewedBy(actor).asString();
            case 7: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_SEVEN).viewedBy(actor).asString();
            case 8: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_EIGHT).viewedBy(actor).asString();
            case 9: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_NINE).viewedBy(actor).asString();
            case 10: return Text.of(Elements.NUMBER_OF_CUPS_FOR_BAR_CHART_TEN).viewedBy(actor).asString();
            default: return "";
        }
    }
}
