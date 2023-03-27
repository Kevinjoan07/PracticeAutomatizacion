package com.saucedemo.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/login.feature",
        glue = "com.saucedemo.StepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Login {
}
