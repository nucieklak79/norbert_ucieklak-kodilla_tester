package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        WebElement placeToSearch = driver.findElement(By.xpath("//*[contains(@class, \"msts_pt\"]"));
        Select electronics = new Select(placeToSearch);
        electronics.selectByValue("Elektronika");

        WebElement searchField = driver.findElement(By.xpath("//*[contains(@class, \"m7er_k4\"]"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label=\"Szukaj\""));
        searchButton.submit();

        // Niestety, przy uruchomieniu aplikacji, uruchamia się na Allegro system anty-botowy.

    }
}
