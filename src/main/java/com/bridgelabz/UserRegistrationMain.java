package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void welcome(){
        System.out.println("Welcome to User Registration System Problem");
    }
    public static void main(String[] args) {
        welcome(); //calling static method
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name:\nEnter 2: To validate Last Name:\nEnter 3: validate email: \nEnter 4 : to validate Mobile Number: \nEnter 5: validate passwordRule1: \n6. Validate Password Rule2 : \n7. Validate Password Rule3 : \n8. Validate Password Rule4 : ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmail();
                break;
            case 4:
                UserRegistration.validMobileNumber();
                break;
            case 5:
                UserRegistration.validPasswordRule1();
                break;
            case 6:
                UserRegistration.validPasswordRule2();
                break;
            case 7:
                UserRegistration.validPasswordRule3();
                break;
            case 8:
                UserRegistration.validPasswordRule4();
                break;
        }
    }
}