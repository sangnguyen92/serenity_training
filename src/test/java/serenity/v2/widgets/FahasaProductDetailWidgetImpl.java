package serenity.v2.widgets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static org.openqa.selenium.By.xpath;

public class FahasaProductDetailWidgetImpl extends WidgetObjectImpl implements FahasaProductDetailWidget {

    public static final String ADD_TO_CART_BUTTON = "//div[@class='product_view_add_box']//button[@class='btn-cart-to-cart']";
    public FahasaProductDetailWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    @Override
    public void add_to_cart() {
        this.getDriver().manage().window().maximize();
        this.getElement(ADD_TO_CART_BUTTON).click();

    }

    @Override
    public void add_quantity(String quantity) {

    }

    @Override
    public void check_out() {

    }
    public WebDriver getDriver(){
        return this.getPage().getDriver();
    }

    public WebElementFacade getElement(String xPath) {
        return getPage().find(xpath(xPath));
    }

}
