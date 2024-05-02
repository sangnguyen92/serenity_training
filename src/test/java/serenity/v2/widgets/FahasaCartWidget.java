package serenity.v2.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FahasaCartWidgetImpl.class)
public interface FahasaCartWidget extends WidgetObject {
    void open_cart();
    int get_quantity_of_item();
    int get_price_of_item();
    int get_total_of_order();
    boolean isTotalCorrect();


}
