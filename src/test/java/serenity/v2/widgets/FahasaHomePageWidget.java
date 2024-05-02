package serenity.v2.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FahasaHomePageWidgetImpl.class)
public interface FahasaHomePageWidget extends WidgetObject {
    void open_the_fahasa_page();
    void type_keyword(String keyword);
    void click_search_btn();

}
