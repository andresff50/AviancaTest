package com.test.avianca.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/avianca_test.feature",
        glue = "com.test.avianca.definitions",
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class BookFlight {
}
