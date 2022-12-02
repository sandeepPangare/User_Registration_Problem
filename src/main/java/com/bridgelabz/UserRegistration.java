package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean validFirstName() {
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches(); //compare and store result

        if (result)
            System.out.println("First name is valid");
        else
            System.out.println("First name is !Invalid");
        return result;
    }
    public static boolean validLastName() {
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches(); //compare and store result

        if (result)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is !Invalid");
        return result;
    }
    public static boolean validEmail() {

        System.out.println("Enter EMail: ");
        String EMail = scanner.next();
        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(EMail);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Email is Valid");
        else
            System.out.println("Email is Invalid");

        return result;
    }
    public static void validMobileNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        String regex = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        boolean result = matcher.matches();
        if (result)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }
    public static boolean validPasswordRule1() {
        /*Valid Password
        Rule1-Minimum 8 character
         */
        System.out.println("Enter Password: ");
        String Password = scanner.next();;
        String regex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
        return result;
    }
    public static void validPasswordRule2() {
        System.out.print("Enter Password Rule2 : ");
        /*
        Should have at least 1 Upper Case
         */
        String passwordRule2 = scanner.nextLine();
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password Rule2 is valid");
        else
            System.out.println("Password is Invalid");
    }
    public static void validPasswordRule3() {
        System.out.print("Enter Password Rule3 : ");
        /*
        Should have at least 1 numeric number in the password
         */
        String passwordRule3 = scanner.nextLine();
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password Rule3 is valid");
        else
            System.out.println("Password is Invalid");
    }
    public static void validPasswordRule4() {
        System.out.print("Enter Password Rule4 : ");
        /*
        Has exactly 1 Special Character
         */
        String passwordRule4 = scanner.nextLine();
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule4);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password Rule4 is valid");
        else
            System.out.println("Password is Invalid");
    }
}