package serenity.v2.widgets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static org.openqa.selenium.By.xpath;

public class FahasaCartWidgetImpl extends WidgetObjectImpl implements FahasaCartWidget {
    static final String CART_URL= "//div[@class='fhs_top_cart']";

    static final String quantity_of_item="//input[@class='qty-carts']";
    static final String price_of_item="//div[@class='cart-fhsItem-price']//div//span[1]";
    static final String total_of_order="//div[@class='cart-price-total']//span//span";

    public FahasaCartWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    @Override
    public void open_cart() {
        this.getElement(CART_URL).click();
    }

    @Override
    public int get_quantity_of_item() {
        String quty = this.getElement(quantity_of_item).getValue();

        return Integer.parseInt(quty);
    }

    @Override
    public int get_price_of_item() {
        String price = this.getElement(price_of_item).getText();

        String[] split = price.split(" ");
        return Integer.parseInt(split[0].replace(".", ""));
    }

    @Override
    public int get_total_of_order() {
        String total = getElement(total_of_order).getText();
        String[] split = total.split(" ");

        return Integer.parseInt(split[0].replace(".", ""));
    }


    @Override
    public boolean isTotalCorrect() {
        int quty = get_quantity_of_item();

        int price = get_price_of_item();

        int total = quty*price;

        int total_in_cart = get_total_of_order();

        if (total_in_cart==total){
            return true;
        }else return false;
    }
    public WebDriver getDriver(){
        return this.getPage().getDriver();
    }

    public WebElementFacade getElement(String xPath) {
        return getPage().find(xpath(xPath));
    }

}
