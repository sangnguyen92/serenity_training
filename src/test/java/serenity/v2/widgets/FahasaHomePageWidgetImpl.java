package serenity.v2.widgets;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static org.openqa.selenium.By.xpath;

public class FahasaHomePageWidgetImpl extends WidgetObjectImpl implements FahasaHomePageWidget {
    static final String SEARCH_URL = "https://www.fahasa.com/";
    public static final String SEARCH_BOX = "//input[@id='search_desktop']";
    public static final String SEARCH_BUTTON = "//span[@class='button-search fa fa-search']";

    public FahasaHomePageWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    @Override
    public void open_the_fahasa_page() {
        this.getDriver().navigate().to(SEARCH_URL);


    }



    @Override
    public void type_keyword(String keyword) {
      //  this.getElement("//*[@id='close-popup']").click();
        this.getElement(SEARCH_BOX).click();
        this.getElement(SEARCH_BOX).type(keyword);

    }

    @Override
    public void click_search_btn() {
        this.getElement(SEARCH_BOX).sendKeys(Keys.ENTER);

    }

    public WebDriver getDriver(){
        return this.getPage().getDriver();
    }

    public WebElementFacade getElement(String xPath) {
        return getPage().find(xpath(xPath));
    }
}
