package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 * As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 * User need to enter a valid email
 * User need to follow pre-defined mobile format
 * User need to follow pre-defined password rules
 * 1.minimum 8 characters
 * 2.Should have at least one upper case
 * 3.Should have at least one numeric character
 * 4.Has exactly one special character
 * Should clear all the email samples provided separately
 */

public class UserInputValidationUtil {
    /**
     * Creating isValidFirstName to validate the first name given by user using regex
     *
     * @param firstName - Taking the input given by user
     * @return - true or false
     */
    public boolean isValidFirstName(String firstName) {
        /**
         * Declaring regex pattern to check the firstName
         */
        String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
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
    public boolean isValidLastName(String lastName) {
        /**
         * Declaring regex pattern to check the lastName
         */
        String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(lastNameRegex);
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
    public boolean isValidEmail(String email) {
        /**
         * Declaring regex pattern to check the email
         */
        String emailRegex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(emailRegex);
        /**
         * Checking fot the pattern match
         */
        Matcher matcher = pattern.matcher(email);
        /**
         * Returns matches result
         */
        return matcher.matches();
    }


    /**
     * Creating isValidMobileNumber to validate the mobile format given by user using regex
     *
     * @param mobileNumber - Taking the input given by user
     * @return - true or false
     */
    public boolean isValidMobileNumber(String mobileNumber) {
        /**
         * Declaring regex pattern to check the mobile number
         */
        String mobileNumberRegex = "^[0-9]{2}[\\s][0-9]{10}$";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        /**
         * Checking fot the pattern match
         */
        Matcher matcher = pattern.matcher(mobileNumber);
        /**
         * Returns matches result
         */
        return matcher.matches();
    }


    /**
     * Creating isValidPassword to validate the password given by user using regex
     *
     * @param password - Taking the input given by user
     * @return - true or false
     */
    public boolean isValidPassword(String password) {
        /**
         * Declaring regex pattern to check the password
         */
        String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                                "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$";
        /**
         * Compiling the regex
         */
        Pattern pattern = Pattern.compile(passwordRegex);
        /**
         * Checking fot the pattern match
         */
        Matcher matcher = pattern.matcher(password);
        /**
         * Returns matches result
         */
        return matcher.matches();
    }
}
