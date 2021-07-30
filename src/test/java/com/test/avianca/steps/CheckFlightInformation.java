package com.test.avianca.steps;

import com.test.avianca.pageobjects.SummaryPage;
import net.thucydides.core.annotations.Step;

public class CheckFlightInformation {
    public SummaryPage summaryPage;

    @Step
    public void checkFlight() {
        summaryPage.validateText();
    }
}
