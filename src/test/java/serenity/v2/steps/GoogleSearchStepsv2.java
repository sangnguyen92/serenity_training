package serenity.v2.steps;


import net.serenitybdd.annotations.Step;
import serenity.v2.pages.GoogleHomePagev2;
import serenity.v2.pages.MITPage;

public class GoogleSearchStepsv2 {
    GoogleHomePagev2 gHomePagev2;
    MITPage mitPage;

    @Step
    public void access_google_search(){
        gHomePagev2.open();
        gHomePagev2.getMainSearchWidget().open_the_google_search();
    }

    @Step
    public void search_for_keyword(String keyword) {
        gHomePagev2.getMainSearchWidget().type_keyword(keyword);
        gHomePagev2.getMainSearchWidget().click_search_btn();
    }

    @Step
    public void click_search_btn() {
        gHomePagev2.getMainSearchWidget().click_search_btn();
    }

    @Step
    public void type_keyword(String keyword) {
        gHomePagev2.getMainSearchWidget().type_keyword(keyword);
    }

    @Step
    public void access_item(){
        gHomePagev2.getMainSearchWidget().access_page();
    }
    @Step
    public void type_keyword2(String keyword) {
        mitPage.getMitPagetWidget().type_keyword(keyword);
    }
    @Step
    public void click_search(){
        mitPage.getMitPagetWidget().click_search_btn();
}


}
