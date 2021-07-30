package com.test.avianca.steps;

import com.test.avianca.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class OpenPageStep {

    public HomePage homePage;

    @Step
    public void openPage() {
        homePage.open();
    }

    @Step
    public void searchFlight(int sheetNumber, int rowNumber) {
        homePage.searchFlight(sheetNumber, rowNumber);
    }
}
