package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration extends Throwable {

    public static boolean validFirstName(String name) throws  Invalid_InputDetailsException {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("first Name should start with a Cap and should have minimum 3 characters");
        }
        else {
            return true;
        }

    }

    public static boolean validLastName(String name) throws Invalid_InputDetailsException {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Last Name should start with a Cap and should have minimum 3 chars");
        }
        else {
            return true;
        }
    }

    public static boolean validEmail(String email) throws Invalid_InputDetailsException {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Enter a valid email address");
        }
        else {
            return true;
        }
    }

    public static boolean validMobileNumber(String mobileNo) throws Invalid_InputDetailsException {
        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Enter the Valid Mobile number with county code");
        }
        else {
            return true;
        }
    }

    public static boolean validPasswordRule1(String passwordRule1) throws Invalid_InputDetailsException {
        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule1);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must have 8 character");
        }
        else {
            return true;
        }
    }

    public static boolean validPasswordRule2(String passwordRule2) throws Invalid_InputDetailsException {
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must have atleast one uppercase letter");
        }
        else {
            return true;
        }
    }

    public static boolean validPasswordRule3(String passwordRule3) throws Invalid_InputDetailsException {
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must have atleast one numeric number");
        }
        else {
            return true;
        }
    }

    public static boolean validPasswordRule4(String passwordRule4) throws Invalid_InputDetailsException {
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule4);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must has exactly one special character");
        }
        else {
            return true;
        }
    }
}