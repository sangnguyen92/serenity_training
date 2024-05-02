package serenity.v2.widgets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static org.openqa.selenium.By.xpath;

public class FahasaResultWidgetImpl  extends WidgetObjectImpl implements FahashaResultWidget {
    static final String ITEM = "//div[@class='item-inner'][1]";

    public FahasaResultWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    @Override
    public void access_item() {
        this.getElement(ITEM).click();

    }
    public WebDriver getDriver(){
        return this.getPage().getDriver();
    }

    public WebElementFacade getElement(String xPath) {
        return getPage().find(xpath(xPath));
    }


}
