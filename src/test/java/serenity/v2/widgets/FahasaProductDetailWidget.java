package serenity.v2.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FahasaProductDetailWidgetImpl.class)
public interface FahasaProductDetailWidget extends WidgetObject {
    void add_to_cart();

    void add_quantity(String quantity);

    void check_out();
}
