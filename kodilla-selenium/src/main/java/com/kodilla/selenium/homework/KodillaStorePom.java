package com.kodilla.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom {
    WebDriver driver;

    @FindBy(css = "input[id='searchField']")
    WebElement searchField;

    public KodillaStorePom() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/store");
    }

    public void searchFor(String phrase) {
        searchField.clear();
        searchField.sendKeys(phrase);
    }
    public int getResuldCount() {
        List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, \"element\")]"));
        return result.size();

    }
    public void close() {
        driver.close();
    }
}
