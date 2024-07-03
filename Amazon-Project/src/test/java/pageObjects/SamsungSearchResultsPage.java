package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.management.StringValueExp;
import javax.swing.*;

import static pageObjects.BasePage.findElementByXpath;


public class SamsungSearchResultsPage extends WebConnector {


    /*****************   locators   ******************/

    private String MobilePhonesandSmartPhonesxpath = "//*[normalize-space(.)='Mobile Phones & Smartphones']";

    private String Samsungxpath = "(//DIV[contains(@class,'a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox')]/descendant::I[@class='a-icon a-icon-checkbox'])[149]";
    private String CameraResolutionxpath = "//*[@class='a-size-base a-color-base' and text()='20 MP & above']";
    private String ModelYearxpath = "//SPAN[@class='a-size-base a-color-base' and text()='2023']";
    private String Minpricerangexpath= "//DIV[contains(@class,'a-section s-range-input-container s-lower-bound aok-relative')]/INPUT[@class='s-range-input']";

    private String Maxpricerangexpath = "//DIV[contains(@class,'a-section s-range-input-container s-upper-bound')]/INPUT[@class='s-range-input']";

    private String Goxpath = "//*[@aria-label='Go - Submit price range']";
    private int mPandabove;

    /*******************   Getters & Setters **************/
    public void setMobilePhonesandSmartPhonesxpath() {
        findElementByXpath(MobilePhonesandSmartPhonesxpath).click();
    }

    public void setSamsungxpath() {
        findElementByXpath(Samsungxpath).click();
    }

    public void setCameraResolutionxpath(int MPandabove) {
        findElementByXpath(CameraResolutionxpath).click();

    }

    public void setModelYearxpath(int year2023) {
        findElementByXpath(ModelYearxpath).click();
    }

    public void setMinpricerangexpath(int pricerange50) {
       WebElement slider = BasePage. findElementByXpath(String.valueOf(Minpricerangexpath));
       Actions action = new Actions(driver);
        action.dragAndDropBy(slider, pricerange50, 0).perform();


    }
    public void setMaxpricerangexpath(int pricerange100) {
      WebElement slider= BasePage.findElementByXpath(String.valueOf(Maxpricerangexpath));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, pricerange100, 0).perform();

    }

    public void setGoxpath() {
        findElementByXpath(Goxpath);
    }
}
