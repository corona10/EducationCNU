package com.riotgames.education.cnu.example.documentation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    private PasswordValidator validator;

    @Test(expected = IllegalArgumentException.class)
    public void givenInvalidMinPasswordLength_illegalArgumentExcpetionIsThrown() throws Exception {
        validator = new PasswordValidator(-1, 0);
    }

    @Test
    public void givenPasswordLengthIsLessTheanThreshold_whenValidate_thenIsInvalid() throws Exception {
        String password = "123";
        validator = new PasswordValidator(4, 0);
        boolean actual = validator.validate(password);

        assertFalse(actual);
    }

    @Test
    public void givenPasswordLengthEqualsThreshold_whenvalidate_thenIsValid() throws Exception {
        String password = "12345";
        validator = new PasswordValidator(5, 0);
        boolean actual = validator.validate(password);

        assertTrue(actual);
    }

    @Test
    public void givenPasswordLengthGreaterThanThreshold_whenvalidate_thenIsValid() throws Exception {
        String password = "12345678910";
        validator = new PasswordValidator(10, 0);
        boolean actual = validator.validate(password);

        assertTrue(actual);
    }

    @Test
    public void givenPasswordValidatorHasMinDigitsSet_whenPasswordHasLessDigits_thenIsInvalid() throws Exception {
        String password = "abcde";
        validator = new PasswordValidator(3, 2);

        boolean actual = validator.validate(password);

        assertFalse(actual);
    }

    @Test
    public void givenPasswordValidatorHasMinDigitsSet_whenPasswordHasEqualNumberOfDigits_thenIsValid() throws Exception {
        String password = "abcde346";
        validator = new PasswordValidator(3, 3);

        boolean actual = validator.validate(password);

        assertTrue(actual);
    }

    @Test
    public void givenPasswordValidatorHasMinDigitsSet_whenPasswordHasMoreThanNumberOfDigits_thenIsValid() throws Exception {
        String password = "5abc6de346";
        validator = new PasswordValidator(3, 1);

        boolean actual = validator.validate(password);

        assertTrue(actual);
    }
}
