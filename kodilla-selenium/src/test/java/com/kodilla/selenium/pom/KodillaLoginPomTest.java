package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KodillaLoginPomTest {
    KodillaLoginPom loginPom;

    @BeforeEach
    public void setup() {
        loginPom = new KodillaLoginPom();
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {
        String email = "test@toniedziala.pl";
        String password = "password";
        boolean loggedIn = loginPom.login(email, password);
        assertFalse(loggedIn);

    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";
        boolean loggedIn = loginPom.login(email, password);
        assertTrue(loggedIn);

    }

    @AfterEach
    public void testDown() {
        loginPom.close();
    }
}
