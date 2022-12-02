package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean validFirstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validLastName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validEmail(String email) {
        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validMobileNumber(String mobileNo) {
        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule1(String passwordRule1) {
        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule1);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule2(String passwordRule2) {
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule3(String passwordRule3) {
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule4(String passwordRule4) {
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule4);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }
    public static boolean validEmailSamples(String EmailSamples) {
        System.out.print("Enter Email Sample : ");
        /*
        1. abc@yahoo.com,2. abc-100@yahoo.com,3. abc.100@yahoo.com 2. abc111@abc.com,4. abc-100@abc.net,
        5. abc.100@abc.com.au6. abc@1.com,7. abc@gmail.com.com8. abc+100@gmail.com
         */
        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(EmailSamples);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }
}