package com.bridgelabz;

import com.bridgelabz.exceptions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class UserRegistration {

    /**
     * Main method from where the execution starts
     *
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1.Creating UserInputValidationUtil object
         * 2.Creating BufferedReader object
         * 3.Taking input from user and storing it in firstName
         * 4.Printing Valid if given first name is valid , Invalid otherwise
         * 5.Taking input from user and storing it in lastName
         * 6.Printing Valid if given last name is valid , Invalid otherwise
         * 7.Taking input from user and storing it in email
         * 8.Printing Valid if given email is valid , Invalid otherwise
         * 9.Taking input from user and storing it in mobileNumber
         * 10.Printing Valid if given mobile number is valid , Invalid otherwise
         * 11.Taking input from user and storing it in password
         * 12.Printing Valid if given password is valid , Invalid otherwise
         * 13.Closing the bufferedReader object
         */

        /**
         * 1.Creating UserInputValidationUtil object
         */
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        /**
         * 2.Creating BufferedReader object
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("******* FIRSTNAME VALIDATION *******");
            /**
             * 3.Taking input from user and storing it in firstName
             */
            System.out.println("Please Enter first name: ");
            String firstName = bufferedReader.readLine();
            /**
             * 4.Printing Valid if given first name is valid , Invalid otherwise
             */

            try {
                System.out.println(userInputValidationUtil.isValidFirstName(firstName) ? "Valid" : "InValid");
            } catch (InvalidFirstNameException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("******* LASTNAME VALIDATION *******");
            /**
             * 5.Taking input from user and storing it in lastName
             */
            System.out.println("Please Enter last name: ");
            String lastName = bufferedReader.readLine();
            /**
             * 6.Printing Valid if given last name is valid , Invalid otherwise
             */
            try {
                System.out.println(userInputValidationUtil.isValidLastName(lastName) ? "Valid" : "InValid");
            } catch (InvalidLastNameException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("******* EMAIL VALIDATION *******");
            /**
             * 7.Taking input from user and storing it in email
             */
            System.out.println("Please Enter email: ");
            String email = bufferedReader.readLine();
            /**
             * 8.Printing Valid if given email is valid , Invalid otherwise
             */
            try {
                System.out.println(userInputValidationUtil.isValidEmail(email) ? "Valid" : "InValid");
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("******* MOBILE FORMAT VALIDATION *******");
            /**
             * 9.Taking input from user and storing it in mobileNumber
             */
            System.out.println("Please Enter Mobile Number: ");
            String mobileNumber = bufferedReader.readLine();
            /**
             * 10.Printing Valid if given mobile number is valid , Invalid otherwise
             */
            try {
                System.out.println(userInputValidationUtil.isValidMobileNumber(mobileNumber) ? "Valid" : "InValid");
            } catch (InvalidMobileNumberException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("******* PASSWORD VALIDATION *******");
            /**
             *11.Taking input from user and storing it in password
             */
            System.out.println("Please Enter Password: ");
            String password = bufferedReader.readLine();
            /**
             * 12.Printing Valid if given password is valid , Invalid otherwise
             */
            try {
                System.out.println(userInputValidationUtil.isValidPassword(password) ? "Valid" : "InValid");
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            /**
             * 13.Closing the bufferedReader object
             */
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
