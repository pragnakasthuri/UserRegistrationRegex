package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 * As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 * User need to enter a valid email
 * User need to follow pre-defined mobile format
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
         * 11.Closing the BufferedReader object
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
            System.out.println("Enter first name: ");
            String firstName = bufferedReader.readLine();
            /**
             * 4.Printing Valid if given first name is valid , Invalid otherwise
             */
            System.out.println(userInputValidationUtil.isValidFirstName(firstName) ? "Valid" : "InValid");


            System.out.println("******* LASTNAME VALIDATION *******");
            /**
             * 5.Taking input from user and storing it in lastName
             */
            System.out.println("Enter last name: ");
            String lastName = bufferedReader.readLine();
            /**
             * 6.Printing Valid if given last name is valid , Invalid otherwise
             */
            System.out.println(userInputValidationUtil.isValidLastName(lastName) ? "Valid" : "InValid");


            System.out.println("******* EMAIL VALIDATION *******");
            /**
             * 7.Taking input from user and storing it in email
             */
            System.out.println("Enter email: ");
            String email = bufferedReader.readLine();
            /**
             * 8.Printing Valid if given email is valid , Invalid otherwise
             */
            System.out.println(userInputValidationUtil.isValidEmail(email) ? "Valid" : "InValid");


            System.out.println("******* MOBILE FORMAT VALIDATION *******");
            /**
             * 9.Taking input from user and storing it in mobileNumber
             */
            System.out.println("Enter Mobile Number: ");
            String mobileNumber = bufferedReader.readLine();
            /**
             * 10.Printing Valid if given mobile number is valid , Invalid otherwise
             */
            System.out.println(userInputValidationUtil.isValidMobileNumber(mobileNumber) ? "Valid" : "InValid");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try{
            /**
             * 11.Closing the bufferedReader object
             */
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
