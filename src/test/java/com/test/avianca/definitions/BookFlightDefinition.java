package com.test.avianca.definitions;

import com.test.avianca.steps.OpenPageStep;
import com.test.avianca.steps.SelectFlightStep;
import com.test.avianca.steps.CheckFlightInformation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BookFlightDefinition {
    @Steps
    OpenPageStep openPageStep;

    @Steps
    SelectFlightStep selectFlightStep;

    @Steps
    CheckFlightInformation checkFlightInformation;

    @Given("^que ingreso a la pagina Avianca$")
    public void queIngresoLaPaginaAvianca() {
        openPageStep.openPage();
    }

    @When("^realizo la busqueda de un vuelo con la informacion de la (\\d+) y (\\d+)$")
    public void realizo_la_busqueda_de_un_vuelo_con_la_informacion_de_la_y(int sheetNumber, int rowNumber) {
        openPageStep.searchFlight(sheetNumber, rowNumber);
        selectFlightStep.selectFlight();
    }

    @Then("^verifico la informacion del vuelo$")
    public void verificoInformacionDelVuelo() {
        checkFlightInformation.checkFlight();
    }
}
