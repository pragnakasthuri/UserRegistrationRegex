package com.bridgelabz;

import java.util.Scanner;

/**
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 * As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 */

public class UserRegistration {

    /**
     * main method from where the execution starts
     *
     * @param args - default java param
     */
    public static void main(String[] args) {

        /**
         * PROCEDURE:
         * 1.Creating UserInputValidationUtil object
         * 2.Creating Scanner object
         * 3.Taking input from user and storing it in firstName
         * 4.Printing Valid if given first name is valid , In valid otherwise
         * 5.Taking input from user and storing it in lastName
         * 6.Closing the scanner object
         * 7.Printing Valid if given last name is valid , In valid otherwise
         */

        /**
         * 1.Creating UserInputValidationUtil object
         */
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        /**
         * 2.Creating Scanner object
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * 3.Taking input from user and storing it in firstName
         */
        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        /**
         * 4.Printing Valid if given first name is valid , In valid otherwise
         */
        System.out.println(userInputValidationUtil.isValidFirstName(firstName) ? "Valid" : "In Valid");
        /**
         * 5.Taking input from user and storing it in lastName
         */
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        /**
         * 6.Closing the scanner object
         */
        scanner.close();
        /**
         * 7.Printing Valid if given last name is valid , In valid otherwise
         */
        System.out.println(userInputValidationUtil.isValidLastName(lastName) ? "Valid" : "In Valid");
    }
}
