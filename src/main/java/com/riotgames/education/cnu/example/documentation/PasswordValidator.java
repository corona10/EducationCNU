package com.riotgames.education.cnu.example.documentation;

public class PasswordValidator {

    private final int minDigits;
    private final int minLength;
    private final int maxLength;

    public PasswordValidator(int minLength, int maxLength, int minDigits) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Password Validator min password length cannot be a negative number");
        }

        this.minLength = minLength;
        this.minDigits = minDigits;
        this.maxLength = maxLength;
    }

    public boolean validate(String password) {
        return password.length() >= minLength && password.length() <= maxLength && hasValidDigitCount(password);
    }

    private boolean hasValidDigitCount(String password) {
        int digitCount = (int) password.chars()
                .mapToObj(i -> (char)i)
                .filter(Character::isDigit)
                .count();
        return digitCount >= minDigits;
    }
}
