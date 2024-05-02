package serenity.v2.widgets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static org.openqa.selenium.By.xpath;

public class MainSearchWidgetImpl extends WidgetObjectImpl implements MainSearchWidget {
    public static final String SEARCH_URL = "https://google.com";
    public static final String SEARCH_BOX = "//textarea[1]";
    public static final String SEARCH_BUTTON = "//input[contains(@value, 'Tìm trên Google')]";
    public static final String MIT_PAGE = "//cite[1]";

    public MainSearchWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }
    @Override
    public void open_the_google_search() {
     //   this.getDriver().manage().window().maximize();
        this.getDriver().navigate().to(SEARCH_URL);

    }

    @Override
    public void type_keyword(String keyword) {
//        this.getDriver().findElement(By.xpath(SEARCH_BOX)).sendKeys(keyword);
        this.getElement(SEARCH_BOX).type(keyword);

    }

    @Override
    public void click_search_btn() {
        this.getElement(SEARCH_BUTTON).click();
    }

    @Override
    public void access_page() {
        this.getElement(MIT_PAGE).click();
    }

    public WebDriver getDriver(){
        return this.getPage().getDriver();
    }

    public WebElementFacade getElement(String xPath) {
        return getPage().find(xpath(xPath));
    }

}