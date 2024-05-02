package serenity.v2.steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import serenity.v2.pages.CartPage;
import serenity.v2.pages.FahasaHomePage;
import serenity.v2.pages.FahasaProductDetailPage;
import serenity.v2.pages.FahasaResultPage;

public class FahasaShopSteps {
    FahasaHomePage fahasaHomePage;
    FahasaResultPage fahasaResultPage;
    FahasaProductDetailPage fahasaProductDetailPage;
    CartPage cartPage;

    @Step
    public void access_fahasa_homepage(){
        fahasaHomePage.open();
        fahasaHomePage.getFahasaHomePageWidget().open_the_fahasa_page();

    }
    @Step
    public void search_for_keyword(String keyword){
        fahasaHomePage.getFahasaHomePageWidget().type_keyword(keyword);

    }
    @Step
    public void click_search_btn(){
        fahasaHomePage.getFahasaHomePageWidget().click_search_btn();
    }

    @Step
    public void access_item(){
        fahasaResultPage.getFahashaResultWidget().access_item();

    }
    @Step
    public void add_to_cart(){
        fahasaProductDetailPage.getFahasaProductDetailWidget().add_to_cart();

    }

    @Step
    public void go_to_cart(){
        cartPage.getFahasaCartWidget().open_cart();
    }

    @Step
    public void check_order(){
        Assert.assertTrue("All information of this order is correct.",cartPage.getFahasaCartWidget().isTotalCorrect());
    }


}
