package com.self.learn.tdd.web.bdd.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class WebSteps {
    @Given("I go to Wikipedia homepage")
    @cucumber.api.java.en.Given("^I go to Wikipedia homepage$")
    public void goToWikiPage() {
        open("http://en.wikipedia.org/wiki/Main_Page");
    }

    @When("I enter the value $value on a field named $fieldName")
    @cucumber.api.java.en.When("^I enter the value (.*) on a field named (.*)$")
    public void enterValueOnFieldByName(String value, String fieldName) {
        $(By.name(fieldName)).setValue(value);
    }

    @When("I click the button $buttonName")
    @cucumber.api.java.en.When("^I click the button (.*)$")
    public void clickButtonByName(String buttonName) {
        $(By.name(buttonName)).click();
    }

    @Then("the page title contains $title")
    @cucumber.api.java.en.Then("^the page title contains (.*)$")
    public void pageTitleIs(String title) {
        assertThat(title(), containsString(title));
    }
}
