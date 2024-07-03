package pageObjects;

import browserControl.WebConnector;
import io.cucumber.messages.types.PickleStepArgument;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class AllPage extends WebConnector {

    /*****************   locators   ******************/

    private String cookiesxpath = "//input[@id='sp-cc-accept']";

    private String Allxpath = "//a[@id='nav-hamburger-menu']";

    private String ElectronicsandComputersxpath = "//DIV[normalize-space(.)='Electronics & Computers']";

    private String PhonesandAccessoriecsxpath = "(//UL[contains(@class,'hmenu hmenu-visible hmenu-translateX')]/descendant::A[@class='hmenu-item'])[28]";


    /*******************   Getters & Setters **************/

    public void setCookiesxpath() {
        BasePage.findElementByXpath(cookiesxpath).click();
    }

    public void setAllxpath() {
        BasePage.findElementByXpath(Allxpath).click();
    }

    public void setElectronicsandComputersxpath() {
        BasePage.findElementByXpath(ElectronicsandComputersxpath).click();
    }

    public void setPhonesandAccessoriesxpath() {
        BasePage.findElementByXpath(PhonesandAccessoriecsxpath).click();

    }

}



