package QATest.ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class Elements {

    public static List<WebElementFacade> RUBICON_LOGO(Actor actor) {
        return BrowseTheWeb.as(actor).findAll(By.id("ch1img"));
    }

    // This is the elements located on the challenges pages
    public static Target EXAMPLE_BUTTON = Target.the("example button").located(By.id("ebtn"));
    public static Target CHECKBOX = Target.the("checkbox").located(By.id("ch1-checkbox"));
    public static Target LANGUAGE_DROPDOWN = Target.the("language dropdown menu").located(By.xpath("//*[@id=\"ch1-select\"]/option[2]"));
    public static Target CLICK_ME_BUTTON = Target.the("click me - clicked button").located(By.cssSelector("button[style='color: black;']"));

    public static Target HOVER_OVER_ME_DROPPDOWN = Target.the("hover over me dropdown menu").located(By.className("dropbtn"));
    public static Target QAENGINEERS_BUTTON = Target.the("qa engineers button").located(By.xpath("/html/body/section/div/div/a[2]"));


    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_ONE = Target.the("number of cups for bar chart one").located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(1) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_TWO = Target.the("number of cups for bar chart two")
            .located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(2) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_THREE = Target.the("number of cups for bar chart three").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(3) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_FOUR = Target.the("number of cups for bar chart four").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(4) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_FIVE = Target.the("number of cups for bar chart fice").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(5) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_SIX = Target.the("number of cups for bar chart six").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(6) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_SEVEN = Target.the("number of cups for bar chart seven").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(7) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_EIGHT = Target.the("number of cups for bar chart eight").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(8) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_NINE = Target.the("number of cups for bar chart nine").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(9) > text > tspan.highcharts-text-outline"));
    public static Target NUMBER_OF_CUPS_FOR_BAR_CHART_TEN = Target.the("number of cups for bar chart ten").
            located(By.cssSelector
            ("g.highcharts-data-labels.highcharts-series-0.highcharts-column-series.highcharts-color-0.highcharts-tracker > " +
                    "g:nth-child(10) > text > tspan.highcharts-text-outline"));
}
