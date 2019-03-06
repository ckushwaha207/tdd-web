package com.self.learn.tdd.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class SeleniumTest {
    @Test
    public void wikipediaSearchFeature() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://en.wikipedia.org/wiki/Main_Page");

        WebElement query = driver.findElement(By.name("search"));
        query.sendKeys("Test-driven development");

        WebElement goButton = driver.findElement(By.name("go"));
        goButton.click();

        assertThat(driver.getTitle(), startsWith("Test-driven development"));
        driver.quit();
    }
}
