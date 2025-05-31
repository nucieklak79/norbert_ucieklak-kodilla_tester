package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/sign-in");
        WebElement emailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailField.sendKeys("test@kodilla.com");

        WebElement passField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passField.sendKeys("kodilla123");

        WebElement subButton = driver.findElement(By.xpath("//html/body/section/form/button"));
        subButton.submit();

    }
}
