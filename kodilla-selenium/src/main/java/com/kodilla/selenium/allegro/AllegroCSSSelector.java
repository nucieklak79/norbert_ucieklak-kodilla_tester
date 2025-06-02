package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroCSSSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        WebElement placeToSearch = driver.findElement(By.cssSelector("[data-role=\"search-scope-select\"]"));
        Select electronics = new Select(placeToSearch);
        electronics.selectByValue("Elektronika");

        WebElement searchField = driver.findElement(By.cssSelector("[data-role=\"search-input\"]"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("[data-role=\"search-button\"]"));
        searchButton.submit();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("product-listing-items")));

        List<WebElement> foundProducts = driver.findElements(By.xpath("//article[contains(@class, \"mx7m_1\""));

        for (int i = 0; i < foundProducts.size(); i++) {
            WebElement card = foundProducts.get(i);
            System.out.println("Product no. " + (i + 1) + ":\n" + card.getText() + "\n--------------------");
        }

    }
}
