package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.homework.KodillaStorePom;
import org.junit.jupiter.api.BeforeEach;

public class KodillaStorePomTest {
    private static final int NOTEBOOK_EXPECTED_COUNT = 3;
    private static final int SCHOOL_EXPECTED_COUNT = 2;
    private static final int BRAND_EXPECTED_COUNT = 5;
    private static final int BUSINESS_EXPECTED_COUNT = 2;
    private static final int GAMING_EXPECTED_COUNT = 2;
    private static final int POWERFUL_EXPECTED_COUNT = 1;

    KodillaStorePom storePom;

    @BeforeEach
    public void  setup() {
        storePom = new KodillaStorePom();
    }

}
