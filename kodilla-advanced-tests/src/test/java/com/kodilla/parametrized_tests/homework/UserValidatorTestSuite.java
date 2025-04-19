package com.kodilla.parametrized_tests.homework;
import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    //Tests for validateUsername() method
    @ParameterizedTest
    @ValueSource(strings = {
            "abc", "ABC", "123", "user1", "user_name", "user-name", "user.name",
            "a-b", "a_b", "a.b", "TestUser123._-"})
    void validateUsername_shouldReturnTrue_forValidUsernames(String validUsername) {
        assertTrue(validator.validateUsername(validUsername));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "ab", // too short
            "a",  // too short
            " ",   // (empty string)
            "user name", // space in between
            "user@domain", // @
            "user!", //  !
            "ążśź" // letters other than a-zA-Z0-9._-
    })

    void validateUsername_shouldReturnFalse_forInvalidUsernames(String invalidUserName) {
        assertFalse(validator.validateUsername(invalidUserName));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void validUsername_shouldReturnFalse_forNullAndEmptyNames(String username) {
        assertFalse(validator.validateUsername(username));
    }
    //Tests for validateEmail() method
    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "firstname.lastname@example.com",
            "email@subdomain.example.com",
            "firstname_lastname@example.com",
            "email@example.co.jp",
            "firstname-lastname@example.com",
            "user_name@example.com",
            "1234567890@example.com",
            "email@example-one.com",
            "_______@example.com",
            "email@example.name",
            "email@example.museum",
            "email@example.co",
            "email@example.info"
    })
    void validateEmail_shouldReturnTrue_forValidEmails(String validEmail) {
        assertTrue(validator.validateEmail(validEmail));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "plainaddress",
            "#@%^%#$@#$@#.com",
            "@example.com",
            "email.example.com",
            "email@example@example.com",
            ".email@example.com",
            "email.@example.com",
            "email..email@example.com",
            "あいうえお@example.com",
            "email@example.com (Joe Smith)",
            "email@example",
            "email@$example.com",
            "email@example.",
            "email@example..com",
            "email@111.222.333.444",
            "email@example.abcdefg",
            "firstname+lastname@example.com"
    })
    void validateEmail_shouldReturnFalse_forInvalidEmails(String invalidEmail) {
        assertFalse(validator.validateEmail(invalidEmail));
    }

    @ParameterizedTest
    @NullSource
    void validateEmail_shouldReturnFalse_forNullInput(String nullEmail) {
        assertFalse(validator.validateEmail(nullEmail));
    }

}
