package com.test.avianca.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectFlightPage extends PageObject {
//    private static Logger LOGGER = LoggerFactory.getLogger(SelectFlightPage.class);

    @FindBy(xpath = "//button[@class='select-cabin-button']")
    private WebElement economicalFlightBtn;

    @FindBy(xpath = "(//div[@class='ff-attributes']//button)[2]")
    private WebElement lightTravelBtn;

    @FindBy(xpath = "//div[contains(@class, 'cro-button cro-n')]")
    private WebElement acceptRate;

    public void selectFlightOptions() {
        waitFor(7).seconds();
        economicalFlightBtn.click();
        waitFor(7).seconds();
        lightTravelBtn.click();
        waitFor(7).seconds();
        acceptRate.click();
    }
//    public void generarLog() {
//        LOGGER.info("This is an info level log message!");
//        //logger.info($("//h1").getText());
//    }
}
