package serenity.v2.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FahasaResultWidgetImpl.class)
public interface FahashaResultWidget extends WidgetObject {
    void access_item();

}
