package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AllPage;
import utilities.ConstantUtils;

public class AllPageStepDefinition extends WebConnector {

    AllPage Page = new AllPage();

    @Given("the user navigate to Amazon Uk homepage")
    public void the_user_navigate_to_amazon_uk_homepage() {
        driver.get(ConstantUtils.BASE_URL);
        Page.setCookiesxpath();

    }
    @Then("the user click on all button")
    public void the_user_click_on_all_button() {
        Page.setAllxpath();

    }
    @Then("the user navigate to Electronics & Computers")
    public void the_user_navigate_to_electronics_computers() {
        Page.setElectronicsandComputersxpath();
    }


    @When("the user navigate to Phones and Accessories")
    public void theUserNavigateToPhonesAndAccessories() {
        Page.setPhonesandAccessoriesxpath();
    }

    @Then("the user should land on {string}  Page")
    public void theUserShouldLandOnPage(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }



}



