package serenity.v2.pages;


import net.serenitybdd.core.pages.PageObject;
import serenity.v2.widgets.MainSearchWidget;

public class GoogleHomePagev2 extends PageObject {
    private MainSearchWidget mainSearchWidget;

    public MainSearchWidget getMainSearchWidget() {
        return this.mainSearchWidget;
    }
}
