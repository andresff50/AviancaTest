package com.test.avianca.pageobjects;

import com.test.avianca.utils.CaptureBasicinformation;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.avianca.com/co/es/")
public class HomePage extends PageObject {

    @FindBy(xpath = "(//input[@data-msg='Selecciona un origen'])[5]")
    private WebElement originBtn;

    @FindBy(xpath = "//div[@class='bs-list-countries']//li")
    private WebElement originList;

    @FindBy(xpath = "(//input[@data-msg='Selecciona un destino'])[5]")
    private WebElement destinyBtn;

    @FindBy(xpath = "//div[@class='bs-list-countries']//li")
    private WebElement destinyList;

    @FindBy(xpath = "//input[@name='pbFechaIda']")
    private WebElement calendarBtn;

    @FindBy(xpath = "(//button[@title='Buscar vuelos'])[3]")
    private WebElement searchBtn;

    @FindBy(xpath = "(//div[@data-day='2021.8.11'])[2]")
    private WebElement departureDate;

    @FindBy(xpath = "(//div[@data-day='2021.8.31'])[2]")
    private WebElement returnDate;

    public void searchFlight(int sheetNumber, int rowNumber) {
        CaptureBasicinformation.getBasicInformation(sheetNumber, rowNumber);
        waitFor(5).seconds();
        originBtn.click();
        originBtn.sendKeys(CaptureBasicinformation.getCityOrigin());
        originList.click();
        waitFor(2).seconds();
        destinyBtn.click();
        destinyBtn.sendKeys(CaptureBasicinformation.getCityDestination());
        destinyList.click();
        waitFor(2).seconds();
        calendarBtn.click();
        waitFor(2).seconds();
        departureDate.click();
        waitFor(2).seconds();
        returnDate.click();
        searchBtn.click();
    }
}
