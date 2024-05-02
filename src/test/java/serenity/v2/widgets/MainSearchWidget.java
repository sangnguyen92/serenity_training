package serenity.v2.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(MainSearchWidgetImpl.class)
public interface MainSearchWidget extends WidgetObject {
    void open_the_google_search();
    void type_keyword(String keyword);
    void click_search_btn();
    void access_page();
}
