package serenity.v2.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(MITPageWidgetImpl.class)
public interface MITPageWidget extends WidgetObject {
    void type_keyword(String keyword);
    void click_search_btn();
}
