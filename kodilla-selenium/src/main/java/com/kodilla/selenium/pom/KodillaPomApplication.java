package com.kodilla.selenium.pom;

public class KodillaPomApplication {
    public static void main(String[] args) {
        KodillaLoginPom loginPom = new KodillaLoginPom();
        loginPom.login("test@kodilla.com", "kodilla123");
    }
}
