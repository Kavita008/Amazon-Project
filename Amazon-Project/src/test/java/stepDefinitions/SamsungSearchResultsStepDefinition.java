package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.SamsungSearchResultsPage;

import javax.swing.*;

public class SamsungSearchResultsStepDefinition extends WebConnector {

    SamsungSearchResultsPage Page = new SamsungSearchResultsPage();

    @Then("the user click on Mobile Phones & Smartphones")
    public void the_user_click_on_mobile_phones_smartphones() {
        Page.setMobilePhonesandSmartPhonesxpath();
    }

    @And("the user click on samsung box under featured brands")
    public void theUserClickOnSamsungBoxUnderFeaturedBrands() {
        Page.setSamsungxpath();
    }

    @And("user apply filter for Model Year {int}")
    public void userApplyFilterForModelYear(int year2023) {
        Page.setModelYearxpath(year2023);
    }

    @And("user apply filter for Camera Resolution {int} MP and above")
    public void userApplyFilterForCameraResolutionMPAndAbove(int MPandabove) {
        Page.setCameraResolutionxpath(MPandabove);

    }
    @And("user apply filter for Price Range between £{int} - £{int} under Price")
    public void userApplyFilterForPriceRangeBetween££UnderPrice(int pricerange50, int pricerange100) {
    Page.setMinpricerangexpath(pricerange50);
    Page.setMaxpricerangexpath(pricerange100);

    }

    @And("user click on go")
   public void userClickOnGo() {
        Page.setGoxpath();
}

   @Then("user should see a {string} that match the criteria")
   public void user_should_see_a_that_match_the_criteria(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }




}







