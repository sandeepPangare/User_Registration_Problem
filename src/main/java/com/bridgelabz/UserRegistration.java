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
        String regex = "^[a-zA-Z0-9.]+[@][a-zA-Z]{3,}[.][a-zA-Z]{2,5}$";
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
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(phoneNo);
        boolean result = matcher.matches();
        if (result)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }
}