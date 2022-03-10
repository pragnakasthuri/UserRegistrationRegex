package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 */

public class UserInputValidationUtil {
    /**
     * Creating isValidFirstName to validate the first name given by user using regex
     *
     * @param firstName - Taking the input given by user
     * @return - true or false
     */
    public static boolean isValidFirstName(String firstName) {
        /**
         * Declaring regex pattern to check the firstName
         */
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(firstNameRegex);
        /**
         * Checking fot the pattern match
         */
        Matcher matcher = pattern.matcher(firstName);
        /**
         * Returns matches result
         */
        return matcher.matches();
    }
}
