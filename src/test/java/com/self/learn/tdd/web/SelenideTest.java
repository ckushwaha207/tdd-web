package com.self.learn.tdd.web;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class SelenideTest {
    @Test
    public void wikipediaSearchTest() {
        open("http://en.wikipedia.org/wiki/Main_Page");

        $(By.name("search")).setValue("Test-driven development");

        $(By.name("go")).click();

        assertThat(title(), startsWith("Test-driven development"));
    }
}
