package serenity.v2.widgets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static org.openqa.selenium.By.xpath;

public class MITPageWidgetImpl extends WidgetObjectImpl implements MITPageWidget {
    public static final String SEARCH_BOX = "//input[@class='w-100']";
    public static final String SEARCH_BUTTON = "//button[contains(text(),'Search')]";

    public MITPageWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }


    public WebDriver getDriver(){
        return this.getPage().getDriver();
    }

    public WebElementFacade getElement(String xPath) {
        return getPage().find(xpath(xPath));
    }

    @Override
    public void type_keyword(String keyword) {

        this.getElement(SEARCH_BOX).type(keyword);

    }

    @Override
    public void click_search_btn() {
        this.getElement(SEARCH_BUTTON).click();

    }
}
