package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebElement ebaySearchField = driver.findElement(By.id("gh-ac"));
        ebaySearchField.sendKeys("Laptop");
        ebaySearchField.submit();
    }
}
