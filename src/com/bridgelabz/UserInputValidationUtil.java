package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 * As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 * User need to enter a valid email
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

    /**
     * Creating isValidLastName to validate the last name given by user using regex
     *
     * @param lastName - Taking the input given by user
     * @return - true or false
     */
    public static boolean isValidLastName(String lastName) {
        /**
         * Declaring regex pattern to check the lastName
         */
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(firstNameRegex);
        /**
         * Checking fot the pattern match
         */
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Returns matches result
         */
        return matcher.matches();
    }
    /**
     * Creating isValidEmail to validate the email given by user using regex
     *
     * @param email - Taking the input given by user
     * @return - true or false
     */
    public static boolean isValidEmail(String email) {
        /**
         * Declaring regex pattern to check the email
         */
        String firstNameRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                                "(?:(\\.([A-Za-z]{2})))?$";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(firstNameRegex);
        /**
         * Checking fot the pattern match
         */
        Matcher matcher = pattern.matcher(email);
        /**
         * Returns matches result
         */
        return matcher.matches();
    }
}
