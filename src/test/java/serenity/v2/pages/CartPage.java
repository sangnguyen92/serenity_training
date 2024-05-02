package serenity.v2.pages;

import net.serenitybdd.core.pages.PageObject;
import serenity.v2.widgets.FahasaCartWidget;
import serenity.v2.widgets.FahashaResultWidget;

public class CartPage extends PageObject {
    private FahasaCartWidget fahasaCartWidget;

    public FahasaCartWidget getFahasaCartWidget() {
        return fahasaCartWidget;
    }
}
