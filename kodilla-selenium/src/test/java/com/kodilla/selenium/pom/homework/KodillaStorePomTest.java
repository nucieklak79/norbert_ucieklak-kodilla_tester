package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.homework.KodillaStorePom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {
    private static final int NOTEBOOK_EXPECTED_COUNT = 2;
    private static final int SCHOOL_EXPECTED_COUNT = 1;
    private static final int BRAND_EXPECTED_COUNT = 1;
    private static final int BUSINESS_EXPECTED_COUNT = 1;
    private static final int GAMING_EXPECTED_COUNT = 1;
    private static final int POWERFUL_EXPECTED_COUNT = 0;

    KodillaStorePom storePom;

    @BeforeEach
    public void  setup() {
        storePom = new KodillaStorePom();
    }

    @ParameterizedTest
    @CsvSource({
            "NoteBook, " + NOTEBOOK_EXPECTED_COUNT,
            "School, " + SCHOOL_EXPECTED_COUNT,
            "Brand, " + BRAND_EXPECTED_COUNT,
            "Bussines, " + BUSINESS_EXPECTED_COUNT,
            "Gaming, " + GAMING_EXPECTED_COUNT,
            "Powerful, " + POWERFUL_EXPECTED_COUNT
    })
    void testSearchResultsCount(String phrase, int expectedCount) {
        storePom.searchFor(phrase);
        int actualCount = storePom.getResultCount();
               assertEquals(expectedCount, actualCount);
    }
    @ParameterizedTest
    @CsvSource({
            "NoteBook",
            "School",
            "Brand",
            "Bussines",
            "Gaming",
            "Powerful"
    })
    void testCaseInsensitivity(String basePhrase) {

        storePom.searchFor(basePhrase);
        int originalCaseCount = storePom.getResultCount();

        String lowerCasePhrase = basePhrase.toLowerCase();
        storePom.searchFor(lowerCasePhrase);
        int lowerCaseCount = storePom.getResultCount();

        String upperCasePhrase = basePhrase.toUpperCase();
        storePom.searchFor(upperCasePhrase);
        int upperCaseCount = storePom.getResultCount();

        assertEquals(originalCaseCount, lowerCaseCount);

    }

    @AfterEach
    public void chromeClose() {
        storePom.close();
    }

}
