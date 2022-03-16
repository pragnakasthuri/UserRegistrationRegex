package com.bridgelabz;

/**
 * Refactor the code to use Lambda Function to validate user entry
 */

public class UserRegistrationValidateUsingLambdaUtility {
    /**
     * Creating a functional interface
     */
    @FunctionalInterface
    public interface Validate {
        /**
         * Declaring an Abstract method
         */
        boolean validate(String input);
    }

    /**
     * Creating validateFirstName to validate first name using regex using lambda function
     * @return - Validate type
     */
    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    /**
     * Creating validateLastName to validate last name using regex using lambda function
     * @return - Validate type
     */
    public static Validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    /**
     * Creating validateFirstName to validate email using regex using lambda function
     * @return - Validate type
     */
    public static Validate validateEmail() {
        return email -> email.matches("^[a-zA-Z-9]+([._+-]?[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$");
    }

    /**
     * Creating validateFirstName to validate mobile number using regex using lambda function
     * @return - Validate type
     */
    public static Validate validateMobileNumber() {
        return mobileNumber -> mobileNumber.matches("^[0-9]{2}[\\s][0-9]{10}$");
    }

    /**
     * Creating validateFirstName to validate password using regex using lambda function
     * @return - Validate type
     */
    public static Validate validatePassword() {
        return password -> password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                                                   "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$");
    }
}
