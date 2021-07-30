package com.test.avianca.pageobjects;

import com.test.avianca.utils.CaptureBasicinformation;
import com.test.avianca.utils.Constants;
import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SummaryPage extends PageObject {

    @FindBy(id = "continue-btn-footer")
    private WebElement continueBtn;

    @FindBy(xpath = "//button[@aria-label='Resumen del viaje']")
    private WebElement buttonCard;

    @FindBy(xpath = "//div[@class='flight-recap-header']//span")
    private WebElement flightInfoLabel;

    @FindBy(xpath = "//div[@class='location-header']")
    private WebElement codDepartureLabel;

    @FindBy(xpath = "(//div[@class='location-header'])[2]")
    private WebElement codReturnLabel;

    //info

    @FindBy(xpath = "//span[@class='bound-locations']")
    private WebElement FlightDepartureResume;

    @FindBy(xpath = "(//span[@class='bound-locations'])[2]")
    private WebElement FlightReturnResume;

    @FindBy(xpath = "//div[@class='bound-date']")
    private WebElement dayOfFlightDeparture ;

    @FindBy(xpath = "(//div[@class='bound-date'])[2]")
    private WebElement dayOfFlightReturn;

    @FindBy(xpath = "(//div[@class='bound-info ng-star-inserted'])[1]")
    private WebElement FlightNumberDeparture ;

    @FindBy(xpath = "(//div[@class='bound-info ng-star-inserted'])[5]")
    private WebElement FlightNumberReturn;

    public void validateText() {
        continueBtn.click();
        buttonCard.click();
        Assert.assertThat(flightInfoLabel.getText(), Matchers.containsString(Constants.TITLE));
        Assert.assertThat(codDepartureLabel.getText(), Matchers.containsString(CaptureBasicinformation.getCodCityOrigin()));
        Assert.assertThat(codReturnLabel.getText(), Matchers.containsString(CaptureBasicinformation.getCodCityDestination()));
        createLog(createLogInformation());
    }

    public String createLogInformation() {
        String text = flightInfoLabel.getText() + "\n" +
        CaptureBasicinformation.getCityOrigin() + " " + codDepartureLabel.getText() + "\n" +
        FlightDepartureResume.getText() + " " + dayOfFlightDeparture.getText() + "\n" +
        "Numero de vuelo salida " + FlightNumberDeparture.getText() + "\n" +
        CaptureBasicinformation.getCityDestination() + " " + codReturnLabel.getText() + "\n" +
        FlightReturnResume.getText() + " " + dayOfFlightReturn.getText() + "\n" +
        "Numero de vuelo regreso " + FlightNumberReturn.getText();
        return text;
    }

    public void createLog(String data) {
        try {
            String ruta = System.getProperty("user.dir") + "/src/test/resources/data/filename.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
