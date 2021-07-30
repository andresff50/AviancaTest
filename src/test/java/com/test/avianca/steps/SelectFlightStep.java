package com.test.avianca.steps;

import com.test.avianca.pageobjects.SelectFlightPage;
import net.thucydides.core.annotations.Step;

public class SelectFlightStep {
    public SelectFlightPage selectFlightPage;

    @Step
    public void selectFlight() {
        selectFlightPage.selectFlightOptions();
        selectFlightPage.selectFlightOptions();
        //selectFlightPage.generarLog();
    }
}
